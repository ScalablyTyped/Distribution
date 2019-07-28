package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRetrieveCommunityProfileMetricsEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposRetrieveCommunityProfileMetricsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposRetrieveCommunityProfileMetricsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsEndpoint]
  }
}

