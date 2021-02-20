package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.TableDeleted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the table that raised the OnDeleted event.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait TableDeletedEventArgs extends StObject {
  
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the id of the table that is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableId: String = js.native
  
  /**
    *
    * Gets the name of the table that is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableName: String = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: TableDeleted = js.native
  
  /**
    *
    * Gets the id of the worksheet in which the table is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String = js.native
}
object TableDeletedEventArgs {
  
  @scala.inline
  def apply(
    source: EventSource | Local | Remote,
    tableId: String,
    tableName: String,
    `type`: TableDeleted,
    worksheetId: String
  ): TableDeletedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDeletedEventArgs]
  }
  
  @scala.inline
  implicit class TableDeletedEventArgsMutableBuilder[Self <: TableDeletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TableDeleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
