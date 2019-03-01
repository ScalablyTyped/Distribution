package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var IncomingMessage: js.UndefOr[
    org.scalablytyped.runtime.Instantiable1[/* socket */ nodeLib.netMod.Socket, IncomingMessage]
  ] = js.undefined
  var ServerResponse: js.UndefOr[
    org.scalablytyped.runtime.Instantiable1[/* req */ IncomingMessage, ServerResponse]
  ] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    IncomingMessage: org.scalablytyped.runtime.Instantiable1[/* socket */ nodeLib.netMod.Socket, IncomingMessage] = null,
    ServerResponse: org.scalablytyped.runtime.Instantiable1[/* req */ IncomingMessage, ServerResponse] = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (IncomingMessage != null) __obj.updateDynamic("IncomingMessage")(IncomingMessage)
    if (ServerResponse != null) __obj.updateDynamic("ServerResponse")(ServerResponse)
    __obj.asInstanceOf[ServerOptions]
  }
}

