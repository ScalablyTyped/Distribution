package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optgroup extends js.Object {
  var children: js.Array[Option | Optgroup]
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
}

object Optgroup {
  @scala.inline
  def apply(
    children: js.Array[Option | Optgroup],
    label: java.lang.String,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Optgroup = {
    val __obj = js.Dynamic.literal(children = children, label = label)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Optgroup]
  }
}

