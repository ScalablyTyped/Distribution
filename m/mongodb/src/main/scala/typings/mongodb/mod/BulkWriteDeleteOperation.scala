package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteDeleteOperation[TSchema] extends js.Object {
  var collation: js.UndefOr[js.Object] = js.undefined
  var filter: FilterQuery[TSchema]
}

object BulkWriteDeleteOperation {
  @scala.inline
  def apply[TSchema](filter: FilterQuery[TSchema], collation: js.Object = null): BulkWriteDeleteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOperation[TSchema]]
  }
}

