package typings.atOracleOraclejet.ojcheckboxsetMod.ojCheckboxset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Option extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object Option {
  @scala.inline
  def apply(value: js.Any, disabled: js.UndefOr[Boolean] = js.undefined, label: String = null): Option = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Option]
  }
}

