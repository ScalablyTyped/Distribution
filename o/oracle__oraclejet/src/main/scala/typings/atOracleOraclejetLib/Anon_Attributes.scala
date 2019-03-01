package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes[Kin, D, K, Din] extends js.Object {
  var attributes: js.UndefOr[
    js.Array[java.lang.String | atOracleOraclejetLib.ojdataproviderMod.FetchAttribute]
  ] = js.undefined
  var dataMapping: js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataMapping[K, D, Kin, Din]] = js.undefined
  var from: js.UndefOr[Kin] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var sortCriteria: js.UndefOr[js.Array[atOracleOraclejetLib.ojdataproviderMod.SortCriterion[D]]] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply[Kin, D, K, Din](
    attributes: js.Array[java.lang.String | atOracleOraclejetLib.ojdataproviderMod.FetchAttribute] = null,
    dataMapping: atOracleOraclejetLib.ojdataproviderMod.DataMapping[K, D, Kin, Din] = null,
    from: Kin = null,
    offset: scala.Int | scala.Double = null,
    sortCriteria: js.Array[atOracleOraclejetLib.ojdataproviderMod.SortCriterion[D]] = null
  ): Anon_Attributes[Kin, D, K, Din] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (dataMapping != null) __obj.updateDynamic("dataMapping")(dataMapping)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria)
    __obj.asInstanceOf[Anon_Attributes[Kin, D, K, Din]]
  }
}

