package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRequestPageBuildEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposRequestPageBuildEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposRequestPageBuildEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposRequestPageBuildEndpoint]
  }
}

