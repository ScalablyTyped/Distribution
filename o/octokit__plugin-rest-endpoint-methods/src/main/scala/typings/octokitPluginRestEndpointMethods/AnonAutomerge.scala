package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutomerge extends js.Object {
  var auto_merge: AnonType
  var description: AnonType
  var environment: AnonType
  var owner: AnonRequired
  var payload: AnonType
  var production_environment: AnonType
  var ref: AnonRequired
  var repo: AnonRequired
  var required_contexts: AnonType
  var task: AnonType
  var transient_environment: AnonType
}

object AnonAutomerge {
  @scala.inline
  def apply(
    auto_merge: AnonType,
    description: AnonType,
    environment: AnonType,
    owner: AnonRequired,
    payload: AnonType,
    production_environment: AnonType,
    ref: AnonRequired,
    repo: AnonRequired,
    required_contexts: AnonType,
    task: AnonType,
    transient_environment: AnonType
  ): AnonAutomerge = {
    val __obj = js.Dynamic.literal(auto_merge = auto_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], production_environment = production_environment.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], required_contexts = required_contexts.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], transient_environment = transient_environment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutomerge]
  }
}

