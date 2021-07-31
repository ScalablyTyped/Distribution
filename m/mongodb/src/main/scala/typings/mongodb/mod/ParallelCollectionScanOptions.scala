package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelCollectionScanOptions extends StObject {
  
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  var numCursors: js.UndefOr[scala.Double] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object ParallelCollectionScanOptions {
  
  @scala.inline
  def apply(): ParallelCollectionScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelCollectionScanOptions]
  }
  
  @scala.inline
  implicit class ParallelCollectionScanOptionsMutableBuilder[Self <: ParallelCollectionScanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setNumCursors(value: scala.Double): Self = StObject.set(x, "numCursors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumCursorsUndefined: Self = StObject.set(x, "numCursors", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
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
