package typings.nyaapi.mod.si

import typings.nyaapi.nyaapiStrings.asc
import typings.nyaapi.nyaapiStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var category: js.UndefOr[Category] = js.undefined
  var direction: js.UndefOr[asc | desc] = js.undefined
  var filter: js.UndefOr[Filter] = js.undefined
  var n: js.UndefOr[Double] = js.undefined
  var p: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var term: js.UndefOr[String] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    category: Category = null,
    direction: asc | desc = null,
    filter: Filter = null,
    n: js.UndefOr[Double] = js.undefined,
    p: js.UndefOr[Double] = js.undefined,
    sort: String = null,
    term: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(n)) __obj.updateDynamic("n")(n.get.asInstanceOf[js.Any])
    if (!js.isUndefined(p)) __obj.updateDynamic("p")(p.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

