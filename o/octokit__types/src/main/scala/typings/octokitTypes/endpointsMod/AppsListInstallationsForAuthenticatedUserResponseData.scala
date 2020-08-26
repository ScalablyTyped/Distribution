package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListInstallationsForAuthenticatedUserResponseData extends js.Object {
  var installations: js.Array[Account] = js.native
  var total_count: Double = js.native
}

object AppsListInstallationsForAuthenticatedUserResponseData {
  @scala.inline
  def apply(installations: js.Array[Account], total_count: Double): AppsListInstallationsForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponseData]
  }
  @scala.inline
  implicit class AppsListInstallationsForAuthenticatedUserResponseDataOps[Self <: AppsListInstallationsForAuthenticatedUserResponseData] (val x: Self) extends AnyVal {
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
    def setInstallationsVarargs(value: Account*): Self = this.set("installations", js.Array(value :_*))
    @scala.inline
    def setInstallations(value: js.Array[Account]): Self = this.set("installations", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
  
}

