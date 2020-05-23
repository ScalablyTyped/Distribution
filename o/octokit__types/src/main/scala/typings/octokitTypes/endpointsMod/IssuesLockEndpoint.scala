package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`off-topic`
import typings.octokitTypes.octokitTypesStrings.`too heated`
import typings.octokitTypes.octokitTypesStrings.resolved
import typings.octokitTypes.octokitTypesStrings.spam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesLockEndpoint extends js.Object {
  var issue_number: Double
  /**
    * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:
    * \* `off-topic`
    * \* `too heated`
    * \* `resolved`
    * \* `spam`
    */
  var lock_reason: js.UndefOr[`off-topic` | (`too heated`) | resolved | spam] = js.undefined
  var owner: String
  var repo: String
}

object IssuesLockEndpoint {
  @scala.inline
  def apply(
    issue_number: Double,
    owner: String,
    repo: String,
    lock_reason: `off-topic` | (`too heated`) | resolved | spam = null
  ): IssuesLockEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (lock_reason != null) __obj.updateDynamic("lock_reason")(lock_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesLockEndpoint]
  }
}

