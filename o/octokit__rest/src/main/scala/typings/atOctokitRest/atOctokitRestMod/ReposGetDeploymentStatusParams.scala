package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDeploymentStatusParams extends js.Object {
  var deployment_id: Double
  var owner: String
  var repo: String
  var status_id: Double
}

object ReposGetDeploymentStatusParams {
  @scala.inline
  def apply(deployment_id: Double, owner: String, repo: String, status_id: Double): ReposGetDeploymentStatusParams = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo, status_id = status_id)
  
    __obj.asInstanceOf[ReposGetDeploymentStatusParams]
  }
}

