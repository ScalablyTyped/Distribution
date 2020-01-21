package typings.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchListParameters[D] extends js.Object {
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.undefined
  var filterCriterion: js.UndefOr[FilterOperator[D]] = js.undefined
  var size: Double
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
}

object FetchListParameters {
  @scala.inline
  def apply[D](
    size: Double,
    attributes: js.Array[String | FetchAttribute] = null,
    filterCriterion: FilterOperator[D] = null,
    sortCriteria: js.Array[SortCriterion[D]] = null
  ): FetchListParameters[D] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (filterCriterion != null) __obj.updateDynamic("filterCriterion")(filterCriterion.asInstanceOf[js.Any])
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchListParameters[D]]
  }
}

