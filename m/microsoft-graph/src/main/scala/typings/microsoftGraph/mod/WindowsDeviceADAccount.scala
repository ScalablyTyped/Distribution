package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsDeviceADAccount extends WindowsDeviceAccount {
  // Not yet documented
  var domainName: js.UndefOr[String] = js.native
  // Not yet documented
  var userName: js.UndefOr[String] = js.native
}

object WindowsDeviceADAccount {
  @scala.inline
  def apply(): WindowsDeviceADAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDeviceADAccount]
  }
  @scala.inline
  implicit class WindowsDeviceADAccountOps[Self <: WindowsDeviceADAccount] (val x: Self) extends AnyVal {
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

