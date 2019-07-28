package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnableAutomatedSecurityFixesEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposEnableAutomatedSecurityFixesEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposEnableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposEnableAutomatedSecurityFixesEndpoint]
  }
}

