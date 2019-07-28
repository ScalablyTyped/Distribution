package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.global
import typings.atOracleOraclejet.atOracleOraclejetStrings.siblings
import typings.atOracleOraclejet.ojarraydataproviderMod.SortComparators
import typings.atOracleOraclejet.ojdataproviderMod.SortCriterion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenAttribute[D] extends js.Object {
  var childrenAttribute: js.UndefOr[String] = js.undefined
  var implicitSort: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
  var keyAttributes: js.UndefOr[String | js.Array[String]] = js.undefined
  var keyAttributesScope: js.UndefOr[global | siblings] = js.undefined
  var sortComparators: js.UndefOr[SortComparators[D]] = js.undefined
}

object Anon_ChildrenAttribute {
  @scala.inline
  def apply[D](
    childrenAttribute: String = null,
    implicitSort: js.Array[SortCriterion[D]] = null,
    keyAttributes: String | js.Array[String] = null,
    keyAttributesScope: global | siblings = null,
    sortComparators: SortComparators[D] = null
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

