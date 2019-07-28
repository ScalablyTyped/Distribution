package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetParticipationStatsParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetParticipationStatsParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetParticipationStatsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetParticipationStatsParams]
  }
}

