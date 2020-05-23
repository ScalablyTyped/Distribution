package typings.meteor.anon

import typings.meteor.Mongo.FieldSpecifier
import typings.meteor.Mongo.SortSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Skip extends js.Object {
  var fields: js.UndefOr[FieldSpecifier] = js.undefined
  var reactive: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[SortSpecifier] = js.undefined
  var transform: js.UndefOr[js.Function | Null] = js.undefined
}

object Skip {
  @scala.inline
  def apply(
    fields: FieldSpecifier = null,
    reactive: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    sort: SortSpecifier = null,
    transform: js.UndefOr[Null | js.Function] = js.undefined
  ): Skip = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(transform)) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skip]
  }
}

