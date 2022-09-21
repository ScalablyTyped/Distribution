package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyNameGivenName extends StObject {
  
  var familyName: js.UndefOr[String] = js.undefined
  
  var givenName: js.UndefOr[String] = js.undefined
}
object FamilyNameGivenName {
  
  inline def apply(): FamilyNameGivenName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyNameGivenName]
  }
  
  extension [Self <: FamilyNameGivenName](x: Self) {
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
  }
}
