package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupSettingTemplate extends DirectoryObject {
  // Description of the template.
  var description: js.UndefOr[String] = js.native
  // Display name of the template.
  var displayName: js.UndefOr[String] = js.native
  /**
    * Collection of settingTemplateValues that list the set of available settings, defaults and types that make up this
    * template.
    */
  var values: js.UndefOr[js.Array[SettingTemplateValue]] = js.native
}

object GroupSettingTemplate {
  @scala.inline
  def apply(): GroupSettingTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSettingTemplate]
  }
  @scala.inline
  implicit class GroupSettingTemplateOps[Self <: GroupSettingTemplate] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setValuesVarargs(value: SettingTemplateValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SettingTemplateValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

