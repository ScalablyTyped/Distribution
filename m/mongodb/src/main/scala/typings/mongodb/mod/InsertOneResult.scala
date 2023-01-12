package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertOneResult[TSchema] extends StObject {
  
  /** Indicates whether this write result was acknowledged. If not, then all other members of this result will be undefined */
  var acknowledged: Boolean
  
  /** The identifier that was inserted. If the server generated the identifier, this value will be null as the driver does not have access to that data */
  var insertedId: InferIdType[TSchema]
}
object InsertOneResult {
  
  inline def apply[TSchema](acknowledged: Boolean, insertedId: InferIdType[TSchema]): InsertOneResult[TSchema] = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], insertedId = insertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOneResult[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertOneResult[?], TSchema] (val x: Self & InsertOneResult[TSchema]) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setInsertedId(value: InferIdType[TSchema]): Self = StObject.set(x, "insertedId", value.asInstanceOf[js.Any])
  }
}
