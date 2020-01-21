package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSettingTemplate extends DirectoryObject {
  // Description of the template.
  var description: js.UndefOr[String] = js.undefined
  // Display name of the template.
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Collection of settingTemplateValues that list the set of available settings, defaults and types that make up this
    * template.
    */
  var values: js.UndefOr[js.Array[SettingTemplateValue]] = js.undefined
}

object GroupSettingTemplate {
  @scala.inline
  def apply(
    deletedDateTime: String = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    values: js.Array[SettingTemplateValue] = null
  ): GroupSettingTemplate = {
    val __obj = js.Dynamic.literal()
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupSettingTemplate]
  }
}

