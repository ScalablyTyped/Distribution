package typings.atOracleOraclejet.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.Object
}

object Option {
  @scala.inline
  def apply(value: js.Object, disabled: js.UndefOr[Boolean] = js.undefined, label: String = null): Option = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Option]
  }
}

