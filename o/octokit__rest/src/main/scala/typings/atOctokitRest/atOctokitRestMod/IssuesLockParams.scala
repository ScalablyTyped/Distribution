package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.`off-topic`
import typings.atOctokitRest.atOctokitRestStrings.`too heated`
import typings.atOctokitRest.atOctokitRestStrings.resolved
import typings.atOctokitRest.atOctokitRestStrings.spam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesLockParams extends js.Object {
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

object IssuesLockParams {
  @scala.inline
  def apply(
    issue_number: Double,
    owner: String,
    repo: String,
    lock_reason: `off-topic` | (`too heated`) | resolved | spam = null
  ): IssuesLockParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (lock_reason != null) __obj.updateDynamic("lock_reason")(lock_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesLockParams]
  }
}

