package typings.node.httpMod

import org.scalablytyped.runtime.Instantiable1
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]] = js.undefined
  var ServerResponse: js.UndefOr[Instantiable1[/* req */ IncomingMessage, typings.node.httpMod.ServerResponse]] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    IncomingMessage: Instantiable1[/* socket */ Socket, IncomingMessage] = null,
    ServerResponse: Instantiable1[/* req */ IncomingMessage, ServerResponse] = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (IncomingMessage != null) __obj.updateDynamic("IncomingMessage")(IncomingMessage)
    if (ServerResponse != null) __obj.updateDynamic("ServerResponse")(ServerResponse)
    __obj.asInstanceOf[ServerOptions]
  }
}

