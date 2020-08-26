package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignUpOptions extends js.Object {
  var installationId: js.UndefOr[String] = js.native
  var useMasterKey: js.UndefOr[Boolean] = js.native
}

object SignUpOptions {
  @scala.inline
  def apply(): SignUpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignUpOptions]
  }
  @scala.inline
  implicit class SignUpOptionsOps[Self <: SignUpOptions] (val x: Self) extends AnyVal {
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
    def setInstallationId(value: String): Self = this.set("installationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallationId: Self = this.set("installationId", js.undefined)
    @scala.inline
    def setUseMasterKey(value: Boolean): Self = this.set("useMasterKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMasterKey: Self = this.set("useMasterKey", js.undefined)
  }
  
}

