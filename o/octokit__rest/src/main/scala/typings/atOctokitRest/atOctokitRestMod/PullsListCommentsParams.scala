package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.asc
import typings.atOctokitRest.atOctokitRestStrings.created
import typings.atOctokitRest.atOctokitRestStrings.desc
import typings.atOctokitRest.atOctokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommentsParams extends js.Object {
  /**
    * Can be either `asc` or `desc`. Ignored without `sort` parameter.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var pull_number: Double
  var repo: String
  /**
    * This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Only returns comments `updated` at or after this time.
    */
  var since: js.UndefOr[String] = js.undefined
  /**
    * Can be either `created` or `updated` comments.
    */
  var sort: js.UndefOr[created | updated] = js.undefined
}

object PullsListCommentsParams {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    since: String = null,
    sort: created | updated = null
  ): PullsListCommentsParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListCommentsParams]
  }
}

