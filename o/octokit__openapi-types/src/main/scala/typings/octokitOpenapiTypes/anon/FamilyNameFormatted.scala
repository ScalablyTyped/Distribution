package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyNameFormatted extends StObject {
  
  var familyName: String | Null
  
  var formatted: js.UndefOr[String | Null] = js.undefined
  
  var givenName: String | Null
}
object FamilyNameFormatted {
  
  inline def apply(): FamilyNameFormatted = {
    val __obj = js.Dynamic.literal(familyName = null, givenName = null)
    __obj.asInstanceOf[FamilyNameFormatted]
  }
  
  extension [Self <: FamilyNameFormatted](x: Self) {
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameNull: Self = StObject.set(x, "familyName", null)
    
    inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedNull: Self = StObject.set(x, "formatted", null)
    
    inline def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameNull: Self = StObject.set(x, "givenName", null)
  }
}
