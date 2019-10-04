package typings.mongodb.mongodbMod

import typings.mongodb.Anon_NOk
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOneWriteOpResult[TSchema /* <: Record[String, _] */] extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedId: /* import warning: ImportType.apply Failed type conversion: TSchema['_id'] */ js.Any
  var ops: js.Array[TSchema]
  var result: Anon_NOk
}

object InsertOneWriteOpResult {
  @scala.inline
  def apply[TSchema /* <: Record[String, _] */](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: /* import warning: ImportType.apply Failed type conversion: TSchema['_id'] */ js.Any,
    ops: js.Array[TSchema],
    result: Anon_NOk
  ): InsertOneWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection, insertedCount = insertedCount, insertedId = insertedId, ops = ops, result = result)
  
    __obj.asInstanceOf[InsertOneWriteOpResult[TSchema]]
  }
}

