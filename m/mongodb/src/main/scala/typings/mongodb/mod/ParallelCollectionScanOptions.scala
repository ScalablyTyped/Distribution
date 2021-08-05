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
  
  inline def apply(): ParallelCollectionScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelCollectionScanOptions]
  }
  
  extension [Self <: ParallelCollectionScanOptions](x: Self) {
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setNumCursors(value: scala.Double): Self = StObject.set(x, "numCursors", value.asInstanceOf[js.Any])
    
    inline def setNumCursorsUndefined: Self = StObject.set(x, "numCursors", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
