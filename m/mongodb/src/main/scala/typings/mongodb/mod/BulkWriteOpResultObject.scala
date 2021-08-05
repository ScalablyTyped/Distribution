package typings.mongodb.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteOpResultObject extends StObject {
  
  var deletedCount: js.UndefOr[scala.Double] = js.undefined
  
  var insertedCount: js.UndefOr[scala.Double] = js.undefined
  
  var insertedIds: js.UndefOr[NumberDictionary[js.Any]] = js.undefined
  
  var matchedCount: js.UndefOr[scala.Double] = js.undefined
  
  var modifiedCount: js.UndefOr[scala.Double] = js.undefined
  
  var result: js.UndefOr[js.Any] = js.undefined
  
  var upsertedCount: js.UndefOr[scala.Double] = js.undefined
  
  var upsertedIds: js.UndefOr[NumberDictionary[js.Any]] = js.undefined
}
object BulkWriteOpResultObject {
  
  inline def apply(): BulkWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkWriteOpResultObject]
  }
  
  extension [Self <: BulkWriteOpResultObject](x: Self) {
    
    inline def setDeletedCount(value: scala.Double): Self = StObject.set(x, "deletedCount", value.asInstanceOf[js.Any])
    
    inline def setDeletedCountUndefined: Self = StObject.set(x, "deletedCount", js.undefined)
    
    inline def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    inline def setInsertedCountUndefined: Self = StObject.set(x, "insertedCount", js.undefined)
    
    inline def setInsertedIds(value: NumberDictionary[js.Any]): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
    
    inline def setInsertedIdsUndefined: Self = StObject.set(x, "insertedIds", js.undefined)
    
    inline def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    inline def setMatchedCountUndefined: Self = StObject.set(x, "matchedCount", js.undefined)
    
    inline def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    inline def setModifiedCountUndefined: Self = StObject.set(x, "modifiedCount", js.undefined)
    
    inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    inline def setUpsertedCountUndefined: Self = StObject.set(x, "upsertedCount", js.undefined)
    
    inline def setUpsertedIds(value: NumberDictionary[js.Any]): Self = StObject.set(x, "upsertedIds", value.asInstanceOf[js.Any])
    
    inline def setUpsertedIdsUndefined: Self = StObject.set(x, "upsertedIds", js.undefined)
  }
}
