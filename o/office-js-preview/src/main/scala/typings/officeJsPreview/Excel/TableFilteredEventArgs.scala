package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.TableFiltered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the table that raised the filter applied event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait TableFilteredEventArgs extends StObject {
  
  /**
    *
    * Gets the id of the table in which the filter is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tableId: String = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: TableFiltered = js.native
  
  /**
    *
    * Gets the id of the worksheet which contains the table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String = js.native
}
object TableFilteredEventArgs {
  
  @scala.inline
  def apply(tableId: String, `type`: TableFiltered, worksheetId: String): TableFilteredEventArgs = {
    val __obj = js.Dynamic.literal(tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFilteredEventArgs]
  }
  
  @scala.inline
  implicit class TableFilteredEventArgsMutableBuilder[Self <: TableFilteredEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TableFiltered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
