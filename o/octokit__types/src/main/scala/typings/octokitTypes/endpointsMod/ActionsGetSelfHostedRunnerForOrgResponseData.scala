package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetSelfHostedRunnerForOrgResponseData extends js.Object {
  var busy: Boolean = js.native
  var id: Double = js.native
  var name: String = js.native
  var os: String = js.native
  var status: String = js.native
}

object ActionsGetSelfHostedRunnerForOrgResponseData {
  @scala.inline
  def apply(busy: Boolean, id: Double, name: String, os: String, status: String): ActionsGetSelfHostedRunnerForOrgResponseData = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetSelfHostedRunnerForOrgResponseData]
  }
  @scala.inline
  implicit class ActionsGetSelfHostedRunnerForOrgResponseDataOps[Self <: ActionsGetSelfHostedRunnerForOrgResponseData] (val x: Self) extends AnyVal {
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
    def setBusy(value: Boolean): Self = this.set("busy", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

