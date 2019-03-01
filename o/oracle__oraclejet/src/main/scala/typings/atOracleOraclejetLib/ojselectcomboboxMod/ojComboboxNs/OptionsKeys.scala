package typings
package atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OptionsKeys extends js.Object {
  var childKeys: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojCombobox.OptionsKeys */ js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojCombobox.OptionsKeys */ js.Object
  ] = js.undefined
  var children: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object OptionsKeys {
  @scala.inline
  def apply(
    childKeys: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojCombobox.OptionsKeys */ js.Object = null,
    children: java.lang.String = null,
    label: java.lang.String = null,
    value: java.lang.String = null
  ): OptionsKeys = {
    val __obj = js.Dynamic.literal()
    if (childKeys != null) __obj.updateDynamic("childKeys")(childKeys)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptionsKeys]
  }
}

