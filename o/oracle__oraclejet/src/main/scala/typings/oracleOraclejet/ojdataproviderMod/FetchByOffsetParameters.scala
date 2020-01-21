package typings.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByOffsetParameters[D] extends FetchListParameters[D] {
  var offset: Double
}

object FetchByOffsetParameters {
  @scala.inline
  def apply[D](
    offset: Double,
    size: Double,
    attributes: js.Array[String | FetchAttribute] = null,
    filterCriterion: FilterOperator[D] = null,
    sortCriteria: js.Array[SortCriterion[D]] = null
  ): FetchByOffsetParameters[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (filterCriterion != null) __obj.updateDynamic("filterCriterion")(filterCriterion.asInstanceOf[js.Any])
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByOffsetParameters[D]]
  }
}

