package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojdataproviderMod.DataMapping
import typings.atOracleOraclejet.ojdataproviderMod.FetchAttribute
import typings.atOracleOraclejet.ojdataproviderMod.SortCriterion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes[Kin, D, K, Din] extends js.Object {
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.undefined
  var dataMapping: js.UndefOr[DataMapping[K, D, Kin, Din]] = js.undefined
  var from: js.UndefOr[Kin] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply[Kin, D, K, Din](
    attributes: js.Array[String | FetchAttribute] = null,
    dataMapping: DataMapping[K, D, Kin, Din] = null,
    from: Kin = null,
    offset: Int | Double = null,
    sortCriteria: js.Array[SortCriterion[D]] = null
  ): Anon_Attributes[Kin, D, K, Din] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (dataMapping != null) __obj.updateDynamic("dataMapping")(dataMapping.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attributes[Kin, D, K, Din]]
  }
}

