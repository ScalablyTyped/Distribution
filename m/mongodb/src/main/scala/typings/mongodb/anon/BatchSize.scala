package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.ReadPreferenceOrMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSize extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var nameOnly: js.UndefOr[Boolean] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object BatchSize {
  
  @scala.inline
  def apply(): BatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSize]
  }
  
  @scala.inline
  implicit class BatchSizeMutableBuilder[Self <: BatchSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setNameOnly(value: Boolean): Self = StObject.set(x, "nameOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOnlyUndefined: Self = StObject.set(x, "nameOnly", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
