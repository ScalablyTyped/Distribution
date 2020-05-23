package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteDeleteOperation[T] extends js.Object {
  var collation: js.UndefOr[js.Object] = js.undefined
  var filter: FilterQuery[T]
}

object BulkWriteDeleteOperation {
  @scala.inline
  def apply[T](filter: FilterQuery[T], collation: js.Object = null): BulkWriteDeleteOperation[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOperation[T]]
  }
}

