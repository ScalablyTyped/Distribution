package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommentsForCommitEndpoint extends js.Object {
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var ref: java.lang.String
  var repo: java.lang.String
}

object ReposListCommentsForCommitEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReposListCommentsForCommitEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListCommentsForCommitEndpoint]
  }
}

