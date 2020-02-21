package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoinactive extends js.Object {
  var auto_inactive: AnonType
  var deployment_id: AnonRequired
  var description: AnonType
  var environment: AnonEnum
  var environment_url: AnonType
  var log_url: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var state: AnonEnumRequired
  var target_url: AnonType
}

object AnonAutoinactive {
  @scala.inline
  def apply(
    auto_inactive: AnonType,
    deployment_id: AnonRequired,
    description: AnonType,
    environment: AnonEnum,
    environment_url: AnonType,
    log_url: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    state: AnonEnumRequired,
    target_url: AnonType
  ): AnonAutoinactive = {
    val __obj = js.Dynamic.literal(auto_inactive = auto_inactive.asInstanceOf[js.Any], deployment_id = deployment_id.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environment_url = environment_url.asInstanceOf[js.Any], log_url = log_url.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutoinactive]
  }
}

