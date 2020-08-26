package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsDeviceAccount extends js.Object {
  // Not yet documented
  var password: js.UndefOr[String] = js.native
}

object WindowsDeviceAccount {
  @scala.inline
  def apply(): WindowsDeviceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDeviceAccount]
  }
  @scala.inline
  implicit class WindowsDeviceAccountOps[Self <: WindowsDeviceAccount] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
  
}

