package typings.next

import typings.react.mod.MutableRefObject
import typings.std.ReturnType
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalHelpersUseWebsocketMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/helpers/use-websocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSendMessage(
    webSocketRef: ReturnType[js.Function1[/* assetPrefix */ String, MutableRefObject[js.UndefOr[WebSocket]]]]
  ): js.Function1[/* data */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSendMessage")(webSocketRef.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* data */ Any, Unit]]
  
  inline def useWebsocket(assetPrefix: String): MutableRefObject[js.UndefOr[WebSocket]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWebsocket")(assetPrefix.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[js.UndefOr[WebSocket]]]
  
  inline def useWebsocketPing(
    websocketRef: ReturnType[js.Function1[/* assetPrefix */ String, MutableRefObject[js.UndefOr[WebSocket]]]]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWebsocketPing")(websocketRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
