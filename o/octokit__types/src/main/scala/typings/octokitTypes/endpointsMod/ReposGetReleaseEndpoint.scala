package typings.octokitTypes.endpointsMod

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
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetReleaseEndpoint]
  }
}

