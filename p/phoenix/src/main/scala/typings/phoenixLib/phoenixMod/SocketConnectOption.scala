package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConnectOption extends js.Object {
  var binaryType: BinaryType
  var heartbeatIntervalMs: scala.Double
  var longpollerTimeout: scala.Double
  var params: js.Object | js.Function0[js.Object]
  var timeout: scala.Double
  var transport: java.lang.String
  def decode(payload: java.lang.String, callback: js.Function1[/* decoded */ js.Any, scala.Unit]): scala.Unit
  def encode(payload: js.Object, callback: js.Function1[/* encoded */ js.Any, scala.Unit]): scala.Unit
  def logger(kind: java.lang.String, message: java.lang.String, data: js.Any): scala.Unit
  def reconnectAfterMs(tries: scala.Double): scala.Double
  def rejoinAfterMs(tries: scala.Double): scala.Double
}

object SocketConnectOption {
  @scala.inline
  def apply(
    binaryType: BinaryType,
    decode: (java.lang.String, js.Function1[/* decoded */ js.Any, scala.Unit]) => scala.Unit,
    encode: (js.Object, js.Function1[/* encoded */ js.Any, scala.Unit]) => scala.Unit,
    heartbeatIntervalMs: scala.Double,
    logger: (java.lang.String, java.lang.String, js.Any) => scala.Unit,
    longpollerTimeout: scala.Double,
    params: js.Object | js.Function0[js.Object],
    reconnectAfterMs: scala.Double => scala.Double,
    rejoinAfterMs: scala.Double => scala.Double,
    timeout: scala.Double,
    transport: java.lang.String
  ): SocketConnectOption = {
    val __obj = js.Dynamic.literal(binaryType = binaryType, decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), heartbeatIntervalMs = heartbeatIntervalMs, logger = js.Any.fromFunction3(logger), longpollerTimeout = longpollerTimeout, params = params.asInstanceOf[js.Any], reconnectAfterMs = js.Any.fromFunction1(reconnectAfterMs), rejoinAfterMs = js.Any.fromFunction1(rejoinAfterMs), timeout = timeout, transport = transport)
  
    __obj.asInstanceOf[SocketConnectOption]
  }
}

