package typings.mongodb.mongodbMod

import typings.mongodb.Anon_IdObjectId
import typings.mongodb.Anon_NNModified
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
    result: Anon_NNModified,
    upsertedCount: scala.Double,
    upsertedId: Anon_IdObjectId
  ): ReplaceWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection, matchedCount = matchedCount, modifiedCount = modifiedCount, ops = ops, result = result, upsertedCount = upsertedCount, upsertedId = upsertedId)
  
    __obj.asInstanceOf[ReplaceWriteOpResult]
  }
}

