package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForce extends js.Object {
  var force: AnonType
  var owner: AnonRequired
  var ref: AnonRequired
  var repo: AnonRequired
  var sha: AnonRequired
}

object AnonForce {
  @scala.inline
  def apply(force: AnonType, owner: AnonRequired, ref: AnonRequired, repo: AnonRequired, sha: AnonRequired): AnonForce = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonForce]
  }
}

