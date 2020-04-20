package typings.mongodb.mod

import typings.mongodb.AnonIdAny
import typings.mongodb.AnonOk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOneWriteOpResult[TSchema /* <: AnonIdAny */] extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
  var ops: js.Array[TSchema]
  var result: AnonOk
}

object InsertOneWriteOpResult {
  @scala.inline
  def apply[TSchema /* <: AnonIdAny */](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any,
    ops: js.Array[TSchema],
    result: AnonOk
  ): InsertOneWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedId = insertedId.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOneWriteOpResult[TSchema]]
  }
}

