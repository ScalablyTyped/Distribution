package typings.mongodb.mod

import typings.mongodb.AnonId
import typings.mongodb.AnonNModified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceWriteOpResult extends UpdateWriteOpResult {
  var ops: js.Array[_]
}

object ReplaceWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    ops: js.Array[_],
    result: AnonNModified,
    upsertedCount: scala.Double,
    upsertedId: AnonId
  ): ReplaceWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplaceWriteOpResult]
  }
}

