package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDisableAutomatedSecurityFixesEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposDisableAutomatedSecurityFixesEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposDisableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDisableAutomatedSecurityFixesEndpoint]
  }
}

