package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddAssigneesParams extends js.Object {
  /**
    * Usernames of people to assign this issue to. _NOTE: Only users with push access can add assignees to an issue. Assignees are silently ignored otherwise._
    */
  var assignees: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesAddAssigneesParams {
  @scala.inline
  def apply(
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    assignees: js.Array[java.lang.String] = null
  ): IssuesAddAssigneesParams = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    __obj.asInstanceOf[IssuesAddAssigneesParams]
  }
}

