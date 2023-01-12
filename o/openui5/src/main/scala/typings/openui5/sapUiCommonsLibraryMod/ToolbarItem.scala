package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarItem extends StObject {
  
  var __implements__sap_ui_commons_ToolbarItem: Boolean
}
object ToolbarItem {
  
  inline def apply(__implements__sap_ui_commons_ToolbarItem: Boolean): ToolbarItem = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_commons_ToolbarItem = __implements__sap_ui_commons_ToolbarItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolbarItem] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_commons_ToolbarItem(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_commons_ToolbarItem", value.asInstanceOf[js.Any])
  }
}
