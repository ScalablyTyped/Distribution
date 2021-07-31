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
    
    @scala.inline
    def apply(): FamilyName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FamilyName]
    }
    
    @scala.inline
    implicit class FamilyNameMutableBuilder[Self <: FamilyName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
      
      @scala.inline
      def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      
      @scala.inline
      def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    }
  }
  
  trait Iv extends StObject {
    
    var iv: String
    
    var key: String
  }
  object Iv {
    
    @scala.inline
    def apply(iv: String, key: String): Iv = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iv]
    }
    
    @scala.inline
    implicit class IvMutableBuilder[Self <: Iv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
