package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDeployment_Options extends js.Object {
  var deployment_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetDeployment_Options {
  @scala.inline
  def apply(deployment_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposGetDeployment_Options = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetDeployment_Options]
  }
}

