package typings.mongodb.mod

import typings.mongodb.anon.IdObjectId
import typings.mongodb.anon.NModified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceWriteOpResult extends UpdateWriteOpResult {
  
  var ops: js.Array[_] = js.native
}
object ReplaceWriteOpResult {
  
  @scala.inline
  def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    ops: js.Array[_],
    result: NModified,
    upsertedCount: scala.Double,
    upsertedId: IdObjectId
  ): ReplaceWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceWriteOpResult]
  }
  
  @scala.inline
  implicit class ReplaceWriteOpResultMutableBuilder[Self <: ReplaceWriteOpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOps(value: js.Array[_]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: js.Any*): Self = StObject.set(x, "ops", js.Array(value :_*))
  }
}
