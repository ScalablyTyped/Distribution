package typings.nano.mod

import typings.nano.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
@js.native
trait DocumentViewResponse[V, D] extends js.Object {
  // Offset where the document list started.
  var offset: Double = js.native
  //  Array of view row objects. By default the information returned contains only the document ID and revision.
  var rows: js.Array[Id[V, D]] = js.native
  // Number of documents in the database/view.
  var total_rows: Double = js.native
  // Current update sequence for the database
  var update_seq: js.Any = js.native
}

object DocumentViewResponse {
  @scala.inline
  def apply[V, D](offset: Double, rows: js.Array[Id[V, D]], total_rows: Double, update_seq: js.Any): DocumentViewResponse[V, D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any], update_seq = update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewResponse[V, D]]
  }
  @scala.inline
  implicit class DocumentViewResponseOps[Self <: DocumentViewResponse[_, _], V, D] (val x: Self with (DocumentViewResponse[V, D])) extends AnyVal {
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
    def setRowsVarargs(value: (Id[V, D])*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[Id[V, D]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_rows(value: Double): Self = this.set("total_rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate_seq(value: js.Any): Self = this.set("update_seq", value.asInstanceOf[js.Any])
  }
  
}

