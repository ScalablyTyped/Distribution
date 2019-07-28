package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesLockEndpoint extends js.Object {
  var issue_number: Double
  var lock_reason: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
}

object IssuesLockEndpoint {
  @scala.inline
  def apply(
    issue_number: Double,
    owner: String,
    repo: String,
    lock_reason: String = null,
    number: Int | Double = null
  ): IssuesLockEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (lock_reason != null) __obj.updateDynamic("lock_reason")(lock_reason)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesLockEndpoint]
  }
}

