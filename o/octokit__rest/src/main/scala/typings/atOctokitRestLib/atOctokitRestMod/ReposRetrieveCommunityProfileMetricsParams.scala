package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRetrieveCommunityProfileMetricsParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposRetrieveCommunityProfileMetricsParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String): ReposRetrieveCommunityProfileMetricsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsParams]
  }
}

