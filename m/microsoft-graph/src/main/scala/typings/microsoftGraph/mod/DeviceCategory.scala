package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCategory
  extends StObject
     with Entity {
  
  // Optional description for the device category.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name for the device category.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceCategory {
  
  inline def apply(): DeviceCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceCategory] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
