package typings.mongodb.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertManyResult[TSchema] extends StObject {
  
  /** Indicates whether this write result was acknowledged. If not, then all other members of this result will be undefined */
  var acknowledged: Boolean
  
  /** The number of inserted documents for this operations */
  var insertedCount: scala.Double
  
  /** Map of the index of the inserted document to the id of the inserted document */
  var insertedIds: NumberDictionary[InferIdType[TSchema]]
}
object InsertManyResult {
  
  inline def apply[TSchema](
    acknowledged: Boolean,
    insertedCount: scala.Double,
    insertedIds: NumberDictionary[InferIdType[TSchema]]
  ): InsertManyResult[TSchema] = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedIds = insertedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertManyResult[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertManyResult[?], TSchema] (val x: Self & InsertManyResult[TSchema]) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    inline def setInsertedIds(value: NumberDictionary[InferIdType[TSchema]]): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
  }
}
