package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.TableSelectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the table that raised the SelectionChanged event.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait TableSelectionChangedEventArgs extends StObject {
  
  /**
    *
    * Gets the range address that represents the selected area of the table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: String = js.native
  
  /**
    *
    * Specifies if the selection is inside a table, address will be useless if IsInsideTable is false.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isInsideTable: Boolean = js.native
  
  /**
    *
    * Gets the id of the table in which the selection changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tableId: String = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: TableSelectionChanged = js.native
  
  /**
    *
    * Gets the id of the worksheet in which the selection changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String = js.native
}
object TableSelectionChangedEventArgs {
  
  @scala.inline
  def apply(
    address: String,
    isInsideTable: Boolean,
    tableId: String,
    `type`: TableSelectionChanged,
    worksheetId: String
  ): TableSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], isInsideTable = isInsideTable.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class TableSelectionChangedEventArgsMutableBuilder[Self <: TableSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInsideTable(value: Boolean): Self = StObject.set(x, "isInsideTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TableSelectionChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
