package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetLatestPagesBuildEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetLatestPagesBuildEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetLatestPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetLatestPagesBuildEndpoint]
  }
}

