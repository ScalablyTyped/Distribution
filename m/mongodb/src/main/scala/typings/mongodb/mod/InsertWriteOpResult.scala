package typings.mongodb.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.mongodb.anon.IdAny
import typings.mongodb.anon.Ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertWriteOpResult[TSchema /* <: IdAny */] extends StObject {
  
  var connection: js.Any
  
  var insertedCount: scala.Double
  
  var insertedIds: NumberDictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
  ]
  
  var ops: js.Array[TSchema]
  
  var result: Ok
}
object InsertWriteOpResult {
  
  inline def apply[TSchema /* <: IdAny */](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedIds: NumberDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
    ],
    ops: js.Array[TSchema],
    result: Ok
  ): InsertWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedIds = insertedIds.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertWriteOpResult[TSchema]]
  }
  
  extension [Self <: InsertWriteOpResult[?], TSchema /* <: IdAny */](x: Self & InsertWriteOpResult[TSchema]) {
    
    inline def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    inline def setInsertedIds(
      value: NumberDictionary[
          /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
        ]
    ): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
    
    inline def setOps(value: js.Array[TSchema]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsVarargs(value: TSchema*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    inline def setResult(value: Ok): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
