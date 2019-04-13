package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDeploymentParams extends js.Object {
  var deployment_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetDeploymentParams {
  @scala.inline
  def apply(deployment_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposGetDeploymentParams = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetDeploymentParams]
  }
}

