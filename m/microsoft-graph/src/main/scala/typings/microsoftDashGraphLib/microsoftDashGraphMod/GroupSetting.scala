package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSetting extends Entity {
  /** Display name of this group of settings, which comes from the associated template. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier for the template used to create this group of settings. Read-only. */
  var templateId: js.UndefOr[java.lang.String] = js.undefined
  /** Collection of name value pairs. Must contain and set all the settings defined in the template. */
  var values: js.UndefOr[js.Array[SettingValue]] = js.undefined
}

object GroupSetting {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    templateId: java.lang.String = null,
    values: js.Array[SettingValue] = null
  ): GroupSetting = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (templateId != null) __obj.updateDynamic("templateId")(templateId)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[GroupSetting]
  }
}

