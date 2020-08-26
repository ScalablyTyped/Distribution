package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueData extends js.Object {
  var issue: IssueParams = js.native
}

object IssueData {
  @scala.inline
  def apply(issue: IssueParams): IssueData = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueData]
  }
  @scala.inline
  implicit class IssueDataOps[Self <: IssueData] (val x: Self) extends AnyVal {
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
    def setIssue(value: IssueParams): Self = this.set("issue", value.asInstanceOf[js.Any])
  }
  
}

