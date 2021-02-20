package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCellLocation extends StObject {
  
  /** The zero-based column index. For example, the second column in the table has a column index of 1. */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /** The zero-based row index. For example, the second row in the table has a row index of 1. */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /** The location where the table starts in the document. */
  var tableStartLocation: js.UndefOr[Location] = js.native
}
object TableCellLocation {
  
  @scala.inline
  def apply(): TableCellLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellLocation]
  }
  
  @scala.inline
  implicit class TableCellLocationMutableBuilder[Self <: TableCellLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setTableStartLocation(value: Location): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
