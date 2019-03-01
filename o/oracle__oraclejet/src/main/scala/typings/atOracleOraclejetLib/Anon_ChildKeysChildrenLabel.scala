package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildKeysChildrenLabel extends js.Object {
  var childKeys: js.UndefOr[atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionsKeys] = js.undefined
  var children: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ChildKeysChildrenLabel {
  @scala.inline
  def apply(
    childKeys: atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionsKeys = null,
    children: java.lang.String = null,
    label: java.lang.String = null,
    value: java.lang.String = null
  ): Anon_ChildKeysChildrenLabel = {
    val __obj = js.Dynamic.literal()
    if (childKeys != null) __obj.updateDynamic("childKeys")(childKeys)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ChildKeysChildrenLabel]
  }
}

