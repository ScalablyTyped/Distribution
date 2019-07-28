package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseEndpoint extends js.Object {
  var owner: String
  var release_id: Double
  var repo: String
}

object ReposGetReleaseEndpoint {
  @scala.inline
  def apply(owner: String, release_id: Double, repo: String): ReposGetReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
  
    __obj.asInstanceOf[ReposGetReleaseEndpoint]
  }
}

