package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwner extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var run_id: AnonRequired
}

object AnonOwner {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, run_id: AnonRequired): AnonOwner = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwner]
  }
}

