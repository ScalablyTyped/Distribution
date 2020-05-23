package typings.mongodb.anon

import typings.mongodb.mod.FilterQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collation[T] extends js.Object {
  var collation: js.UndefOr[js.Object] = js.undefined
  var filter: FilterQuery[T]
  var hint: js.UndefOr[String | js.Object] = js.undefined
  var replacement: T
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object Collation {
  @scala.inline
  def apply[T](
    filter: FilterQuery[T],
    replacement: T,
    collation: js.Object = null,
    hint: String | js.Object = null,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): Collation[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collation[T]]
  }
}

