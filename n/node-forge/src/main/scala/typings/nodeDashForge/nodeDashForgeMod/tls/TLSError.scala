package typings.nodeDashForge.nodeDashForgeMod.tls

import typings.nodeDashForge.nodeDashForgeStrings.client
import typings.nodeDashForge.nodeDashForgeStrings.server
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
    val __obj = js.Dynamic.literal(alert = alert, message = message, name = name, origin = origin.asInstanceOf[js.Any], send = send)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TLSError]
  }
}

