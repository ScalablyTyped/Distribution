package typings.oracleOraclejet

import typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.OptionsKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildKeysChildrenLabel extends js.Object {
  var childKeys: js.UndefOr[OptionsKeys] = js.undefined
  var children: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object AnonChildKeysChildrenLabel {
  @scala.inline
  def apply(childKeys: OptionsKeys = null, children: String = null, label: String = null, value: String = null): AnonChildKeysChildrenLabel = {
    val __obj = js.Dynamic.literal()
    if (childKeys != null) __obj.updateDynamic("childKeys")(childKeys.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildKeysChildrenLabel]
  }
}

