package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksSetSuitesPreferencesEndpoint extends js.Object {
  var auto_trigger_checks: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `auto_trigger_checks[].app_id`: Double
  var `auto_trigger_checks[].setting`: Boolean
  var owner: String
  var repo: String
}

object ChecksSetSuitesPreferencesEndpoint {
  @scala.inline
  def apply(
    `auto_trigger_checks[].app_id`: Double,
    `auto_trigger_checks[].setting`: Boolean,
    owner: String,
    repo: String,
    auto_trigger_checks: js.Array[js.Object] = null
  ): ChecksSetSuitesPreferencesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    __obj.updateDynamic("auto_trigger_checks[].app_id")(`auto_trigger_checks[].app_id`)
    __obj.updateDynamic("auto_trigger_checks[].setting")(`auto_trigger_checks[].setting`)
    if (auto_trigger_checks != null) __obj.updateDynamic("auto_trigger_checks")(auto_trigger_checks)
    __obj.asInstanceOf[ChecksSetSuitesPreferencesEndpoint]
  }
}

