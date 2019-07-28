package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposPingHookEndpoint extends js.Object {
  var hook_id: Double
  var owner: String
  var repo: String
}

object ReposPingHookEndpoint {
  @scala.inline
  def apply(hook_id: Double, owner: String, repo: String): ReposPingHookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposPingHookEndpoint]
  }
}

