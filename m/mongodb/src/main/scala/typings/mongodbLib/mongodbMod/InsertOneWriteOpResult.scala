package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOneWriteOpResult extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedId: bsonLib.bsonMod.ObjectID
  var ops: js.Array[_]
  var result: mongodbLib.Anon_NOk
}

object InsertOneWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: bsonLib.bsonMod.ObjectID,
    ops: js.Array[_],
    result: mongodbLib.Anon_NOk
  ): InsertOneWriteOpResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("insertedCount")(insertedCount)
    __obj.updateDynamic("insertedId")(insertedId)
    __obj.updateDynamic("ops")(ops)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[InsertOneWriteOpResult]
  }
}

