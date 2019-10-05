package typings.meteorDashTypings

import typings.meteorDashTypings.Mongo.FieldSpecifier
import typings.meteorDashTypings.Mongo.SortSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldsReactive extends js.Object {
  var fields: js.UndefOr[FieldSpecifier] = js.undefined
  var reactive: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[SortSpecifier] = js.undefined
  var transform: js.UndefOr[js.Function] = js.undefined
}

object Anon_FieldsReactive {
  @scala.inline
  def apply(
    fields: FieldSpecifier = null,
    reactive: js.UndefOr[Boolean] = js.undefined,
    skip: Int | Double = null,
    sort: SortSpecifier = null,
    transform: js.Function = null
  ): Anon_FieldsReactive = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_FieldsReactive]
  }
}

