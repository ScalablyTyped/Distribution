package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDeploymentStatusEndpoint extends js.Object {
  var deployment_id: Double
  var owner: String
  var repo: String
  var status_id: Double
}

object ReposGetDeploymentStatusEndpoint {
  @scala.inline
  def apply(deployment_id: Double, owner: String, repo: String, status_id: Double): ReposGetDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status_id = status_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetDeploymentStatusEndpoint]
  }
}

