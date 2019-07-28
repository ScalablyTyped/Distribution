package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDeploymentParams extends js.Object {
  var deployment_id: Double
  var owner: String
  var repo: String
}

object ReposGetDeploymentParams {
  @scala.inline
  def apply(deployment_id: Double, owner: String, repo: String): ReposGetDeploymentParams = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetDeploymentParams]
  }
}

