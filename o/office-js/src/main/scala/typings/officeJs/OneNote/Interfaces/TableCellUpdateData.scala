package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableCell object, for use in "tableCell.set({ ... })". */
@js.native
trait TableCellUpdateData extends js.Object {
  
  /**
    *
    * Gets and sets the shading color of the cell
    *
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[String] = js.native
}
object TableCellUpdateData {
  
  @scala.inline
  def apply(): TableCellUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellUpdateData]
  }
  
  @scala.inline
  implicit class TableCellUpdateDataOps[Self <: TableCellUpdateData] (val x: Self) extends AnyVal {
    
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
    def setShadingColor(value: String): Self = this.set("shadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadingColor: Self = this.set("shadingColor", js.undefined)
  }
}
