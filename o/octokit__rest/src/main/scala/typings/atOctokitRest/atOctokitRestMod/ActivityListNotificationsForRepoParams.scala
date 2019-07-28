package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsForRepoParams extends js.Object {
  /**
    * If `true`, show notifications marked as read.
    */
  var all: js.UndefOr[Boolean] = js.undefined
  /**
    * Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var before: js.UndefOr[String] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, only shows notifications in which the user is directly participating or mentioned.
    */
  var participating: js.UndefOr[Boolean] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  /**
    * Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var since: js.UndefOr[String] = js.undefined
}

object ActivityListNotificationsForRepoParams {
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
  ): ActivityListNotificationsForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (before != null) __obj.updateDynamic("before")(before)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(participating)) __obj.updateDynamic("participating")(participating)
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[ActivityListNotificationsForRepoParams]
  }
}

