package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildid extends js.Object {
  var build_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonBuildid {
  @scala.inline
  def apply(build_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonBuildid = {
    val __obj = js.Dynamic.literal(build_id = build_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuildid]
  }
}

