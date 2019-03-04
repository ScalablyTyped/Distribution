package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByOffsetParameters[D] extends FetchListParameters[D] {
  var offset: scala.Double
}

object FetchByOffsetParameters {
  @scala.inline
  def apply[D](
    offset: scala.Double,
    size: scala.Double,
    attributes: js.Array[java.lang.String | FetchAttribute] = null,
    filterCriterion: FilterOperator[D] = null,
    sortCriteria: js.Array[SortCriterion[D]] = null
  ): FetchByOffsetParameters[D] = {
    val __obj = js.Dynamic.literal(offset = offset, size = size)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (filterCriterion != null) __obj.updateDynamic("filterCriterion")(filterCriterion)
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria)
    __obj.asInstanceOf[FetchByOffsetParameters[D]]
  }
}

