package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTableRowRequest extends StObject {
  
  /**
    * The reference table cell location from which the row will be deleted. The row this cell spans will be deleted. If this is a merged cell that spans multiple rows, all rows that the
    * cell spans will be deleted. If no rows remain in the table after this deletion, the whole table is deleted.
    */
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.native
}
object DeleteTableRowRequest {
  
  @scala.inline
  def apply(): DeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableRowRequest]
  }
  
  @scala.inline
  implicit class DeleteTableRowRequestMutableBuilder[Self <: DeleteTableRowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableCellLocation(value: TableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
  }
}
