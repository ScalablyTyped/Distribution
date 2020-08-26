package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksSetSuitesPreferencesParamsAutoTriggerChecks extends js.Object {
  var app_id: Double = js.native
  var setting: Boolean = js.native
}

object ChecksSetSuitesPreferencesParamsAutoTriggerChecks {
  @scala.inline
  def apply(app_id: Double, setting: Boolean): ChecksSetSuitesPreferencesParamsAutoTriggerChecks = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]
  }
  @scala.inline
  implicit class ChecksSetSuitesPreferencesParamsAutoTriggerChecksOps[Self <: ChecksSetSuitesPreferencesParamsAutoTriggerChecks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApp_id(value: Double): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetting(value: Boolean): Self = this.set("setting", value.asInstanceOf[js.Any])
  }
  
}

