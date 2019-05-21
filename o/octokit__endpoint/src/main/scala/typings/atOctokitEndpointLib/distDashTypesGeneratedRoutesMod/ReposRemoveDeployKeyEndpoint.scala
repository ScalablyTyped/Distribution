package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveDeployKeyEndpoint extends js.Object {
  var key_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposRemoveDeployKeyEndpoint {
  @scala.inline
  def apply(key_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposRemoveDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposRemoveDeployKeyEndpoint]
  }
}

