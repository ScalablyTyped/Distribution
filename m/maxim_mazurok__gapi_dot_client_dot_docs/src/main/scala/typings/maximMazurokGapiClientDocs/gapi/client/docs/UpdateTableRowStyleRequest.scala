package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableRowStyleRequest extends js.Object {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableRowStyle` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update the minimum row height, set `fields` to `"min_row_height"`.
    */
  var fields: js.UndefOr[String] = js.native
  
  /** The list of zero-based row indices whose style should be updated. If no indices are specified, all rows will be updated. */
  var rowIndices: js.UndefOr[js.Array[Double]] = js.native
  
  /** The styles to be set on the rows. */
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.native
  
  /** The location where the table starts in the document. */
  var tableStartLocation: js.UndefOr[Location] = js.native
}
object UpdateTableRowStyleRequest {
  
  @scala.inline
  def apply(): UpdateTableRowStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableRowStyleRequest]
  }
  
  @scala.inline
  implicit class UpdateTableRowStyleRequestOps[Self <: UpdateTableRowStyleRequest] (val x: Self) extends AnyVal {
    
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
    def setRowIndicesVarargs(value: Double*): Self = this.set("rowIndices", js.Array(value :_*))
    
    @scala.inline
    def setRowIndices(value: js.Array[Double]): Self = this.set("rowIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndices: Self = this.set("rowIndices", js.undefined)
    
    @scala.inline
    def setTableRowStyle(value: TableRowStyle): Self = this.set("tableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRowStyle: Self = this.set("tableRowStyle", js.undefined)
    
    @scala.inline
    def setTableStartLocation(value: Location): Self = this.set("tableStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStartLocation: Self = this.set("tableStartLocation", js.undefined)
  }
}
