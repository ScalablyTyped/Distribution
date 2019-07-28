package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetContributorsStatsEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetContributorsStatsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetContributorsStatsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetContributorsStatsEndpoint]
  }
}

