package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDeploymentStatusParams extends js.Object {
  var deployment_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
  var status_id: scala.Double
}

object ReposGetDeploymentStatusParams {
  @scala.inline
  def apply(
    deployment_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    status_id: scala.Double
  ): ReposGetDeploymentStatusParams = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo, status_id = status_id)
  
    __obj.asInstanceOf[ReposGetDeploymentStatusParams]
  }
}

