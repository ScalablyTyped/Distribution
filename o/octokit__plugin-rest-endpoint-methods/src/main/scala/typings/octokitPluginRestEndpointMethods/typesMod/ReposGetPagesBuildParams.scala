package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesBuildParams extends js.Object {
  var build_id: Double
  var owner: String
  var repo: String
}

object ReposGetPagesBuildParams {
  @scala.inline
  def apply(build_id: Double, owner: String, repo: String): ReposGetPagesBuildParams = {
    val __obj = js.Dynamic.literal(build_id = build_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetPagesBuildParams]
  }
}

