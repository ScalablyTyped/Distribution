package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmaSetting extends StObject {
  
  // Description.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display Name.
  var displayName: js.UndefOr[String] = js.undefined
  
  // OMA.
  var omaUri: js.UndefOr[String] = js.undefined
}
object OmaSetting {
  
  inline def apply(): OmaSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSetting]
  }
  
  extension [Self <: OmaSetting](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setOmaUri(value: String): Self = StObject.set(x, "omaUri", value.asInstanceOf[js.Any])
    
    inline def setOmaUriUndefined: Self = StObject.set(x, "omaUri", js.undefined)
  }
}
