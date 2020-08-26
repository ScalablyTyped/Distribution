package typings.phoenix.anon

import typings.phoenix.mod.BinaryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<phoenix.phoenix.SocketConnectOption> */
@js.native
trait PartialSocketConnectOptio extends js.Object {
  var binaryType: js.UndefOr[BinaryType] = js.native
  var decode: js.UndefOr[
    js.Function2[/* payload */ String, /* callback */ js.Function1[/* decoded */ js.Any, Unit], Unit]
  ] = js.native
  var encode: js.UndefOr[
    js.Function2[
      /* payload */ js.Object, 
      /* callback */ js.Function1[/* encoded */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  var heartbeatIntervalMs: js.UndefOr[Double] = js.native
  var logger: js.UndefOr[js.Function3[/* kind */ String, /* message */ String, /* data */ js.Any, Unit]] = js.native
  var longpollerTimeout: js.UndefOr[Double] = js.native
  var params: js.UndefOr[js.Object | js.Function0[js.Object]] = js.native
  var reconnectAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.native
  var rejoinAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var transport: js.UndefOr[String] = js.native
}

object PartialSocketConnectOptio {
  @scala.inline
  def apply(): PartialSocketConnectOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSocketConnectOptio]
  }
  @scala.inline
  implicit class PartialSocketConnectOptioOps[Self <: PartialSocketConnectOptio] (val x: Self) extends AnyVal {
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
    def deleteBinaryType: Self = this.set("binaryType", js.undefined)
    @scala.inline
    def setDecode(value: (/* payload */ String, /* callback */ js.Function1[/* decoded */ js.Any, Unit]) => Unit): Self = this.set("decode", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
    @scala.inline
    def setEncode(value: (/* payload */ js.Object, /* callback */ js.Function1[/* encoded */ js.Any, Unit]) => Unit): Self = this.set("encode", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setHeartbeatIntervalMs(value: Double): Self = this.set("heartbeatIntervalMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeatIntervalMs: Self = this.set("heartbeatIntervalMs", js.undefined)
    @scala.inline
    def setLogger(value: (/* kind */ String, /* message */ String, /* data */ js.Any) => Unit): Self = this.set("logger", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setLongpollerTimeout(value: Double): Self = this.set("longpollerTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongpollerTimeout: Self = this.set("longpollerTimeout", js.undefined)
    @scala.inline
    def setParamsFunction0(value: () => js.Object): Self = this.set("params", js.Any.fromFunction0(value))
    @scala.inline
    def setParams(value: js.Object | js.Function0[js.Object]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setReconnectAfterMs(value: /* tries */ Double => Double): Self = this.set("reconnectAfterMs", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReconnectAfterMs: Self = this.set("reconnectAfterMs", js.undefined)
    @scala.inline
    def setRejoinAfterMs(value: /* tries */ Double => Double): Self = this.set("rejoinAfterMs", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRejoinAfterMs: Self = this.set("rejoinAfterMs", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
  
}

