package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksSetSuitesPreferencesParams extends js.Object {
  /**
    * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default. See the [`auto_trigger_checks` object](https://developer.github.com/v3/checks/suites/#auto_trigger_checks-object) description for details.
    */
  var auto_trigger_checks: js.UndefOr[js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ChecksSetSuitesPreferencesParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    auto_trigger_checks: js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks] = null
  ): ChecksSetSuitesPreferencesParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (auto_trigger_checks != null) __obj.updateDynamic("auto_trigger_checks")(auto_trigger_checks)
    __obj.asInstanceOf[ChecksSetSuitesPreferencesParams]
  }
}

