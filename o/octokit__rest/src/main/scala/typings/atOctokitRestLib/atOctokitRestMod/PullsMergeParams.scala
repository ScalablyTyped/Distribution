package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsMergeParams extends js.Object {
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
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  /**
    * SHA that pull request head must match to allow merge.
    */
  var sha: js.UndefOr[java.lang.String] = js.undefined
}

object PullsMergeParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    commit_message: java.lang.String = null,
    commit_title: java.lang.String = null,
    merge_method: atOctokitRestLib.atOctokitRestLibStrings.merge | atOctokitRestLib.atOctokitRestLibStrings.squash | atOctokitRestLib.atOctokitRestLibStrings.rebase = null,
    sha: java.lang.String = null
  ): PullsMergeParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (commit_message != null) __obj.updateDynamic("commit_message")(commit_message)
    if (commit_title != null) __obj.updateDynamic("commit_title")(commit_title)
    if (merge_method != null) __obj.updateDynamic("merge_method")(merge_method.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[PullsMergeParams]
  }
}

