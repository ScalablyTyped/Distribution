package typings.meteorDashAstronomy.MeteorAstronomy

import typings.meteor.Mongo.FieldSpecifier
import typings.meteor.Mongo.SortSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends FindOneOptions {
  var limit: js.UndefOr[Double] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply(
    children: Int | Double = null,
    defaults: js.UndefOr[Boolean] = js.undefined,
    disableEvents: js.UndefOr[Boolean] = js.undefined,
    fields: FieldSpecifier = null,
    limit: Int | Double = null,
    reactive: js.UndefOr[Boolean] = js.undefined,
    skip: Int | Double = null,
    sort: SortSpecifier = null,
    transform: /* repeated */ js.Any => _ = null
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEvents)) __obj.updateDynamic("disableEvents")(disableEvents.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[FindOptions]
  }
}

