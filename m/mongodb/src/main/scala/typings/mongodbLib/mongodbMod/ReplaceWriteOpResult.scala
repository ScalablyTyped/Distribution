package typings
package mongodbLib.mongodbMod

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
    result: mongodbLib.Anon_NNModified,
    upsertedCount: scala.Double,
    upsertedId: mongodbLib.Anon_IdObjectID
  ): ReplaceWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection, matchedCount = matchedCount, modifiedCount = modifiedCount, ops = ops, result = result, upsertedCount = upsertedCount, upsertedId = upsertedId)
  
    __obj.asInstanceOf[ReplaceWriteOpResult]
  }
}

