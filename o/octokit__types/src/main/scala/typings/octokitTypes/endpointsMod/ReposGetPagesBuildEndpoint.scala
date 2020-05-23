package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesBuildEndpoint extends js.Object {
  var build_id: Double
  var owner: String
  var repo: String
}

object ReposGetPagesBuildEndpoint {
  @scala.inline
  def apply(build_id: Double, owner: String, repo: String): ReposGetPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(build_id = build_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetPagesBuildEndpoint]
  }
}

