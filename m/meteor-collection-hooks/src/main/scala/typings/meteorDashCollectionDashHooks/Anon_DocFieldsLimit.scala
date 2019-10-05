package typings.meteorDashCollectionDashHooks

import typings.meteorDashTypings.Mongo.FieldSpecifier
import typings.meteorDashTypings.Mongo.SortSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocFieldsLimit extends js.Object {
  var fields: js.UndefOr[FieldSpecifier] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var reactive: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[SortSpecifier] = js.undefined
  var transform: js.UndefOr[js.Function1[/* doc */ js.Any, Unit]] = js.undefined
}

object Anon_DocFieldsLimit {
  @scala.inline
  def apply(
    fields: FieldSpecifier = null,
    limit: Int | Double = null,
    reactive: js.UndefOr[Boolean] = js.undefined,
    skip: Int | Double = null,
    sort: SortSpecifier = null,
    transform: /* doc */ js.Any => Unit = null
  ): Anon_DocFieldsLimit = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Anon_DocFieldsLimit]
  }
}

