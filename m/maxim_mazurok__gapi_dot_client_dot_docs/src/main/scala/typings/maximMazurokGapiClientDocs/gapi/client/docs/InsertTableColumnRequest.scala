package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertTableColumnRequest extends js.Object {
  
  /** Whether to insert new column to the right of the reference cell location. - `True`: insert to the right. - `False`: insert to the left. */
  var insertRight: js.UndefOr[Boolean] = js.native
  
  /**
    * The reference table cell location from which columns will be inserted. A new column will be inserted to the left (or right) of the column where the reference cell is. If the
    * reference cell is a merged cell, a new column will be inserted to the left (or right) of the merged cell.
    */
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.native
}
object InsertTableColumnRequest {
  
  @scala.inline
  def apply(): InsertTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableColumnRequest]
  }
  
  @scala.inline
  implicit class InsertTableColumnRequestOps[Self <: InsertTableColumnRequest] (val x: Self) extends AnyVal {
    
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
    def setInsertRight(value: Boolean): Self = this.set("insertRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertRight: Self = this.set("insertRight", js.undefined)
    
    @scala.inline
    def setTableCellLocation(value: TableCellLocation): Self = this.set("tableCellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCellLocation: Self = this.set("tableCellLocation", js.undefined)
  }
}
