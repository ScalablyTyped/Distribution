package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IListItem extends StObject {
  
  var __implements__sap_ui_webc_main_IListItem: Boolean
}
object IListItem {
  
  inline def apply(__implements__sap_ui_webc_main_IListItem: Boolean): IListItem = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_main_IListItem = __implements__sap_ui_webc_main_IListItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IListItem] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_webc_main_IListItem(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_main_IListItem", value.asInstanceOf[js.Any])
  }
}
