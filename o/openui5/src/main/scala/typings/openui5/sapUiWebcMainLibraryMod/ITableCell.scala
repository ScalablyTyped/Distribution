package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITableCell extends StObject {
  
  var __implements__sap_ui_webc_main_ITableCell: Boolean
}
object ITableCell {
  
  inline def apply(__implements__sap_ui_webc_main_ITableCell: Boolean): ITableCell = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_main_ITableCell = __implements__sap_ui_webc_main_ITableCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITableCell] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_webc_main_ITableCell(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_main_ITableCell", value.asInstanceOf[js.Any])
  }
}
