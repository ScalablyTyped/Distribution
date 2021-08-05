package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapReduceOptions extends StObject {
  
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  @JSName("finalize")
  var finalize_FMapReduceOptions: js.UndefOr[js.Function | String] = js.undefined
  
  var jsMode: js.UndefOr[Boolean] = js.undefined
  
  var keeptemp: js.UndefOr[Boolean] = js.undefined
  
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  var out: js.UndefOr[js.Object] = js.undefined
  
  var query: js.UndefOr[js.Object] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var scope: js.UndefOr[js.Object] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  var sort: js.UndefOr[js.Object] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object MapReduceOptions {
  
  inline def apply(): MapReduceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapReduceOptions]
  }
  
  extension [Self <: MapReduceOptions](x: Self) {
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setFinalize_(value: js.Function | String): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
    
    inline def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
    
    inline def setJsMode(value: Boolean): Self = StObject.set(x, "jsMode", value.asInstanceOf[js.Any])
    
    inline def setJsModeUndefined: Self = StObject.set(x, "jsMode", js.undefined)
    
    inline def setKeeptemp(value: Boolean): Self = StObject.set(x, "keeptemp", value.asInstanceOf[js.Any])
    
    inline def setKeeptempUndefined: Self = StObject.set(x, "keeptemp", js.undefined)
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOut(value: js.Object): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setScope(value: js.Object): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
