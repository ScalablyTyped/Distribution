package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddAssigneesEndpoint extends js.Object {
  /**
    * Usernames of people to assign this issue to. _NOTE: Only users with push access can add assignees to an issue. Assignees are silently ignored otherwise._
    */
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
  var issue_number: Double
  var owner: String
  var repo: String
}

object IssuesAddAssigneesEndpoint {
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String, assignees: js.Array[String] = null): IssuesAddAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (assignees != null) __obj.updateDynamic("assignees")(assignees.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesAddAssigneesEndpoint]
  }
}

