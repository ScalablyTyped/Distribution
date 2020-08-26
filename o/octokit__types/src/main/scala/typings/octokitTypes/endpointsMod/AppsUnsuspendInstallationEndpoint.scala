package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsUnsuspendInstallationEndpoint extends js.Object {
  var installation_id: Double = js.native
}

object AppsUnsuspendInstallationEndpoint {
  @scala.inline
  def apply(installation_id: Double): AppsUnsuspendInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsUnsuspendInstallationEndpoint]
  }
  @scala.inline
  implicit class AppsUnsuspendInstallationEndpointOps[Self <: AppsUnsuspendInstallationEndpoint] (val x: Self) extends AnyVal {
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
    def setInstallation_id(value: Double): Self = this.set("installation_id", value.asInstanceOf[js.Any])
  }
  
}

