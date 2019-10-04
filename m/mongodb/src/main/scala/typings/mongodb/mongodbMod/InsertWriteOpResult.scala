package typings.mongodb.mongodbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.mongodb.Anon_NOk
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertWriteOpResult[TSchema /* <: Record[String, _] */] extends js.Object {
  var connection: js.Any
  var insertedCount: scala.Double
  var insertedIds: NumberDictionary[
    /* import warning: ImportType.apply Failed type conversion: TSchema['_id'] */ js.Any
  ]
  var ops: js.Array[TSchema]
  var result: Anon_NOk
}

object InsertWriteOpResult {
  @scala.inline
  def apply[TSchema /* <: Record[String, _] */](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedIds: NumberDictionary[
      /* import warning: ImportType.apply Failed type conversion: TSchema['_id'] */ js.Any
    ],
    ops: js.Array[TSchema],
    result: Anon_NOk
  ): InsertWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection, insertedCount = insertedCount, insertedIds = insertedIds, ops = ops, result = result)
  
    __obj.asInstanceOf[InsertWriteOpResult[TSchema]]
  }
}

