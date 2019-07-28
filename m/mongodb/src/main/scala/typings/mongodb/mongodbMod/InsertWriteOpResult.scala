package typings.mongodb.mongodbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.mongodb.Anon_NOk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertWriteOpResult extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedIds: NumberDictionary[typings.bson.bsonMod.ObjectID]
  var ops: js.Array[_]
  var result: Anon_NOk
}

object InsertWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    insertedCount: scala.Double,
    insertedIds: NumberDictionary[typings.bson.bsonMod.ObjectID],
    ops: js.Array[_],
    result: Anon_NOk
  ): InsertWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection, insertedCount = insertedCount, insertedIds = insertedIds, ops = ops, result = result)
  
    __obj.asInstanceOf[InsertWriteOpResult]
  }
}

