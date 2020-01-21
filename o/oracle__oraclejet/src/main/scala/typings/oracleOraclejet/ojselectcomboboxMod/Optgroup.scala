package typings.oracleOraclejet.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optgroup extends js.Object {
  var children: js.Array[Option | Optgroup]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
}

object Optgroup {
  @scala.inline
  def apply(children: js.Array[Option | Optgroup], label: String, disabled: js.UndefOr[Boolean] = js.undefined): Optgroup = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optgroup]
  }
}

