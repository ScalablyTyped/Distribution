package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdAttribute[D] extends js.Object {
  var idAttribute: js.UndefOr[String | js.Array[String]] = js.undefined
  var implicitSort: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
  var keyAttributes: js.UndefOr[String | js.Array[String]] = js.undefined
  var keys: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.undefined
  var sortComparators: js.UndefOr[SortComparators[D]] = js.undefined
}

object IdAttribute {
  @scala.inline
  def apply[D](
    idAttribute: String | js.Array[String] = null,
    implicitSort: js.Array[SortCriterion[D]] = null,
    keyAttributes: String | js.Array[String] = null,
    keys: js.Array[_] | js.Function0[js.Array[_]] = null,
    sortComparators: SortComparators[D] = null
  ): IdAttribute[D] = {
    val __obj = js.Dynamic.literal()
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (implicitSort != null) __obj.updateDynamic("implicitSort")(implicitSort.asInstanceOf[js.Any])
    if (keyAttributes != null) __obj.updateDynamic("keyAttributes")(keyAttributes.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (sortComparators != null) __obj.updateDynamic("sortComparators")(sortComparators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAttribute[D]]
  }
}

