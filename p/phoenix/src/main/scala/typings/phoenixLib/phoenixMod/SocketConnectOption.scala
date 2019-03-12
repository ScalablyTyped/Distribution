package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConnectOption extends js.Object {
  var heartbeatIntervalMs: scala.Double
  var longpollernumber: scala.Double
  var params: js.Object | js.Function
  var reconnectAfterMs: scala.Double
  var timeout: scala.Double
  var transport: js.Any
  def decode(payload: java.lang.String, callback: js.Function): js.Any
  def encode(payload: js.Object, callback: js.Function): js.Any
  def logger(kind: java.lang.String, message: java.lang.String, data: js.Any): scala.Unit
}

object SocketConnectOption {
  @scala.inline
  def apply(
    decode: (java.lang.String, js.Function) => js.Any,
    encode: (js.Object, js.Function) => js.Any,
    heartbeatIntervalMs: scala.Double,
    logger: (java.lang.String, java.lang.String, js.Any) => scala.Unit,
    longpollernumber: scala.Double,
    params: js.Object | js.Function,
    reconnectAfterMs: scala.Double,
    timeout: scala.Double,
    transport: js.Any
  ): SocketConnectOption = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), heartbeatIntervalMs = heartbeatIntervalMs, logger = js.Any.fromFunction3(logger), longpollernumber = longpollernumber, params = params.asInstanceOf[js.Any], reconnectAfterMs = reconnectAfterMs, timeout = timeout, transport = transport)
  
    __obj.asInstanceOf[SocketConnectOption]
  }
}

