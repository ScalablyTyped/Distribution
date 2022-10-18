package typings.octokitTypes

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.distTypesFetchMod.Fetch
import typings.octokitTypes.distTypesSignalMod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRequestRequestOptionsMod {
  
  trait RequestRequestOptions
    extends StObject
       with /* option */ StringDictionary[Any] {
    
    /**
      * Node only. Useful for custom proxy, certificate, or dns lookup.
      *
      * @see https://nodejs.org/api/http.html#http_class_http_agent
      */
    var agent: js.UndefOr[Any] = js.undefined
    
    /**
      * Custom replacement for built-in fetch method. Useful for testing or request hooks.
      */
    var fetch: js.UndefOr[Fetch] = js.undefined
    
    /**
      * Use an `AbortController` instance to cancel a request. In node you can only cancel streamed requests.
      */
    var signal: js.UndefOr[Signal] = js.undefined
    
    /**
      * Node only. Request/response timeout in ms, it resets on redirect. 0 to disable (OS limit applies). `options.request.signal` is recommended instead.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RequestRequestOptions {
    
    inline def apply(): RequestRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestRequestOptions]
    }
    
    extension [Self <: RequestRequestOptions](x: Self) {
      
      inline def setAgent(value: Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setFetch(value: Fetch): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setSignal(value: Signal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
