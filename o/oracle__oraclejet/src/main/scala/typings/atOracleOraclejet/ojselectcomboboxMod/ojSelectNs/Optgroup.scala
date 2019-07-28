package typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Optgroup extends js.Object {
  var children: js.Array[
    typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.Optgroup
  ]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
}

object Optgroup {
  @scala.inline
  def apply(
    children: js.Array[
      typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.Optgroup
    ],
    label: String,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): Optgroup = {
    val __obj = js.Dynamic.literal(children = children, label = label)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Optgroup]
  }
}

