package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFetchParams extends js.Object {
  var conflicts: js.UndefOr[Boolean] = js.native
  var descending: js.UndefOr[Boolean] = js.native
  var end_key: js.UndefOr[String] = js.native
  var end_key_doc_id: js.UndefOr[String] = js.native
  var inclusive_end: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var keys: js.UndefOr[String] = js.native
   // This can be string[] too ???
  var limit: js.UndefOr[Double] = js.native
  var skip: js.UndefOr[Double] = js.native
  var stale: js.UndefOr[String] = js.native
  var start_key: js.UndefOr[String] = js.native
  var start_key_doc_id: js.UndefOr[String] = js.native
  var update_seq: js.UndefOr[Boolean] = js.native
}

object DocumentFetchParams {
  @scala.inline
  def apply(): DocumentFetchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFetchParams]
  }
  @scala.inline
  implicit class DocumentFetchParamsOps[Self <: DocumentFetchParams] (val x: Self) extends AnyVal {
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
    def setConflicts(value: Boolean): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflicts: Self = this.set("conflicts", js.undefined)
    @scala.inline
    def setDescending(value: Boolean): Self = this.set("descending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescending: Self = this.set("descending", js.undefined)
    @scala.inline
    def setEnd_key(value: String): Self = this.set("end_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_key: Self = this.set("end_key", js.undefined)
    @scala.inline
    def setEnd_key_doc_id(value: String): Self = this.set("end_key_doc_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_key_doc_id: Self = this.set("end_key_doc_id", js.undefined)
    @scala.inline
    def setInclusive_end(value: Boolean): Self = this.set("inclusive_end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclusive_end: Self = this.set("inclusive_end", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeys(value: String): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setStale(value: String): Self = this.set("stale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    @scala.inline
    def setStart_key(value: String): Self = this.set("start_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_key: Self = this.set("start_key", js.undefined)
    @scala.inline
    def setStart_key_doc_id(value: String): Self = this.set("start_key_doc_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_key_doc_id: Self = this.set("start_key_doc_id", js.undefined)
    @scala.inline
    def setUpdate_seq(value: Boolean): Self = this.set("update_seq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate_seq: Self = this.set("update_seq", js.undefined)
  }
  
}

