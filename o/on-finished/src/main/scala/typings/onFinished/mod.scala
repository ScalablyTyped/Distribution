package typings.onFinished

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingMessage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    msg: IncomingMessage,
    listener: js.Function2[/* err */ Error | Null, /* msg */ IncomingMessage, Unit]
  ): IncomingMessage = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[IncomingMessage]
  inline def apply(
    msg: OutgoingMessage,
    listener: js.Function2[/* err */ Error | Null, /* msg */ OutgoingMessage, Unit]
  ): OutgoingMessage = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[OutgoingMessage]
  
  @JSImport("on-finished", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFinished(msg: IncomingMessage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinished")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFinished(msg: OutgoingMessage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinished")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
