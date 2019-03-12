package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataMapping[K, D, Kin, Din] extends js.Object {
  var mapFilterCriterion: js.UndefOr[
    js.Function1[/* filterCriterion */ js.Array[FilterOperator[D]], js.Array[FilterOperator[Din]]]
  ] = js.undefined
  var mapSortCriteria: js.UndefOr[
    js.Function1[/* sortCriteria */ js.Array[SortCriterion[D]], js.Array[SortCriterion[Din]]]
  ] = js.undefined
  var unmapSortCriteria: js.UndefOr[
    js.Function1[/* sortCriteria */ js.Array[SortCriterion[Din]], js.Array[SortCriterion[D]]]
  ] = js.undefined
  def mapFields(item: Item[Kin, Din]): Item[K, D]
}

object DataMapping {
  @scala.inline
  def apply[K, D, Kin, Din](
    mapFields: Item[Kin, Din] => Item[K, D],
    mapFilterCriterion: /* filterCriterion */ js.Array[FilterOperator[D]] => js.Array[FilterOperator[Din]] = null,
    mapSortCriteria: /* sortCriteria */ js.Array[SortCriterion[D]] => js.Array[SortCriterion[Din]] = null,
    unmapSortCriteria: /* sortCriteria */ js.Array[SortCriterion[Din]] => js.Array[SortCriterion[D]] = null
  ): DataMapping[K, D, Kin, Din] = {
    val __obj = js.Dynamic.literal(mapFields = js.Any.fromFunction1(mapFields))
    if (mapFilterCriterion != null) __obj.updateDynamic("mapFilterCriterion")(js.Any.fromFunction1(mapFilterCriterion))
    if (mapSortCriteria != null) __obj.updateDynamic("mapSortCriteria")(js.Any.fromFunction1(mapSortCriteria))
    if (unmapSortCriteria != null) __obj.updateDynamic("unmapSortCriteria")(js.Any.fromFunction1(unmapSortCriteria))
    __obj.asInstanceOf[DataMapping[K, D, Kin, Din]]
  }
}

