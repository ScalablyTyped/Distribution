package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITableColumn extends StObject {
  
  var __implements__sap_ui_webc_main_ITableColumn: Boolean
}
object ITableColumn {
  
  inline def apply(__implements__sap_ui_webc_main_ITableColumn: Boolean): ITableColumn = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_webc_main_ITableColumn = __implements__sap_ui_webc_main_ITableColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableColumn]
  }
  
  extension [Self <: ITableColumn](x: Self) {
    
    inline def set__implements__sap_ui_webc_main_ITableColumn(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_webc_main_ITableColumn", value.asInstanceOf[js.Any])
  }
}
