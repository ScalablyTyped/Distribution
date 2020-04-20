package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentResponse extends js.Object {
  var created_at: String
  var creator: ReposCreateDeploymentResponseCreator
  var description: String
  var environment: String
  var id: Double
  var node_id: String
  var original_environment: String
  var payload: ReposCreateDeploymentResponsePayload
  var production_environment: Boolean
  var ref: String
  var repository_url: String
  var sha: String
  var statuses_url: String
  var task: String
  var transient_environment: Boolean
  var updated_at: String
  var url: String
}

object ReposCreateDeploymentResponse {
  @scala.inline
  def apply(
    created_at: String,
    creator: ReposCreateDeploymentResponseCreator,
    description: String,
    environment: String,
    id: Double,
    node_id: String,
    original_environment: String,
    payload: ReposCreateDeploymentResponsePayload,
    production_environment: Boolean,
    ref: String,
    repository_url: String,
    sha: String,
    statuses_url: String,
    task: String,
    transient_environment: Boolean,
    updated_at: String,
    url: String
  ): ReposCreateDeploymentResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], original_environment = original_environment.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], production_environment = production_environment.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], transient_environment = transient_environment.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentResponse]
  }
}

