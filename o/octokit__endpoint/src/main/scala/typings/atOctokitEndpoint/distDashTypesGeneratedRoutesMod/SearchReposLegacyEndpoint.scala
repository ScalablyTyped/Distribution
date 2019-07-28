package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReposLegacyEndpoint extends js.Object {
  var keyword: String
  var language: js.UndefOr[String] = js.undefined
  var order: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var start_page: js.UndefOr[String] = js.undefined
}

object SearchReposLegacyEndpoint {
  @scala.inline
  def apply(
    keyword: String,
    language: String = null,
    order: String = null,
    sort: String = null,
    start_page: String = null
  ): SearchReposLegacyEndpoint = {
    val __obj = js.Dynamic.literal(keyword = keyword)
    if (language != null) __obj.updateDynamic("language")(language)
    if (order != null) __obj.updateDynamic("order")(order)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start_page != null) __obj.updateDynamic("start_page")(start_page)
    __obj.asInstanceOf[SearchReposLegacyEndpoint]
  }
}

