package typings.mongodb.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteOpResultObject extends StObject {
  
  var deletedCount: js.UndefOr[scala.Double] = js.native
  
  var insertedCount: js.UndefOr[scala.Double] = js.native
  
  var insertedIds: js.UndefOr[NumberDictionary[js.Any]] = js.native
  
  var matchedCount: js.UndefOr[scala.Double] = js.native
  
  var modifiedCount: js.UndefOr[scala.Double] = js.native
  
  var result: js.UndefOr[js.Any] = js.native
  
  var upsertedCount: js.UndefOr[scala.Double] = js.native
  
  var upsertedIds: js.UndefOr[NumberDictionary[js.Any]] = js.native
}
object BulkWriteOpResultObject {
  
  @scala.inline
  def apply(): BulkWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkWriteOpResultObject]
  }
  
  @scala.inline
  implicit class BulkWriteOpResultObjectMutableBuilder[Self <: BulkWriteOpResultObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedCount(value: scala.Double): Self = StObject.set(x, "deletedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedCountUndefined: Self = StObject.set(x, "deletedCount", js.undefined)
    
    @scala.inline
    def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedCountUndefined: Self = StObject.set(x, "insertedCount", js.undefined)
    
    @scala.inline
    def setInsertedIds(value: NumberDictionary[js.Any]): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedIdsUndefined: Self = StObject.set(x, "insertedIds", js.undefined)
    
    @scala.inline
    def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedCountUndefined: Self = StObject.set(x, "matchedCount", js.undefined)
    
    @scala.inline
    def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedCountUndefined: Self = StObject.set(x, "modifiedCount", js.undefined)
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedCountUndefined: Self = StObject.set(x, "upsertedCount", js.undefined)
    
    @scala.inline
    def setUpsertedIds(value: NumberDictionary[js.Any]): Self = StObject.set(x, "upsertedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedIdsUndefined: Self = StObject.set(x, "upsertedIds", js.undefined)
  }
}
