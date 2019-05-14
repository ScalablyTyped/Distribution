package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksSetSuitesPreferences_Options extends js.Object {
  var auto_trigger_checks: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `auto_trigger_checks[].app_id`: scala.Double
  var `auto_trigger_checks[].setting`: scala.Boolean
  var owner: java.lang.String
  var repo: java.lang.String
}

object ChecksSetSuitesPreferences_Options {
  @scala.inline
  def apply(
    `auto_trigger_checks[].app_id`: scala.Double,
    `auto_trigger_checks[].setting`: scala.Boolean,
    owner: java.lang.String,
    repo: java.lang.String,
    auto_trigger_checks: js.Array[js.Object] = null
  ): ChecksSetSuitesPreferences_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    __obj.updateDynamic("auto_trigger_checks[].app_id")(`auto_trigger_checks[].app_id`)
    __obj.updateDynamic("auto_trigger_checks[].setting")(`auto_trigger_checks[].setting`)
    if (auto_trigger_checks != null) __obj.updateDynamic("auto_trigger_checks")(auto_trigger_checks)
    __obj.asInstanceOf[ChecksSetSuitesPreferences_Options]
  }
}

