package typings.next

import typings.next.anon.Log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientDevErrorOverlayWebsocketMod {
  
  @JSImport("next/dist/client/dev/error-overlay/websocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMessageListener(cb: js.Function1[/* event */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMessageListener")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def connectHMR(options: Log): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHMR")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sendMessage(data: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
