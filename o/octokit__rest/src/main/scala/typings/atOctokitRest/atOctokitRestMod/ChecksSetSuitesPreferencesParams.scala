package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksSetSuitesPreferencesParams extends js.Object {
  /**
    * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default. See the [`auto_trigger_checks` object](https://developer.github.com/v3/checks/suites/#auto_trigger_checks-object) description for details.
    */
  var auto_trigger_checks: js.UndefOr[js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]] = js.undefined
  var owner: String
  var repo: String
}

object ChecksSetSuitesPreferencesParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    auto_trigger_checks: js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks] = null
  ): ChecksSetSuitesPreferencesParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (auto_trigger_checks != null) __obj.updateDynamic("auto_trigger_checks")(auto_trigger_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesParams]
  }
}

