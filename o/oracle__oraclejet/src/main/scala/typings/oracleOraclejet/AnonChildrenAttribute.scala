package typings.oracleOraclejet

import typings.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import typings.oracleOraclejet.oracleOraclejetStrings.global
import typings.oracleOraclejet.oracleOraclejetStrings.siblings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenAttribute[D] extends js.Object {
  var childrenAttribute: js.UndefOr[String] = js.undefined
  var implicitSort: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
  var keyAttributes: js.UndefOr[String | js.Array[String]] = js.undefined
  var keyAttributesScope: js.UndefOr[global | siblings] = js.undefined
  var sortComparators: js.UndefOr[SortComparators[D]] = js.undefined
}

object AnonChildrenAttribute {
  @scala.inline
  def apply[D](
    childrenAttribute: String = null,
    implicitSort: js.Array[SortCriterion[D]] = null,
    keyAttributes: String | js.Array[String] = null,
    keyAttributesScope: global | siblings = null,
    sortComparators: SortComparators[D] = null
  ): AnonChildrenAttribute[D] = {
    val __obj = js.Dynamic.literal()
    if (childrenAttribute != null) __obj.updateDynamic("childrenAttribute")(childrenAttribute.asInstanceOf[js.Any])
    if (implicitSort != null) __obj.updateDynamic("implicitSort")(implicitSort.asInstanceOf[js.Any])
    if (keyAttributes != null) __obj.updateDynamic("keyAttributes")(keyAttributes.asInstanceOf[js.Any])
    if (keyAttributesScope != null) __obj.updateDynamic("keyAttributesScope")(keyAttributesScope.asInstanceOf[js.Any])
    if (sortComparators != null) __obj.updateDynamic("sortComparators")(sortComparators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenAttribute[D]]
  }
}

