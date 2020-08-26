package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
@js.native
trait DocumentListResponse[D] extends js.Object {
  // Offset where the document list started.
  var offset: Double = js.native
  // Array of view row objects. By default the information returned contains only the document ID and revision.
  var rows: js.Array[DocumentResponseRow[D]] = js.native
  // Number of documents in the database/view. Note that this is not the number of rows returned in the actual
  // query.
  var total_rows: Double = js.native
  // Current update sequence for the database.
  var update_seq: js.UndefOr[Double] = js.native
}

object DocumentListResponse {
  @scala.inline
  def apply[D](offset: Double, rows: js.Array[DocumentResponseRow[D]], total_rows: Double): DocumentListResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentListResponse[D]]
  }
  @scala.inline
  implicit class DocumentListResponseOps[Self <: DocumentListResponse[_], D] (val x: Self with DocumentListResponse[D]) extends AnyVal {
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
    def setRowsVarargs(value: DocumentResponseRow[D]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[DocumentResponseRow[D]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_rows(value: Double): Self = this.set("total_rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate_seq(value: Double): Self = this.set("update_seq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate_seq: Self = this.set("update_seq", js.undefined)
  }
  
}

