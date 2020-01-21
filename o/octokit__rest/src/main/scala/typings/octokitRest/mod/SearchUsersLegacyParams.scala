package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.asc
import typings.octokitRest.octokitRestStrings.desc
import typings.octokitRest.octokitRestStrings.forks
import typings.octokitRest.octokitRestStrings.stars
import typings.octokitRest.octokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUsersLegacyParams extends js.Object {
  /**
    * The search term.
    */
  var keyword: String
  /**
    * The sort field. if `sort` param is provided. Can be either `asc` or `desc`.
    */
  var order: js.UndefOr[asc | desc] = js.undefined
  /**
    * The sort field. One of `stars`, `forks`, or `updated`. Default: results are sorted by best match.
    */
  var sort: js.UndefOr[stars | forks | updated] = js.undefined
  /**
    * The page number to fetch.
    */
  var start_page: js.UndefOr[String] = js.undefined
}

object SearchUsersLegacyParams {
  @scala.inline
  def apply(
    keyword: String,
    order: asc | desc = null,
    sort: stars | forks | updated = null,
    start_page: String = null
  ): SearchUsersLegacyParams = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (start_page != null) __obj.updateDynamic("start_page")(start_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUsersLegacyParams]
  }
}

