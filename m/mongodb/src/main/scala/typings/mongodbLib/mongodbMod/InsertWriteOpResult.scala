package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertWriteOpResult extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedIds: org.scalablytyped.runtime.NumberDictionary[bsonLib.bsonMod.ObjectID]
  var ops: js.Array[_]
  var result: mongodbLib.Anon_NOk
}

object InsertWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    insertedCount: scala.Double,
    insertedIds: org.scalablytyped.runtime.NumberDictionary[bsonLib.bsonMod.ObjectID],
    ops: js.Array[_],
    result: mongodbLib.Anon_NOk
  ): InsertWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection, insertedCount = insertedCount, insertedIds = insertedIds, ops = ops, result = result)
  
    __obj.asInstanceOf[InsertWriteOpResult]
  }
}

