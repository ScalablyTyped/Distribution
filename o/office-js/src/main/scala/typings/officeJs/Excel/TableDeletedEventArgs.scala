package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Local
import typings.officeJs.officeJsStrings.Remote
import typings.officeJs.officeJsStrings.TableDeleted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the table that raised the deleted event.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait TableDeletedEventArgs extends StObject {
  
  /**
    * Gets the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the ID of the table that is deleted.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tableId: String
  
  /**
    * Gets the name of the table that is deleted.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tableName: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: TableDeleted
  
  /**
    * Gets the ID of the worksheet in which the table is deleted.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}
object TableDeletedEventArgs {
  
  inline def apply(source: EventSource | Local | Remote, tableId: String, tableName: String, worksheetId: String): TableDeletedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableDeleted")
    __obj.asInstanceOf[TableDeletedEventArgs]
  }
  
  extension [Self <: TableDeletedEventArgs](x: Self) {
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setType(value: TableDeleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
