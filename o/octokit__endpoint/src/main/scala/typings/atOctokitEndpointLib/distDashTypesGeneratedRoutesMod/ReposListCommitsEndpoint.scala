package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsEndpoint extends js.Object {
  var author: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  var sha: js.UndefOr[java.lang.String] = js.undefined
  var since: js.UndefOr[java.lang.String] = js.undefined
  var until: js.UndefOr[java.lang.String] = js.undefined
}

object ReposListCommitsEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    author: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    per_page: scala.Int | scala.Double = null,
    sha: java.lang.String = null,
    since: java.lang.String = null,
    until: java.lang.String = null
  ): ReposListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (author != null) __obj.updateDynamic("author")(author)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha)
    if (since != null) __obj.updateDynamic("since")(since)
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[ReposListCommitsEndpoint]
  }
}

