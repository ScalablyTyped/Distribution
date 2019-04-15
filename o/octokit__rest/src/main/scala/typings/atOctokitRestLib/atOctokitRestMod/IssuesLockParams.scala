package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesLockParams extends js.Object {
  var issue_number: scala.Double
  /**
    * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:
    * \* `off-topic`
    * \* `too heated`
    * \* `resolved`
    * \* `spam`
    */
  var lock_reason: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.`off-topic` | (atOctokitRestLib.atOctokitRestLibStrings.`too heated`) | atOctokitRestLib.atOctokitRestLibStrings.resolved | atOctokitRestLib.atOctokitRestLibStrings.spam
  ] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesLockParams {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    lock_reason: atOctokitRestLib.atOctokitRestLibStrings.`off-topic` | (atOctokitRestLib.atOctokitRestLibStrings.`too heated`) | atOctokitRestLib.atOctokitRestLibStrings.resolved | atOctokitRestLib.atOctokitRestLibStrings.spam = null
  ): IssuesLockParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (lock_reason != null) __obj.updateDynamic("lock_reason")(lock_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesLockParams]
  }
}

