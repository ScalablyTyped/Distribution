package typings.mongodb.mod

import typings.mongodb.anon.Id
import typings.mongodb.anon.NModified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWriteOpResult extends js.Object {
  var connection: js.Any
  var matchedCount: scala.Double
  var modifiedCount: scala.Double
  var result: NModified
  var upsertedCount: scala.Double
  var upsertedId: Id
}

object UpdateWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    result: NModified,
    upsertedCount: scala.Double,
    upsertedId: Id
  ): UpdateWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWriteOpResult]
  }
}

