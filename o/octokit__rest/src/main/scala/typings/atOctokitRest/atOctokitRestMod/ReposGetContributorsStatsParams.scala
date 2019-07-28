package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetContributorsStatsParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetContributorsStatsParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetContributorsStatsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetContributorsStatsParams]
  }
}

