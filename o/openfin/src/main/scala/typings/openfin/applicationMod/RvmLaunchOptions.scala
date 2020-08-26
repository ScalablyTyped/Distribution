package typings.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RvmLaunchOptions extends js.Object {
  var noUi: js.UndefOr[Boolean] = js.native
  var userAppConfigArgs: js.UndefOr[js.Object] = js.native
}

object RvmLaunchOptions {
  @scala.inline
  def apply(): RvmLaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RvmLaunchOptions]
  }
  @scala.inline
  implicit class RvmLaunchOptionsOps[Self <: RvmLaunchOptions] (val x: Self) extends AnyVal {
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
    def setNoUi(value: Boolean): Self = this.set("noUi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUi: Self = this.set("noUi", js.undefined)
    @scala.inline
    def setUserAppConfigArgs(value: js.Object): Self = this.set("userAppConfigArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAppConfigArgs: Self = this.set("userAppConfigArgs", js.undefined)
  }
  
}

