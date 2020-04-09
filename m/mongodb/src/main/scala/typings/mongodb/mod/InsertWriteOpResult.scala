package typings.mongodb.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.mongodb.AnonIdAny
import typings.mongodb.AnonOk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertWriteOpResult[TSchema /* <: AnonIdAny */] extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedIds: NumberDictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
  ]
  var ops: js.Array[TSchema]
  var result: AnonOk
}

object InsertWriteOpResult {
  @scala.inline
  def apply[TSchema /* <: AnonIdAny */](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedIds: NumberDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
    ],
    ops: js.Array[TSchema],
    result: AnonOk
  ): InsertWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedIds = insertedIds.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsertWriteOpResult[TSchema]]
  }
}

