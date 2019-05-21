package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetHookEndpoint extends js.Object {
  var hook_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetHookEndpoint {
  @scala.inline
  def apply(hook_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposGetHookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetHookEndpoint]
  }
}

