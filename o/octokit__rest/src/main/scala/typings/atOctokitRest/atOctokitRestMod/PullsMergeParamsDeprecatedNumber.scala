package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.merge
import typings.atOctokitRest.atOctokitRestStrings.rebase
import typings.atOctokitRest.atOctokitRestStrings.squash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsMergeParamsDeprecatedNumber extends js.Object {
  /**
    * Extra detail to append to automatic commit message.
    */
  var commit_message: js.UndefOr[String] = js.undefined
  /**
    * Title for the automatic commit message.
    */
  var commit_title: js.UndefOr[String] = js.undefined
  /**
    * Merge method to use. Possible values are `merge`, `squash` or `rebase`. Default is `merge`.
    */
  var merge_method: js.UndefOr[merge | squash | rebase] = js.undefined
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double
  var owner: String
  var repo: String
  /**
    * SHA that pull request head must match to allow merge.
    */
  var sha: js.UndefOr[String] = js.undefined
}

object PullsMergeParamsDeprecatedNumber {
  @scala.inline
  def apply(
    number: Double,
    owner: String,
    repo: String,
    commit_message: String = null,
    commit_title: String = null,
    merge_method: merge | squash | rebase = null,
    sha: String = null
  ): PullsMergeParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (commit_message != null) __obj.updateDynamic("commit_message")(commit_message.asInstanceOf[js.Any])
    if (commit_title != null) __obj.updateDynamic("commit_title")(commit_title.asInstanceOf[js.Any])
    if (merge_method != null) __obj.updateDynamic("merge_method")(merge_method.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeParamsDeprecatedNumber]
  }
}

