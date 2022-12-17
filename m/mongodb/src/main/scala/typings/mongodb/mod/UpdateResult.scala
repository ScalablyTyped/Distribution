package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResult extends StObject {
  
  /** Indicates whether this write result was acknowledged. If not, then all other members of this result will be undefined */
  var acknowledged: Boolean
  
  /** The number of documents that matched the filter */
  var matchedCount: scala.Double
  
  /** The number of documents that were modified */
  var modifiedCount: scala.Double
  
  /** The number of documents that were upserted */
  var upsertedCount: scala.Double
  
  /** The identifier of the inserted document if an upsert took place */
  var upsertedId: typings.bson.mod.ObjectId
}
object UpdateResult {
  
  inline def apply(
    acknowledged: Boolean,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    upsertedCount: scala.Double,
    upsertedId: typings.bson.mod.ObjectId
  ): UpdateResult = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult]
  }
  
  extension [Self <: UpdateResult](x: Self) {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    inline def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    inline def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    inline def setUpsertedId(value: typings.bson.mod.ObjectId): Self = StObject.set(x, "upsertedId", value.asInstanceOf[js.Any])
  }
}
