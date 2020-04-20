package typings.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConnectOption extends js.Object {
  var binaryType: BinaryType
  var heartbeatIntervalMs: Double
  var longpollerTimeout: Double
  var params: js.Object | js.Function0[js.Object]
  var timeout: Double
  var transport: String
  def decode(payload: String, callback: js.Function1[/* decoded */ js.Any, Unit]): Unit
  def encode(payload: js.Object, callback: js.Function1[/* encoded */ js.Any, Unit]): Unit
  def logger(kind: String, message: String, data: js.Any): Unit
  def reconnectAfterMs(tries: Double): Double
  def rejoinAfterMs(tries: Double): Double
}

object SocketConnectOption {
  @scala.inline
  def apply(
    binaryType: BinaryType,
    decode: (String, js.Function1[/* decoded */ js.Any, Unit]) => Unit,
    encode: (js.Object, js.Function1[/* encoded */ js.Any, Unit]) => Unit,
    heartbeatIntervalMs: Double,
    logger: (String, String, js.Any) => Unit,
    longpollerTimeout: Double,
    params: js.Object | js.Function0[js.Object],
    reconnectAfterMs: Double => Double,
    rejoinAfterMs: Double => Double,
    timeout: Double,
    transport: String
  ): SocketConnectOption = {
    val __obj = js.Dynamic.literal(binaryType = binaryType.asInstanceOf[js.Any], decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], logger = js.Any.fromFunction3(logger), longpollerTimeout = longpollerTimeout.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], reconnectAfterMs = js.Any.fromFunction1(reconnectAfterMs), rejoinAfterMs = js.Any.fromFunction1(rejoinAfterMs), timeout = timeout.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOption]
  }
}

