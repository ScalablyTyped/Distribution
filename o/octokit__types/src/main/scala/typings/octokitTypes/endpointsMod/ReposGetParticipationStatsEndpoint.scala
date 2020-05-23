package typings.octokitTypes.endpointsMod

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
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetParticipationStatsEndpoint]
  }
}

