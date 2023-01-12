package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  var display: Boolean
  
  var displayName: String
  
  var displayOrder: Double
  
  var permissionControlEnabled: Boolean
  
  var tooltip: String
}
object Display {
  
  inline def apply(
    display: Boolean,
    displayName: String,
    displayOrder: Double,
    permissionControlEnabled: Boolean,
    tooltip: String
  ): Display = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayOrder = displayOrder.asInstanceOf[js.Any], permissionControlEnabled = permissionControlEnabled.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayOrder(value: Double): Self = StObject.set(x, "displayOrder", value.asInstanceOf[js.Any])
    
    inline def setPermissionControlEnabled(value: Boolean): Self = StObject.set(x, "permissionControlEnabled", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
