package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

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
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo, status_id = status_id)
  
    __obj.asInstanceOf[ReposGetDeploymentStatusEndpoint]
  }
}

