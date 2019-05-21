package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsForRepoEndpoint extends js.Object {
  var all: js.UndefOr[scala.Boolean] = js.undefined
  var before: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var participating: js.UndefOr[scala.Boolean] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  var since: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityListNotificationsForRepoEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    all: js.UndefOr[scala.Boolean] = js.undefined,
    before: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    participating: js.UndefOr[scala.Boolean] = js.undefined,
    per_page: scala.Int | scala.Double = null,
    since: java.lang.String = null
  ): ActivityListNotificationsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (before != null) __obj.updateDynamic("before")(before)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(participating)) __obj.updateDynamic("participating")(participating)
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[ActivityListNotificationsForRepoEndpoint]
  }
}

