package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentStatusResponse extends js.Object {
  var created_at: String
  var creator: ReposCreateDeploymentStatusResponseCreator
  var deployment_url: String
  var description: String
  var environment: String
  var environment_url: String
  var id: Double
  var log_url: String
  var node_id: String
  var repository_url: String
  var state: String
  var target_url: String
  var updated_at: String
  var url: String
}

object ReposCreateDeploymentStatusResponse {
  @scala.inline
  def apply(
    created_at: String,
    creator: ReposCreateDeploymentStatusResponseCreator,
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
  ): ReposCreateDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, creator = creator, deployment_url = deployment_url, description = description, environment = environment, environment_url = environment_url, id = id, log_url = log_url, node_id = node_id, repository_url = repository_url, state = state, target_url = target_url, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ReposCreateDeploymentStatusResponse]
  }
}

