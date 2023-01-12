package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITableRow extends StObject {
  
  var __implements__sap_ui_webc_main_ITableRow: Boolean
}
object ITableRow {
  
  inline def apply(__implements__sap_ui_webc_main_ITableRow: Boolean): ITableRow = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_main_ITableRow = __implements__sap_ui_webc_main_ITableRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITableRow] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_webc_main_ITableRow(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_main_ITableRow", value.asInstanceOf[js.Any])
  }
}
