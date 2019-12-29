package typings.mongodb.mongodbMod

import typings.mongodb.Anon_IdAny
import typings.mongodb.Anon_NOk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOneWriteOpResult[TSchema /* <: Anon_IdAny */] extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
  var ops: js.Array[TSchema]
  var result: Anon_NOk
}

object InsertOneWriteOpResult {
  @scala.inline
  def apply[TSchema /* <: Anon_IdAny */](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any,
    ops: js.Array[TSchema],
    result: Anon_NOk
  ): InsertOneWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedId = insertedId.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsertOneWriteOpResult[TSchema]]
  }
}

