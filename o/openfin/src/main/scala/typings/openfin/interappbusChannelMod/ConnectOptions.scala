package typings.openfin.interappbusChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends js.Object {
  var payload: js.UndefOr[js.Any] = js.native
  @JSName("wait")
  var wait_FConnectOptions: js.UndefOr[Boolean] = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
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
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

