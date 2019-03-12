package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends FindOneOptions {
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply(
    children: scala.Int | scala.Double = null,
    defaults: js.UndefOr[scala.Boolean] = js.undefined,
    disableEvents: js.UndefOr[scala.Boolean] = js.undefined,
    fields: meteorLib.MongoNs.FieldSpecifier = null,
    limit: scala.Int | scala.Double = null,
    reactive: js.UndefOr[scala.Boolean] = js.undefined,
    skip: scala.Int | scala.Double = null,
    sort: meteorLib.MongoNs.SortSpecifier = null,
    transform: /* repeated */ js.Any => _ = null
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(disableEvents)) __obj.updateDynamic("disableEvents")(disableEvents)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[FindOptions]
  }
}

