package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupSetting extends Entity {
  // Display name of this group of settings, which comes from the associated template.
  var displayName: js.UndefOr[String] = js.native
  // Unique identifier for the template used to create this group of settings. Read-only.
  var templateId: js.UndefOr[String] = js.native
  // Collection of name value pairs. Must contain and set all the settings defined in the template.
  var values: js.UndefOr[js.Array[SettingValue]] = js.native
}

object GroupSetting {
  @scala.inline
  def apply(): GroupSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSetting]
  }
  @scala.inline
  implicit class GroupSettingOps[Self <: GroupSetting] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
    @scala.inline
    def setValuesVarargs(value: SettingValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SettingValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

