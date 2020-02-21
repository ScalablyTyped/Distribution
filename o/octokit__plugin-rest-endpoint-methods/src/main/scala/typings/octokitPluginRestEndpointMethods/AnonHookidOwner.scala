package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHookidOwner extends js.Object {
  var hook_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonHookidOwner {
  @scala.inline
  def apply(hook_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonHookidOwner = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHookidOwner]
  }
}

