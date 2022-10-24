package typings.microsoftFetchEventSource

import typings.microsoftFetchEventSource.anon.FnCall
import typings.microsoftFetchEventSource.libCjsParseMod.EventSourceMessage
import typings.std.Record
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsFetchMod {
  
  @JSImport("@microsoft/fetch-event-source/lib/cjs/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@microsoft/fetch-event-source/lib/cjs/fetch", "EventStreamContentType")
  @js.native
  val EventStreamContentType: /* "text/event-stream" */ String = js.native
  
  inline def fetchEventSource(input: RequestInfo, param1: FetchEventSourceInit): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchEventSource")(input.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait FetchEventSourceInit
    extends StObject
       with RequestInit {
    
    var fetch: js.UndefOr[FnCall] = js.undefined
    
    @JSName("headers")
    var headers_FetchEventSourceInit: js.UndefOr[Record[String, String]] = js.undefined
    
    var onclose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onerror: js.UndefOr[js.Function1[/* err */ Any, js.UndefOr[Double | Null | Unit]]] = js.undefined
    
    var onmessage: js.UndefOr[js.Function1[/* ev */ EventSourceMessage, Unit]] = js.undefined
    
    var onopen: js.UndefOr[js.Function1[/* response */ Response, js.Promise[Unit]]] = js.undefined
    
    var openWhenHidden: js.UndefOr[Boolean] = js.undefined
  }
  object FetchEventSourceInit {
    
    inline def apply(): FetchEventSourceInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchEventSourceInit]
    }
    
    extension [Self <: FetchEventSourceInit](x: Self) {
      
      inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setOnerror(value: /* err */ Any => js.UndefOr[Double | Null | Unit]): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnmessage(value: /* ev */ EventSourceMessage => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
      
      inline def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
      
      inline def setOnopen(value: /* response */ Response => js.Promise[Unit]): Self = StObject.set(x, "onopen", js.Any.fromFunction1(value))
      
      inline def setOnopenUndefined: Self = StObject.set(x, "onopen", js.undefined)
      
      inline def setOpenWhenHidden(value: Boolean): Self = StObject.set(x, "openWhenHidden", value.asInstanceOf[js.Any])
      
      inline def setOpenWhenHiddenUndefined: Self = StObject.set(x, "openWhenHidden", js.undefined)
    }
  }
}
