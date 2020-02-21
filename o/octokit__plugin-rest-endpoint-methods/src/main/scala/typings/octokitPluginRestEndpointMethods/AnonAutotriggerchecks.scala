package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutotriggerchecks extends js.Object {
  var auto_trigger_checks: AnonType
  @JSName("auto_trigger_checks[].app_id")
  var `auto_trigger_checks[]Dotapp_id`: AnonRequired
  @JSName("auto_trigger_checks[].setting")
  var `auto_trigger_checks[]Dotsetting`: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonAutotriggerchecks {
  @scala.inline
  def apply(
    auto_trigger_checks: AnonType,
    `auto_trigger_checks[]Dotapp_id`: AnonRequired,
    `auto_trigger_checks[]Dotsetting`: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonAutotriggerchecks = {
    val __obj = js.Dynamic.literal(auto_trigger_checks = auto_trigger_checks.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("auto_trigger_checks[].app_id")(`auto_trigger_checks[]Dotapp_id`.asInstanceOf[js.Any])
    __obj.updateDynamic("auto_trigger_checks[].setting")(`auto_trigger_checks[]Dotsetting`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutotriggerchecks]
  }
}

