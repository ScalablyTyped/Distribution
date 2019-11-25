package typings.mongodb.mongodbMod

import typings.mongodb.Anon_IdObjectId
import typings.mongodb.Anon_NNModified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWriteOpResult extends js.Object {
  var connection: js.Any
  var matchedCount: scala.Double
  var modifiedCount: scala.Double
  var result: Anon_NNModified
  var upsertedCount: scala.Double
  var upsertedId: Anon_IdObjectId
}

object UpdateWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    result: Anon_NNModified,
    upsertedCount: scala.Double,
    upsertedId: Anon_IdObjectId
  ): UpdateWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateWriteOpResult]
  }
}

