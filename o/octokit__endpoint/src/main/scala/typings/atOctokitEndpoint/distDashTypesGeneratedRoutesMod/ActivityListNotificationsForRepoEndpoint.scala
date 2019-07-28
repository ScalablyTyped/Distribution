package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsForRepoEndpoint extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var before: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var participating: js.UndefOr[Boolean] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var since: js.UndefOr[String] = js.undefined
}

object ActivityListNotificationsForRepoEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    all: js.UndefOr[Boolean] = js.undefined,
    before: String = null,
    page: Int | Double = null,
    participating: js.UndefOr[Boolean] = js.undefined,
    per_page: Int | Double = null,
    since: String = null
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

