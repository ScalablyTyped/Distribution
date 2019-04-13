package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdAttribute[D] extends js.Object {
  var idAttribute: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var implicitSort: js.UndefOr[js.Array[atOracleOraclejetLib.ojdataproviderMod.SortCriterion[D]]] = js.undefined
  var keyAttributes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var keys: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.undefined
  var sortComparators: js.UndefOr[atOracleOraclejetLib.ojarraydataproviderMod.SortComparators[D]] = js.undefined
}

object Anon_IdAttribute {
  @scala.inline
  def apply[D](
    idAttribute: java.lang.String | js.Array[java.lang.String] = null,
    implicitSort: js.Array[atOracleOraclejetLib.ojdataproviderMod.SortCriterion[D]] = null,
    keyAttributes: java.lang.String | js.Array[java.lang.String] = null,
    keys: js.Array[_] | js.Function0[js.Array[_]] = null,
    sortComparators: atOracleOraclejetLib.ojarraydataproviderMod.SortComparators[D] = null
  ): Anon_IdAttribute[D] = {
    val __obj = js.Dynamic.literal()
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (implicitSort != null) __obj.updateDynamic("implicitSort")(implicitSort)
    if (keyAttributes != null) __obj.updateDynamic("keyAttributes")(keyAttributes.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (sortComparators != null) __obj.updateDynamic("sortComparators")(sortComparators)
    __obj.asInstanceOf[Anon_IdAttribute[D]]
  }
}

