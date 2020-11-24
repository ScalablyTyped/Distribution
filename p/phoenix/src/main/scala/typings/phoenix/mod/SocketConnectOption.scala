package typings.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketConnectOption extends js.Object {
  
  var binaryType: BinaryType = js.native
  
  def decode(payload: String, callback: js.Function1[/* decoded */ js.Any, Unit]): Unit = js.native
  
  def encode(payload: js.Object, callback: js.Function1[/* encoded */ js.Any, Unit]): Unit = js.native
  
  var heartbeatIntervalMs: Double = js.native
  
  def logger(kind: String, message: String, data: js.Any): Unit = js.native
  
  var longpollerTimeout: Double = js.native
  
  var params: js.Object | js.Function0[js.Object] = js.native
  
  def reconnectAfterMs(tries: Double): Double = js.native
  
  def rejoinAfterMs(tries: Double): Double = js.native
  
  var timeout: Double = js.native
  
  var transport: String = js.native
  
  var vsn: String = js.native
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
    transport: String,
    vsn: String
  ): SocketConnectOption = {
    val __obj = js.Dynamic.literal(binaryType = binaryType.asInstanceOf[js.Any], decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], logger = js.Any.fromFunction3(logger), longpollerTimeout = longpollerTimeout.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], reconnectAfterMs = js.Any.fromFunction1(reconnectAfterMs), rejoinAfterMs = js.Any.fromFunction1(rejoinAfterMs), timeout = timeout.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any], vsn = vsn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOption]
  }
  
  @scala.inline
  implicit class SocketConnectOptionOps[Self <: SocketConnectOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinaryType(value: BinaryType): Self = this.set("binaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecode(value: (String, js.Function1[/* decoded */ js.Any, Unit]) => Unit): Self = this.set("decode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEncode(value: (js.Object, js.Function1[/* encoded */ js.Any, Unit]) => Unit): Self = this.set("encode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeartbeatIntervalMs(value: Double): Self = this.set("heartbeatIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: (String, String, js.Any) => Unit): Self = this.set("logger", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLongpollerTimeout(value: Double): Self = this.set("longpollerTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsFunction0(value: () => js.Object): Self = this.set("params", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParams(value: js.Object | js.Function0[js.Object]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectAfterMs(value: Double => Double): Self = this.set("reconnectAfterMs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRejoinAfterMs(value: Double => Double): Self = this.set("rejoinAfterMs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsn(value: String): Self = this.set("vsn", value.asInstanceOf[js.Any])
  }
}
