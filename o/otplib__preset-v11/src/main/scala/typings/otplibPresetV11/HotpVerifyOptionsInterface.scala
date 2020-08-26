package typings.otplibPresetV11

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotpVerifyOptionsInterface extends js.Object {
  var counter: js.UndefOr[Double] = js.native
  var secret: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
}

object HotpVerifyOptionsInterface {
  @scala.inline
  def apply(): HotpVerifyOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotpVerifyOptionsInterface]
  }
  @scala.inline
  implicit class HotpVerifyOptionsInterfaceOps[Self <: HotpVerifyOptionsInterface] (val x: Self) extends AnyVal {
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
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

