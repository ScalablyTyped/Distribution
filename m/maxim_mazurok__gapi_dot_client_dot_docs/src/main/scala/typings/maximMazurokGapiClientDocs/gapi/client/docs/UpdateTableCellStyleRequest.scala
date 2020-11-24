package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableCellStyleRequest extends js.Object {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableCellStyle` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update the table cell background color, set `fields` to `"backgroundColor"`. To reset a property to its default value, include its field name
    * in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The style to set on the table cells. When updating borders, if a cell shares a border with an adjacent cell, the corresponding border property of the adjacent cell is updated as
    * well. Borders that are merged and invisible are not updated. Since updating a border shared by adjacent cells in the same request can cause conflicting border updates, border
    * updates are applied in the following order: - `border_right` - `border_left` - `border_bottom` - `border_top`
    */
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.native
  
  /** The table range representing the subset of the table to which the updates are applied. */
  var tableRange: js.UndefOr[TableRange] = js.native
  
  /** The location where the table starts in the document. When specified, the updates are applied to all the cells in the table. */
  var tableStartLocation: js.UndefOr[Location] = js.native
}
object UpdateTableCellStyleRequest {
  
  @scala.inline
  def apply(): UpdateTableCellStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableCellStyleRequest]
  }
  
  @scala.inline
  implicit class UpdateTableCellStyleRequestOps[Self <: UpdateTableCellStyleRequest] (val x: Self) extends AnyVal {
    
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setTableCellStyle(value: TableCellStyle): Self = this.set("tableCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCellStyle: Self = this.set("tableCellStyle", js.undefined)
    
    @scala.inline
    def setTableRange(value: TableRange): Self = this.set("tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRange: Self = this.set("tableRange", js.undefined)
    
    @scala.inline
    def setTableStartLocation(value: Location): Self = this.set("tableStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStartLocation: Self = this.set("tableStartLocation", js.undefined)
  }
}
