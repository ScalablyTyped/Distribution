package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsMergeParamsDeprecatedNumber extends js.Object {
  /**
    * Extra detail to append to automatic commit message.
    */
  var commit_message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title for the automatic commit message.
    */
  var commit_title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Merge method to use. Possible values are `merge`, `squash` or `rebase`. Default is `merge`.
    */
  var merge_method: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.merge | atOctokitRestLib.atOctokitRestLibStrings.squash | atOctokitRestLib.atOctokitRestLibStrings.rebase
  ] = js.undefined
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * SHA that pull request head must match to allow merge.
    */
  var sha: js.UndefOr[java.lang.String] = js.undefined
}

object PullsMergeParamsDeprecatedNumber {
  @scala.inline
  def apply(
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    commit_message: java.lang.String = null,
    commit_title: java.lang.String = null,
    merge_method: atOctokitRestLib.atOctokitRestLibStrings.merge | atOctokitRestLib.atOctokitRestLibStrings.squash | atOctokitRestLib.atOctokitRestLibStrings.rebase = null,
    sha: java.lang.String = null
  ): PullsMergeParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
    if (commit_message != null) __obj.updateDynamic("commit_message")(commit_message)
    if (commit_title != null) __obj.updateDynamic("commit_title")(commit_title)
    if (merge_method != null) __obj.updateDynamic("merge_method")(merge_method.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[PullsMergeParamsDeprecatedNumber]
  }
}

