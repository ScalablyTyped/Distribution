package typings.octokitTypes

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.octokitTypes.fetchMod.Fetch
import typings.octokitTypes.signalMod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestRequestOptionsMod {
  
  trait RequestRequestOptions
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    /**
      * Node only. Useful for custom proxy, certificate, or dns lookup.
      */
    var agent: js.UndefOr[Agent] = js.undefined
    
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
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
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
