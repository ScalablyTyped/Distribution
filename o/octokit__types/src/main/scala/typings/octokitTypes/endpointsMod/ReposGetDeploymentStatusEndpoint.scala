package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetDeploymentStatusEndpoint extends js.Object {
  var deployment_id: Double = js.native
  var owner: String = js.native
  var repo: String = js.native
  var status_id: Double = js.native
}

object ReposGetDeploymentStatusEndpoint {
  @scala.inline
  def apply(deployment_id: Double, owner: String, repo: String, status_id: Double): ReposGetDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status_id = status_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetDeploymentStatusEndpoint]
  }
  @scala.inline
  implicit class ReposGetDeploymentStatusEndpointOps[Self <: ReposGetDeploymentStatusEndpoint] (val x: Self) extends AnyVal {
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
    def setDeployment_id(value: Double): Self = this.set("deployment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus_id(value: Double): Self = this.set("status_id", value.asInstanceOf[js.Any])
  }
  
}

