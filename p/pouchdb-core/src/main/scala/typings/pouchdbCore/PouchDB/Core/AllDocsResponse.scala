package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDocsResponse[Content /* <: js.Object */] extends js.Object {
  /** The `skip` if provided, or in CouchDB the actual offset */
  var offset: Double = js.native
  var rows: js.Array[Doc[Content]] = js.native
  var total_rows: Double = js.native
  var update_seq: js.UndefOr[Double | String] = js.native
}

object AllDocsResponse {
  @scala.inline
  def apply[/* <: js.Object */ Content](offset: Double, rows: js.Array[Doc[Content]], total_rows: Double): AllDocsResponse[Content] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsResponse[Content]]
  }
  @scala.inline
  implicit class AllDocsResponseOps[Self <: AllDocsResponse[_], /* <: js.Object */ Content] (val x: Self with AllDocsResponse[Content]) extends AnyVal {
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
    def setRowsVarargs(value: Doc[Content]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[Doc[Content]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_rows(value: Double): Self = this.set("total_rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate_seq(value: Double | String): Self = this.set("update_seq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate_seq: Self = this.set("update_seq", js.undefined)
  }
  
}

