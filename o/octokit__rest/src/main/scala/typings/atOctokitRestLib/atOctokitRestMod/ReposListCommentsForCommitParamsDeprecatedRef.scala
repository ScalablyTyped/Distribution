package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommentsForCommitParamsDeprecatedRef extends js.Object {
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  /**
    * @deprecated "ref" parameter renamed to "commit_sha"
    */
  var ref: java.lang.String
  var repo: java.lang.String
}

object ReposListCommentsForCommitParamsDeprecatedRef {
  @scala.inline
  def apply(
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReposListCommentsForCommitParamsDeprecatedRef = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListCommentsForCommitParamsDeprecatedRef]
  }
}

