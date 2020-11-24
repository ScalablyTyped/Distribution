package typings.mongodb.mod

import typings.mongodb.anon.IdAny
import typings.mongodb.anon.Ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertOneWriteOpResult[TSchema /* <: IdAny */] extends js.Object {
  
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
  implicit class InsertOneWriteOpResultOps[Self <: InsertOneWriteOpResult[_], TSchema /* <: IdAny */] (val x: Self with InsertOneWriteOpResult[TSchema]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnection(value: js.Any): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedCount(value: scala.Double): Self = this.set("insertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedId(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
    ): Self = this.set("insertedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: TSchema*): Self = this.set("ops", js.Array(value :_*))
    
    @scala.inline
    def setOps(value: js.Array[TSchema]): Self = this.set("ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Ok): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
