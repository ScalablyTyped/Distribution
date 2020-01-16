package typings.nyaapi.nyaapiMod.si

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
    n: Int | Double = null,
    p: Int | Double = null,
    sort: String = null
  ): SearchOptionsTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsTerm]
  }
}

