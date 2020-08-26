package typings.nano.mod

import typings.nano.anon.IdRev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MangoResponse[D] extends js.Object {
  // A string that enables you to specify which page of results you require. Used for paging through result sets.
  var bookmark: js.UndefOr[String] = js.native
  // Array of documents matching the search. In each matching document, the fields specified in
  // the fields part of the request body are listed, along with their values.
  var docs: js.Array[D with IdRev] = js.native
  // Basic execution statistics for a specific request.
  var execution_stats: js.UndefOr[MangoExecutionStats] = js.native
  // Execution warnings
  var warning: js.UndefOr[String] = js.native
}

object MangoResponse {
  @scala.inline
  def apply[D](docs: js.Array[D with IdRev]): MangoResponse[D] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoResponse[D]]
  }
  @scala.inline
  implicit class MangoResponseOps[Self <: MangoResponse[_], D] (val x: Self with MangoResponse[D]) extends AnyVal {
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
    def setDocsVarargs(value: (D with IdRev)*): Self = this.set("docs", js.Array(value :_*))
    @scala.inline
    def setDocs(value: js.Array[D with IdRev]): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookmark(value: String): Self = this.set("bookmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmark: Self = this.set("bookmark", js.undefined)
    @scala.inline
    def setExecution_stats(value: MangoExecutionStats): Self = this.set("execution_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecution_stats: Self = this.set("execution_stats", js.undefined)
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

