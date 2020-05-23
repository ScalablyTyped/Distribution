package typings.mongodb.mod

import typings.mongodb.anon.Ok
import typings.mongodb.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOneWriteOpResult[TSchema /* <: `2` */] extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
  var ops: js.Array[TSchema]
  var result: Ok
}

object InsertOneWriteOpResult {
  @scala.inline
  def apply[TSchema](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any,
    ops: js.Array[TSchema],
    result: Ok
  ): InsertOneWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedId = insertedId.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOneWriteOpResult[TSchema]]
  }
}

