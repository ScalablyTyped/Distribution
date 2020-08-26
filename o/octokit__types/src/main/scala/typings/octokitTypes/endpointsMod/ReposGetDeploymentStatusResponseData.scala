package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetDeploymentStatusResponseData extends js.Object {
  var created_at: String = js.native
  var creator: Avatarurl = js.native
  var deployment_url: String = js.native
  var description: String = js.native
  var environment: String = js.native
  var environment_url: String = js.native
  var id: Double = js.native
  var log_url: String = js.native
  var node_id: String = js.native
  var repository_url: String = js.native
  var state: String = js.native
  var target_url: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object ReposGetDeploymentStatusResponseData {
  @scala.inline
  def apply(
    created_at: String,
    creator: Avatarurl,
    deployment_url: String,
    description: String,
    environment: String,
    environment_url: String,
    id: Double,
    log_url: String,
    node_id: String,
    repository_url: String,
    state: String,
    target_url: String,
    updated_at: String,
    url: String
  ): ReposGetDeploymentStatusResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], deployment_url = deployment_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environment_url = environment_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], log_url = log_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetDeploymentStatusResponseData]
  }
  @scala.inline
  implicit class ReposGetDeploymentStatusResponseDataOps[Self <: ReposGetDeploymentStatusResponseData] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Avatarurl): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeployment_url(value: String): Self = this.set("deployment_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment_url(value: String): Self = this.set("environment_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog_url(value: String): Self = this.set("log_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository_url(value: String): Self = this.set("repository_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget_url(value: String): Self = this.set("target_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

