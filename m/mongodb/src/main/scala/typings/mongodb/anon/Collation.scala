package typings.mongodb.anon

import typings.mongodb.mod.FilterQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collation[TSchema] extends js.Object {
  var collation: js.UndefOr[js.Object] = js.undefined
  var filter: FilterQuery[TSchema]
  var hint: js.UndefOr[String | js.Object] = js.undefined
  var replacement: TSchema
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object Collation {
  @scala.inline
  def apply[TSchema](
    filter: FilterQuery[TSchema],
    replacement: TSchema,
    collation: js.Object = null,
    hint: String | js.Object = null,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): Collation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collation[TSchema]]
  }
}

