package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResult[TSchema /* <: Document */] extends StObject {
  
  /** Indicates whether this write result was acknowledged. If not, then all other members of this result will be undefined */
  var acknowledged: Boolean
  
  /** The number of documents that matched the filter */
  var matchedCount: scala.Double
  
  /** The number of documents that were modified */
  var modifiedCount: scala.Double
  
  /** The number of documents that were upserted */
  var upsertedCount: scala.Double
  
  /** The identifier of the inserted document if an upsert took place */
  var upsertedId: InferIdType[TSchema] | Null
}
object UpdateResult {
  
  inline def apply[TSchema /* <: Document */](
    acknowledged: Boolean,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    upsertedCount: scala.Double
  ): UpdateResult[TSchema] = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = null)
    __obj.asInstanceOf[UpdateResult[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResult[?], TSchema /* <: Document */] (val x: Self & UpdateResult[TSchema]) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    inline def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    inline def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    inline def setUpsertedId(value: InferIdType[TSchema]): Self = StObject.set(x, "upsertedId", value.asInstanceOf[js.Any])
    
    inline def setUpsertedIdNull: Self = StObject.set(x, "upsertedId", null)
  }
}
