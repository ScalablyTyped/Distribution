package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISegmentedButtonItem extends StObject {
  
  var __implements__sap_ui_webc_main_ISegmentedButtonItem: Boolean
}
object ISegmentedButtonItem {
  
  inline def apply(__implements__sap_ui_webc_main_ISegmentedButtonItem: Boolean): ISegmentedButtonItem = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_main_ISegmentedButtonItem = __implements__sap_ui_webc_main_ISegmentedButtonItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISegmentedButtonItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISegmentedButtonItem] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_webc_main_ISegmentedButtonItem(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_main_ISegmentedButtonItem", value.asInstanceOf[js.Any])
  }
}
