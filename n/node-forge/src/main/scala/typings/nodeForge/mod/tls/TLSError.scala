package typings.nodeForge.mod.tls

import typings.nodeForge.nodeForgeStrings.client
import typings.nodeForge.nodeForgeStrings.server
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TLSError extends Error {
  var alert: Alert
  var origin: server | client
  var send: Boolean
}

object TLSError {
  @scala.inline
  def apply(
    alert: Alert,
    message: String,
    name: String,
    origin: server | client,
    send: Boolean,
    stack: String = null
  ): TLSError = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TLSError]
  }
}

