package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mongodbStrings.majority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mongodb.mongodb.UpdateOneOptions & {  multi :boolean | undefined} */
trait UpdateOneOptionsmultibool extends StObject {
  
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  var upsert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[Double | majority | String] = js.undefined
  
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[Double] = js.undefined
}
object UpdateOneOptionsmultibool {
  
  @scala.inline
  def apply(): UpdateOneOptionsmultibool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOneOptionsmultibool]
  }
  
  @scala.inline
  implicit class UpdateOneOptionsmultiboolMutableBuilder[Self <: UpdateOneOptionsmultibool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayFilters(value: js.Array[js.Object]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    @scala.inline
    def setArrayFiltersVarargs(value: js.Object*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
    
    @scala.inline
    def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    
    @scala.inline
    def setW(value: Double | majority | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
