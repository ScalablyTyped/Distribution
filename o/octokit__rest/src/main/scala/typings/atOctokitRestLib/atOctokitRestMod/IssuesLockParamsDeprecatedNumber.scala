package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesLockParamsDeprecatedNumber extends js.Object {
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
  /**
    * @deprecated "number" parameter renamed to "issue_number"
    */
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesLockParamsDeprecatedNumber {
  @scala.inline
  def apply(
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    lock_reason: atOctokitRestLib.atOctokitRestLibStrings.`off-topic` | (atOctokitRestLib.atOctokitRestLibStrings.`too heated`) | atOctokitRestLib.atOctokitRestLibStrings.resolved | atOctokitRestLib.atOctokitRestLibStrings.spam = null
  ): IssuesLockParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
    if (lock_reason != null) __obj.updateDynamic("lock_reason")(lock_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesLockParamsDeprecatedNumber]
  }
}

