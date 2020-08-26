package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFetchRevsResponse[D] extends js.Object {
  var offset: Double = js.native
  var rows: js.Array[DocumentResponseRow[D] | DocumentLookupFailure] = js.native
  var total_rows: Double = js.native
  var update_seq: js.UndefOr[Double] = js.native
}

object DocumentFetchRevsResponse {
  @scala.inline
  def apply[D](offset: Double, rows: js.Array[DocumentResponseRow[D] | DocumentLookupFailure], total_rows: Double): DocumentFetchRevsResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFetchRevsResponse[D]]
  }
  @scala.inline
  implicit class DocumentFetchRevsResponseOps[Self <: DocumentFetchRevsResponse[_], D] (val x: Self with DocumentFetchRevsResponse[D]) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: (DocumentResponseRow[D] | DocumentLookupFailure)*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[DocumentResponseRow[D] | DocumentLookupFailure]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_rows(value: Double): Self = this.set("total_rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate_seq(value: Double): Self = this.set("update_seq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate_seq: Self = this.set("update_seq", js.undefined)
  }
  
}

