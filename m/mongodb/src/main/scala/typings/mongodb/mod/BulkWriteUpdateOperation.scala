package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteUpdateOperation[TSchema] extends js.Object {
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
  var collation: js.UndefOr[js.Object] = js.undefined
  var filter: FilterQuery[TSchema]
  var hint: js.UndefOr[String | js.Object] = js.undefined
  var update: UpdateQuery[TSchema]
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object BulkWriteUpdateOperation {
  @scala.inline
  def apply[TSchema](
    filter: FilterQuery[TSchema],
    update: UpdateQuery[TSchema],
    arrayFilters: js.Array[js.Object] = null,
    collation: js.Object = null,
    hint: String | js.Object = null,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): BulkWriteUpdateOperation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateOperation[TSchema]]
  }
}

