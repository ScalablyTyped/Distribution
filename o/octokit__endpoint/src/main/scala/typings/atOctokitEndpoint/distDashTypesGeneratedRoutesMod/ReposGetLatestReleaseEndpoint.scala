package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetLatestReleaseEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetLatestReleaseEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetLatestReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetLatestReleaseEndpoint]
  }
}

