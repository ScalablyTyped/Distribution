package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReposLegacy_Options extends js.Object {
  var keyword: java.lang.String
  var language: js.UndefOr[java.lang.String] = js.undefined
  var order: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var start_page: js.UndefOr[java.lang.String] = js.undefined
}

object SearchReposLegacy_Options {
  @scala.inline
  def apply(
    keyword: java.lang.String,
    language: java.lang.String = null,
    order: java.lang.String = null,
    sort: java.lang.String = null,
    start_page: java.lang.String = null
  ): SearchReposLegacy_Options = {
    val __obj = js.Dynamic.literal(keyword = keyword)
    if (language != null) __obj.updateDynamic("language")(language)
    if (order != null) __obj.updateDynamic("order")(order)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start_page != null) __obj.updateDynamic("start_page")(start_page)
    __obj.asInstanceOf[SearchReposLegacy_Options]
  }
}

