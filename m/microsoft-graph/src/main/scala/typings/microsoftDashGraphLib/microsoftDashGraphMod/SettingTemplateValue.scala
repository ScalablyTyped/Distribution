package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingTemplateValue extends js.Object {
  /** Default value for the setting. */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /** Description of the setting. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the setting. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the setting. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SettingTemplateValue {
  @scala.inline
  def apply(
    defaultValue: java.lang.String = null,
    description: java.lang.String = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null
  ): SettingTemplateValue = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SettingTemplateValue]
  }
}

