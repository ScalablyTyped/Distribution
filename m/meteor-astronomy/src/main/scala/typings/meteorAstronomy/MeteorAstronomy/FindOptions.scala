package typings.meteorAstronomy.MeteorAstronomy

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
    children: js.UndefOr[Double] = js.undefined,
    defaults: js.UndefOr[Boolean] = js.undefined,
    disableEvents: js.UndefOr[Boolean] = js.undefined,
    fields: FieldSpecifier = null,
    limit: js.UndefOr[Double] = js.undefined,
    reactive: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    sort: SortSpecifier = null,
    transform: /* repeated */ js.Any => _ = null
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEvents)) __obj.updateDynamic("disableEvents")(disableEvents.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[FindOptions]
  }
}

