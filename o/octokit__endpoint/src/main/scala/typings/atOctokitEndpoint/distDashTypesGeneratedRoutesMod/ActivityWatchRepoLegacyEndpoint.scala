package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityWatchRepoLegacyEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ActivityWatchRepoLegacyEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ActivityWatchRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ActivityWatchRepoLegacyEndpoint]
  }
}

