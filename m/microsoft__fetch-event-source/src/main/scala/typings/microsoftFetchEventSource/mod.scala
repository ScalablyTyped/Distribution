package typings.microsoftFetchEventSource

import typings.microsoftFetchEventSource.libCjsFetchMod.FetchEventSourceInit
import typings.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@microsoft/fetch-event-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@microsoft/fetch-event-source", "EventStreamContentType")
  @js.native
  val EventStreamContentType: /* "text/event-stream" */ String = js.native
  
  inline def fetchEventSource(
    input: RequestInfo,
    hasInputSignalInputHeadersInputOnOpenOnmessageOncloseOnerrorOpenWhenHiddenInputFetchRest: FetchEventSourceInit
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchEventSource")(input.asInstanceOf[js.Any], hasInputSignalInputHeadersInputOnOpenOnmessageOncloseOnerrorOpenWhenHiddenInputFetchRest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
