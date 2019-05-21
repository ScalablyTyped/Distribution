package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesLockEndpoint extends js.Object {
  var issue_number: scala.Double
  var lock_reason: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesLockEndpoint {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    lock_reason: java.lang.String = null,
    number: scala.Int | scala.Double = null
  ): IssuesLockEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (lock_reason != null) __obj.updateDynamic("lock_reason")(lock_reason)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesLockEndpoint]
  }
}

