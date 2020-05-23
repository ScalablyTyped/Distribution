package typings.meteorAstronomy.MeteorAstronomy

import typings.meteor.Mongo.FieldSpecifier
import typings.meteor.Mongo.SortSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneOptions extends js.Object {
  var children: js.UndefOr[Double] = js.undefined
  var defaults: js.UndefOr[Boolean] = js.undefined
  var disableEvents: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[FieldSpecifier] = js.undefined
  var reactive: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[SortSpecifier] = js.undefined
  var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object FindOneOptions {
  @scala.inline
  def apply(
    children: js.UndefOr[Double] = js.undefined,
    defaults: js.UndefOr[Boolean] = js.undefined,
    disableEvents: js.UndefOr[Boolean] = js.undefined,
    fields: FieldSpecifier = null,
    reactive: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    sort: SortSpecifier = null,
    transform: /* repeated */ js.Any => _ = null
  ): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEvents)) __obj.updateDynamic("disableEvents")(disableEvents.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[FindOneOptions]
  }
}

