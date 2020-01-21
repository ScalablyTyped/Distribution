package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issues extends js.Object {
  var issues: js.Array[IssueRecord]
}

object Issues {
  @scala.inline
  def apply(issues: js.Array[IssueRecord]): Issues = {
    val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Issues]
  }
}

