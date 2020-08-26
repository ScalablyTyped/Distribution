package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issues extends js.Object {
  var issues: js.Array[IssueRecord] = js.native
}

object Issues {
  @scala.inline
  def apply(issues: js.Array[IssueRecord]): Issues = {
    val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issues]
  }
  @scala.inline
  implicit class IssuesOps[Self <: Issues] (val x: Self) extends AnyVal {
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
    def setIssuesVarargs(value: IssueRecord*): Self = this.set("issues", js.Array(value :_*))
    @scala.inline
    def setIssues(value: js.Array[IssueRecord]): Self = this.set("issues", value.asInstanceOf[js.Any])
  }
  
}

