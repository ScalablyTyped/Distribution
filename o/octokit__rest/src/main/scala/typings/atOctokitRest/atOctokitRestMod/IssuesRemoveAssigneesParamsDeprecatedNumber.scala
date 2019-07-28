package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveAssigneesParamsDeprecatedNumber extends js.Object {
  /**
    * Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove assignees from an issue. Assignees are silently ignored otherwise._
    */
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @deprecated "number" parameter renamed to "issue_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object IssuesRemoveAssigneesParamsDeprecatedNumber {
  @scala.inline
  def apply(number: Double, owner: String, repo: String, assignees: js.Array[String] = null): IssuesRemoveAssigneesParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    __obj.asInstanceOf[IssuesRemoveAssigneesParamsDeprecatedNumber]
  }
}

