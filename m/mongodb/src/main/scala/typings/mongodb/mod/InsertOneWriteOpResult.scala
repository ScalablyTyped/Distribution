package typings.mongodb.mod

import typings.mongodb.anon.IdAny
import typings.mongodb.anon.Ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertOneWriteOpResult[TSchema /* <: IdAny */] extends StObject {
  
  var connection: js.Any = js.native
  
  var insertedCount: scala.Double = js.native
  
  var insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any = js.native
  
  var ops: js.Array[TSchema] = js.native
  
  var result: Ok = js.native
}
object InsertOneWriteOpResult {
  
  @scala.inline
  def apply[TSchema /* <: IdAny */](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any,
    ops: js.Array[TSchema],
    result: Ok
  ): InsertOneWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedId = insertedId.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOneWriteOpResult[TSchema]]
  }
  
  @scala.inline
  implicit class InsertOneWriteOpResultMutableBuilder[Self <: InsertOneWriteOpResult[_], TSchema /* <: IdAny */] (val x: Self with InsertOneWriteOpResult[TSchema]) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedId(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
    ): Self = StObject.set(x, "insertedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: js.Array[TSchema]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: TSchema*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: Ok): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
