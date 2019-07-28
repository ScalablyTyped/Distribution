package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPunchCardStatsEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetPunchCardStatsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetPunchCardStatsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetPunchCardStatsEndpoint]
  }
}

