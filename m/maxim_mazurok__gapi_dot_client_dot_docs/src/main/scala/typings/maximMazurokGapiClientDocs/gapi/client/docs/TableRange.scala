package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRange extends js.Object {
  
  /** The column span of the table range. */
  var columnSpan: js.UndefOr[Double] = js.native
  
  /** The row span of the table range. */
  var rowSpan: js.UndefOr[Double] = js.native
  
  /** The cell location where the table range starts. */
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.native
}
object TableRange {
  
  @scala.inline
  def apply(): TableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRange]
  }
  
  @scala.inline
  implicit class TableRangeOps[Self <: TableRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnSpan(value: Double): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSpan: Self = this.set("columnSpan", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    
    @scala.inline
    def setTableCellLocation(value: TableCellLocation): Self = this.set("tableCellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCellLocation: Self = this.set("tableCellLocation", js.undefined)
  }
}
