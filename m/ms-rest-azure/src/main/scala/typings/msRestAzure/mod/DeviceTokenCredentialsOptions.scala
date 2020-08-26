package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceTokenCredentialsOptions extends LoginWithUsernamePasswordOptions {
  /**
    * The user name for account in the form: 'user@example.com'. Default value is 'user@example.com'.
    */
  var username: js.UndefOr[String] = js.native
}

object DeviceTokenCredentialsOptions {
  @scala.inline
  def apply(): DeviceTokenCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTokenCredentialsOptions]
  }
  @scala.inline
  implicit class DeviceTokenCredentialsOptionsOps[Self <: DeviceTokenCredentialsOptions] (val x: Self) extends AnyVal {
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

