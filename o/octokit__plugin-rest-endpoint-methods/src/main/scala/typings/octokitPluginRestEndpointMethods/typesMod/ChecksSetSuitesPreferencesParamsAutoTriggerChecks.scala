package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksSetSuitesPreferencesParamsAutoTriggerChecks extends js.Object {
  /**
    * The `id` of the GitHub App.
    */
  var app_id: Double
  /**
    * Set to `true` to enable automatic creation of CheckSuite events upon pushes to the repository, or `false` to disable them.
    */
  var setting: Boolean
}

object ChecksSetSuitesPreferencesParamsAutoTriggerChecks {
  @scala.inline
  def apply(app_id: Double, setting: Boolean): ChecksSetSuitesPreferencesParamsAutoTriggerChecks = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]
  }
}

