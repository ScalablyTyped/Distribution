package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListRepoNotificationsForAuthenticatedUserEndpoint extends js.Object {
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

object ActivityListRepoNotificationsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    all: js.UndefOr[Boolean] = js.undefined,
    before: String = null,
    page: js.UndefOr[Double] = js.undefined,
    participating: js.UndefOr[Boolean] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    since: String = null
  ): ActivityListRepoNotificationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(participating)) __obj.updateDynamic("participating")(participating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListRepoNotificationsForAuthenticatedUserEndpoint]
  }
}

