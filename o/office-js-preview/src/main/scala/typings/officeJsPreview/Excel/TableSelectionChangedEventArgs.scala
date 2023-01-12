package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.TableSelectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the table that raised the selection changed event.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait TableSelectionChangedEventArgs extends StObject {
  
  /**
    * Gets the range address that represents the selected area of the table on a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var address: String
  
  /**
    * Specifies if the selection is inside a table. `IsInsideTable` must be set to `true` for the address to be useful.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var isInsideTable: Boolean
  
  /**
    * Gets the ID of the table in which the selection changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tableId: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: TableSelectionChanged
  
  /**
    * Gets the ID of the worksheet in which the selection changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}
object TableSelectionChangedEventArgs {
  
  inline def apply(address: String, isInsideTable: Boolean, tableId: String, worksheetId: String): TableSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], isInsideTable = isInsideTable.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableSelectionChanged")
    __obj.asInstanceOf[TableSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setIsInsideTable(value: Boolean): Self = StObject.set(x, "isInsideTable", value.asInstanceOf[js.Any])
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setType(value: TableSelectionChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
