package typings
package atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Optgroup extends js.Object {
  var children: js.Array[
    Option | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojCombobox.Optgroup */ js.Object)
  ]
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
}

object Optgroup {
  @scala.inline
  def apply(
    children: js.Array[
      Option | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojCombobox.Optgroup */ js.Object)
    ],
    label: java.lang.String,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Optgroup = {
    val __obj = js.Dynamic.literal(children = children, label = label)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Optgroup]
  }
}

