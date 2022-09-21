package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.TableFiltered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the table that raised the filter applied event.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait TableFilteredEventArgs extends StObject {
  
  /**
    * Gets the ID of the table in which the filter is applied.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tableId: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: TableFiltered
  
  /**
    * Gets the ID of the worksheet which contains the table.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String
}
object TableFilteredEventArgs {
  
  inline def apply(tableId: String, worksheetId: String): TableFilteredEventArgs = {
    val __obj = js.Dynamic.literal(tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableFiltered")
    __obj.asInstanceOf[TableFilteredEventArgs]
  }
  
  extension [Self <: TableFilteredEventArgs](x: Self) {
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setType(value: TableFiltered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
