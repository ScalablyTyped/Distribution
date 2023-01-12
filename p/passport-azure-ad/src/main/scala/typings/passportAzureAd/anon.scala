package typings.passportAzureAd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FamilyName extends StObject {
    
    var familyName: js.UndefOr[String] = js.undefined
    
    var givenName: js.UndefOr[String] = js.undefined
    
    var middleName: js.UndefOr[String] = js.undefined
  }
  object FamilyName {
    
    inline def apply(): FamilyName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FamilyName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FamilyName] (val x: Self) extends AnyVal {
      
      inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      
      inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    }
  }
  
  trait Iv extends StObject {
    
    var iv: String
    
    var key: String
  }
  object Iv {
    
    inline def apply(iv: String, key: String): Iv = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Iv] (val x: Self) extends AnyVal {
      
      inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
