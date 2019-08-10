package typings.nodeDashRedmine.nodeDashRedmineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueData extends js.Object {
  var issue: IssueParams
}

object IssueData {
  @scala.inline
  def apply(issue: IssueParams): IssueData = {
    val __obj = js.Dynamic.literal(issue = issue)
  
    __obj.asInstanceOf[IssueData]
  }
}

