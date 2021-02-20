package typings.octokitTypes

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.octokitTypes.fetchMod.Fetch
import typings.octokitTypes.signalMod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestRequestOptionsMod {
  
  @js.native
  trait RequestRequestOptions
    extends /**
    * Any additional parameter will be passed as follows
    * 1. URL parameter if `':parameter'` or `{parameter}` is part of `url`
    * 2. Query parameter if `method` is `'GET'` or `'HEAD'`
    * 3. Request body if `parameter` is `'data'`
    * 4. JSON in the request body in the form of `body[parameter]` unless `parameter` key is `'data'`
    */
  /* parameter */ StringDictionary[js.Any] {
    
    /**
      * Node only. Useful for custom proxy, certificate, or dns lookup.
      */
    var agent: js.UndefOr[Agent] = js.native
    
    /**
      * Custom replacement for built-in fetch method. Useful for testing or request hooks.
      */
    var fetch: js.UndefOr[Fetch] = js.native
    
    /**
      * Use an `AbortController` instance to cancel a request. In node you can only cancel streamed requests.
      */
    var signal: js.UndefOr[Signal] = js.native
    
    /**
      * Node only. Request/response timeout in ms, it resets on redirect. 0 to disable (OS limit applies). `options.request.signal` is recommended instead.
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object RequestRequestOptions {
    
    @scala.inline
    def apply(): RequestRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestRequestOptions]
    }
    
    @scala.inline
    implicit class RequestRequestOptionsMutableBuilder[Self <: RequestRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setFetch(value: Fetch): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setSignal(value: Signal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
