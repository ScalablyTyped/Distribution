package typings.atOracleOraclejet.ojselectcomboboxMod.ojCombobox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OptionsKeys extends js.Object {
  var childKeys: js.UndefOr[OptionsKeys] = js.undefined
  var children: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object OptionsKeys {
  @scala.inline
  def apply(childKeys: OptionsKeys = null, children: String = null, label: String = null, value: String = null): OptionsKeys = {
    val __obj = js.Dynamic.literal()
    if (childKeys != null) __obj.updateDynamic("childKeys")(childKeys)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptionsKeys]
  }
}

