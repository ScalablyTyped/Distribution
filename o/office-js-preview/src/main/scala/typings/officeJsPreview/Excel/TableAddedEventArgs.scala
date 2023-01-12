package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.TableAdded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the table that raised the added event.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait TableAddedEventArgs extends StObject {
  
  /**
    * Gets the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the ID of the table that is added.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tableId: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: TableAdded
  
  /**
    * Gets the ID of the worksheet in which the table is added.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}
object TableAddedEventArgs {
  
  inline def apply(source: EventSource | Local | Remote, tableId: String, worksheetId: String): TableAddedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableAdded")
    __obj.asInstanceOf[TableAddedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableAddedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setType(value: TableAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
