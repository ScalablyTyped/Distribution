package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDeploymentStatus_Options extends js.Object {
  var deployment_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
  var status_id: scala.Double
}

object ReposGetDeploymentStatus_Options {
  @scala.inline
  def apply(
    deployment_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    status_id: scala.Double
  ): ReposGetDeploymentStatus_Options = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo, status_id = status_id)
  
    __obj.asInstanceOf[ReposGetDeploymentStatus_Options]
  }
}

