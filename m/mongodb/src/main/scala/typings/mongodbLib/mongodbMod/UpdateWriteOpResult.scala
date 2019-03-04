package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWriteOpResult extends js.Object {
  var connection: js.Any
  var matchedCount: scala.Double
  var modifiedCount: scala.Double
  var result: mongodbLib.Anon_NNModified
  var upsertedCount: scala.Double
  var upsertedId: mongodbLib.Anon_IdObjectID
}

object UpdateWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    result: mongodbLib.Anon_NNModified,
    upsertedCount: scala.Double,
    upsertedId: mongodbLib.Anon_IdObjectID
  ): UpdateWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection, matchedCount = matchedCount, modifiedCount = modifiedCount, result = result, upsertedCount = upsertedCount, upsertedId = upsertedId)
  
    __obj.asInstanceOf[UpdateWriteOpResult]
  }
}

