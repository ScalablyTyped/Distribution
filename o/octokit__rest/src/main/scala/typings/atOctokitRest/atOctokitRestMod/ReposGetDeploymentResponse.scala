package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDeploymentResponse extends js.Object {
  var created_at: String
  var creator: ReposGetDeploymentResponseCreator
  var description: String
  var environment: String
  var id: Double
  var node_id: String
  var original_environment: String
  var payload: ReposGetDeploymentResponsePayload
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

object ReposGetDeploymentResponse {
  @scala.inline
  def apply(
    created_at: String,
    creator: ReposGetDeploymentResponseCreator,
    description: String,
    environment: String,
    id: Double,
    node_id: String,
    original_environment: String,
    payload: ReposGetDeploymentResponsePayload,
    production_environment: Boolean,
    ref: String,
    repository_url: String,
    sha: String,
    statuses_url: String,
    task: String,
    transient_environment: Boolean,
    updated_at: String,
    url: String
  ): ReposGetDeploymentResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, creator = creator, description = description, environment = environment, id = id, node_id = node_id, original_environment = original_environment, payload = payload, production_environment = production_environment, ref = ref, repository_url = repository_url, sha = sha, statuses_url = statuses_url, task = task, transient_environment = transient_environment, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ReposGetDeploymentResponse]
  }
}

