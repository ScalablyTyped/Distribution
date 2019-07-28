package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityCheckWatchingRepoLegacyEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ActivityCheckWatchingRepoLegacyEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ActivityCheckWatchingRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ActivityCheckWatchingRepoLegacyEndpoint]
  }
}

