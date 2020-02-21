package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRetrieveCommunityProfileMetricsParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposRetrieveCommunityProfileMetricsParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposRetrieveCommunityProfileMetricsParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsParams]
  }
}

