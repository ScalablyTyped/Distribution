package typings.nyaapi.mod.si

import typings.nyaapi.nyaapiStrings.asc
import typings.nyaapi.nyaapiStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptionsTerm extends SearchOptions {
  @JSName("term")
  var term_SearchOptionsTerm: String
}

object SearchOptionsTerm {
  @scala.inline
  def apply(
    term: String,
    category: Category = null,
    direction: asc | desc = null,
    filter: Filter = null,
    n: js.UndefOr[Double] = js.undefined,
    p: js.UndefOr[Double] = js.undefined,
    sort: String = null
  ): SearchOptionsTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(n)) __obj.updateDynamic("n")(n.get.asInstanceOf[js.Any])
    if (!js.isUndefined(p)) __obj.updateDynamic("p")(p.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsTerm]
  }
}

