package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneOptions extends js.Object {
  var children: js.UndefOr[scala.Double] = js.undefined
  var defaults: js.UndefOr[scala.Boolean] = js.undefined
  var disableEvents: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[meteorLib.MongoNs.FieldSpecifier] = js.undefined
  var reactive: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[meteorLib.MongoNs.SortSpecifier] = js.undefined
  var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object FindOneOptions {
  @scala.inline
  def apply(
    children: scala.Int | scala.Double = null,
    defaults: js.UndefOr[scala.Boolean] = js.undefined,
    disableEvents: js.UndefOr[scala.Boolean] = js.undefined,
    fields: meteorLib.MongoNs.FieldSpecifier = null,
    reactive: js.UndefOr[scala.Boolean] = js.undefined,
    skip: scala.Int | scala.Double = null,
    sort: meteorLib.MongoNs.SortSpecifier = null,
    transform: /* repeated */ js.Any => _ = null
  ): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(disableEvents)) __obj.updateDynamic("disableEvents")(disableEvents)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[FindOneOptions]
  }
}

