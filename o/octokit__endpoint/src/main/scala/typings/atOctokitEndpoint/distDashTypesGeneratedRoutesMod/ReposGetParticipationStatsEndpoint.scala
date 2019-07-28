package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetParticipationStatsEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetParticipationStatsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetParticipationStatsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetParticipationStatsEndpoint]
  }
}

