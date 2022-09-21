package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  var display: Boolean
  
  var displayName: String
  
  var displayOrder: Double
  
  var permissionControlEnabled: Boolean
}
object Display {
  
  inline def apply(display: Boolean, displayName: String, displayOrder: Double, permissionControlEnabled: Boolean): Display = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayOrder = displayOrder.asInstanceOf[js.Any], permissionControlEnabled = permissionControlEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  extension [Self <: Display](x: Self) {
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayOrder(value: Double): Self = StObject.set(x, "displayOrder", value.asInstanceOf[js.Any])
    
    inline def setPermissionControlEnabled(value: Boolean): Self = StObject.set(x, "permissionControlEnabled", value.asInstanceOf[js.Any])
  }
}
