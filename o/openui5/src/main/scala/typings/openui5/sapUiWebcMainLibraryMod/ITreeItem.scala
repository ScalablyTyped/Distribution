package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITreeItem extends StObject {
  
  var __implements__sap_ui_webc_main_ITreeItem: Boolean
}
object ITreeItem {
  
  inline def apply(__implements__sap_ui_webc_main_ITreeItem: Boolean): ITreeItem = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_main_ITreeItem = __implements__sap_ui_webc_main_ITreeItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITreeItem] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_webc_main_ITreeItem(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_main_ITreeItem", value.asInstanceOf[js.Any])
  }
}
