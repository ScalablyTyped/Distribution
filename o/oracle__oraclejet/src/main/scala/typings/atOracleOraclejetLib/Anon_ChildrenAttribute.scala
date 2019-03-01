package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenAttribute[D] extends js.Object {
  var childrenAttribute: js.UndefOr[java.lang.String] = js.undefined
  var implicitSort: js.UndefOr[js.Array[atOracleOraclejetLib.ojdataproviderMod.SortCriterion[D]]] = js.undefined
  var keyAttributes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var keyAttributesScope: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.global | atOracleOraclejetLib.atOracleOraclejetLibStrings.siblings
  ] = js.undefined
  var sortComparators: js.UndefOr[
    atOracleOraclejetLib.ojarraydataproviderMod.ArrayDataProviderNs.SortComparators[D]
  ] = js.undefined
}

object Anon_ChildrenAttribute {
  @scala.inline
  def apply[D](
    childrenAttribute: java.lang.String = null,
    implicitSort: js.Array[atOracleOraclejetLib.ojdataproviderMod.SortCriterion[D]] = null,
    keyAttributes: java.lang.String | js.Array[java.lang.String] = null,
    keyAttributesScope: atOracleOraclejetLib.atOracleOraclejetLibStrings.global | atOracleOraclejetLib.atOracleOraclejetLibStrings.siblings = null,
    sortComparators: atOracleOraclejetLib.ojarraydataproviderMod.ArrayDataProviderNs.SortComparators[D] = null
  ): Anon_ChildrenAttribute[D] = {
    val __obj = js.Dynamic.literal()
    if (childrenAttribute != null) __obj.updateDynamic("childrenAttribute")(childrenAttribute)
    if (implicitSort != null) __obj.updateDynamic("implicitSort")(implicitSort)
    if (keyAttributes != null) __obj.updateDynamic("keyAttributes")(keyAttributes.asInstanceOf[js.Any])
    if (keyAttributesScope != null) __obj.updateDynamic("keyAttributesScope")(keyAttributesScope.asInstanceOf[js.Any])
    if (sortComparators != null) __obj.updateDynamic("sortComparators")(sortComparators)
    __obj.asInstanceOf[Anon_ChildrenAttribute[D]]
  }
}

