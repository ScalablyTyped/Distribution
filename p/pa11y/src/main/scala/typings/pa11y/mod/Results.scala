package typings.pa11y.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  var documentTitle: String = js.native
  var issues: js.Array[ResultIssue] = js.native
  var pageUrl: String = js.native
}

object Results {
  @scala.inline
  def apply(documentTitle: String, issues: js.Array[ResultIssue], pageUrl: String): Results = {
    val __obj = js.Dynamic.literal(documentTitle = documentTitle.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
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
    def setDocumentTitle(value: String): Self = this.set("documentTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuesVarargs(value: ResultIssue*): Self = this.set("issues", js.Array(value :_*))
    @scala.inline
    def setIssues(value: js.Array[ResultIssue]): Self = this.set("issues", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageUrl(value: String): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
  }
  
}

