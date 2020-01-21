package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDeploymentStatusesResponseItem extends js.Object {
  var created_at: String
  var creator: ReposListDeploymentStatusesResponseItemCreator
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

object ReposListDeploymentStatusesResponseItem {
  @scala.inline
  def apply(
    created_at: String,
    creator: ReposListDeploymentStatusesResponseItemCreator,
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
  ): ReposListDeploymentStatusesResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], deployment_url = deployment_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environment_url = environment_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], log_url = log_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListDeploymentStatusesResponseItem]
  }
}

