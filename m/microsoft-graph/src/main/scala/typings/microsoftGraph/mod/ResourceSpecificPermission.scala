package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSpecificPermission extends StObject {
  
  // Describes the level of access that the resource-specific permission represents.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name for the resource-specific permission.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the resource-specific application permission.
  var id: js.UndefOr[String] = js.undefined
  
  // Indicates whether the permission is enabled.
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  // The value of the permission.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResourceSpecificPermission {
  
  inline def apply(): ResourceSpecificPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSpecificPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceSpecificPermission] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
