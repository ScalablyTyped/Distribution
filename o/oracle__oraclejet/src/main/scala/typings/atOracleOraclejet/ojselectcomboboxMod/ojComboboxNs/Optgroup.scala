package typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Optgroup extends js.Object {
  var children: js.Array[
    typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
  ]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
}

object Optgroup {
  @scala.inline
  def apply(
    children: js.Array[
      typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
    ],
    label: String,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): Optgroup = {
    val __obj = js.Dynamic.literal(children = children, label = label)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Optgroup]
  }
}

