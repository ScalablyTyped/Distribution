package typings.mongodb.mod

import typings.mongodb.anon.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWriteOpResultObject extends StObject {
  
  //The connection object used for the operation.
  var connection: js.UndefOr[js.Any] = js.undefined
  
  //The number of documents deleted.
  var deletedCount: js.UndefOr[scala.Double] = js.undefined
  
  //The raw result returned from MongoDB, field will vary depending on server version.
  var result: N
}
object DeleteWriteOpResultObject {
  
  @scala.inline
  def apply(result: N): DeleteWriteOpResultObject = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWriteOpResultObject]
  }
  
  @scala.inline
  implicit class DeleteWriteOpResultObjectMutableBuilder[Self <: DeleteWriteOpResultObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setDeletedCount(value: scala.Double): Self = StObject.set(x, "deletedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedCountUndefined: Self = StObject.set(x, "deletedCount", js.undefined)
    
    @scala.inline
    def setResult(value: N): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
