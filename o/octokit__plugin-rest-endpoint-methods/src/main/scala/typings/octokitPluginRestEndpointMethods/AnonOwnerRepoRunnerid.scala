package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRepoRunnerid extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var runner_id: AnonRequired
}

object AnonOwnerRepoRunnerid {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, runner_id: AnonRequired): AnonOwnerRepoRunnerid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRepoRunnerid]
  }
}

