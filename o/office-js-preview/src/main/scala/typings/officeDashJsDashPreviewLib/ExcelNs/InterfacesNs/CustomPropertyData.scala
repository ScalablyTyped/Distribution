package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "customProperty.toJSON()". */
trait CustomPropertyData extends js.Object {
  /**
    *
    * Gets the key of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the value type of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.DocumentPropertyType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Boolean | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Date | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.String | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Float
  ] = js.undefined
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object CustomPropertyData {
  @scala.inline
  def apply(
    key: java.lang.String = null,
    `type`: officeDashJsDashPreviewLib.ExcelNs.DocumentPropertyType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Boolean | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Date | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.String | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Float = null,
    value: js.Any = null
  ): CustomPropertyData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomPropertyData]
  }
}

