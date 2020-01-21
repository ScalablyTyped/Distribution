package typings.nyaapi.mod.pantsu

import typings.nyaapi.nyaapiStrings.b
import typings.nyaapi.nyaapiStrings.g
import typings.nyaapi.nyaapiStrings.k
import typings.nyaapi.nyaapiStrings.m
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
    c: Category = null,
    dateType: String = null,
    fromDate: String = null,
    fromID: String = null,
    lang: js.Array[String] = null,
    maxSize: String = null,
    maxage: String = null,
    minSize: String = null,
    n: Int | Double = null,
    order: js.UndefOr[Boolean] = js.undefined,
    page: Int | Double = null,
    s: String = null,
    sizeType: b | k | m | g = null,
    sort: SortType = null,
    toDate: String = null,
    userID: String = null
  ): SearchOptionsTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (dateType != null) __obj.updateDynamic("dateType")(dateType.asInstanceOf[js.Any])
    if (fromDate != null) __obj.updateDynamic("fromDate")(fromDate.asInstanceOf[js.Any])
    if (fromID != null) __obj.updateDynamic("fromID")(fromID.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (toDate != null) __obj.updateDynamic("toDate")(toDate.asInstanceOf[js.Any])
    if (userID != null) __obj.updateDynamic("userID")(userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsTerm]
  }
}

