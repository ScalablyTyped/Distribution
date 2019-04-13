package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetParticipationStatsParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetParticipationStatsParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String): ReposGetParticipationStatsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetParticipationStatsParams]
  }
}

