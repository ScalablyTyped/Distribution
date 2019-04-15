package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveAssigneesParams extends js.Object {
  /**
    * Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove assignees from an issue. Assignees are silently ignored otherwise._
    */
  var assignees: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var issue_number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesRemoveAssigneesParams {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    assignees: js.Array[java.lang.String] = null
  ): IssuesRemoveAssigneesParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    __obj.asInstanceOf[IssuesRemoveAssigneesParams]
  }
}

