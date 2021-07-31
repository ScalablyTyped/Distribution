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
  
  @scala.inline
  def apply(): MapReduceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapReduceOptions]
  }
  
  @scala.inline
  implicit class MapReduceOptionsMutableBuilder[Self <: MapReduceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    @scala.inline
    def setFinalize_(value: js.Function | String): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
    
    @scala.inline
    def setJsMode(value: Boolean): Self = StObject.set(x, "jsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsModeUndefined: Self = StObject.set(x, "jsMode", js.undefined)
    
    @scala.inline
    def setKeeptemp(value: Boolean): Self = StObject.set(x, "keeptemp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeeptempUndefined: Self = StObject.set(x, "keeptemp", js.undefined)
    
    @scala.inline
    def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOut(value: js.Object): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setScope(value: js.Object): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
