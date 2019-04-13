package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentStatusResponse extends js.Object {
  var created_at: java.lang.String
  var creator: ReposCreateDeploymentStatusResponseCreator
  var deployment_url: java.lang.String
  var description: java.lang.String
  var environment: java.lang.String
  var environment_url: java.lang.String
  var id: scala.Double
  var log_url: java.lang.String
  var node_id: java.lang.String
  var repository_url: java.lang.String
  var state: java.lang.String
  var target_url: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ReposCreateDeploymentStatusResponse {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    creator: ReposCreateDeploymentStatusResponseCreator,
    deployment_url: java.lang.String,
    description: java.lang.String,
    environment: java.lang.String,
    environment_url: java.lang.String,
    id: scala.Double,
    log_url: java.lang.String,
    node_id: java.lang.String,
    repository_url: java.lang.String,
    state: java.lang.String,
    target_url: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ReposCreateDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, creator = creator, deployment_url = deployment_url, description = description, environment = environment, environment_url = environment_url, id = id, log_url = log_url, node_id = node_id, repository_url = repository_url, state = state, target_url = target_url, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ReposCreateDeploymentStatusResponse]
  }
}

