package typings.mongodb.mongodbMod

import typings.mongodb.Anon_NOk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOneWriteOpResult extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedId: typings.bson.bsonMod.ObjectID
  var ops: js.Array[_]
  var result: Anon_NOk
}

object InsertOneWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: typings.bson.bsonMod.ObjectID,
    ops: js.Array[_],
    result: Anon_NOk
  ): InsertOneWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection, insertedCount = insertedCount, insertedId = insertedId, ops = ops, result = result)
  
    __obj.asInstanceOf[InsertOneWriteOpResult]
  }
}

