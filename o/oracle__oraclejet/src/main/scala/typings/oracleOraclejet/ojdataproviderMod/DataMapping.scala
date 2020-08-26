package typings.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMapping[K, D, Kin, Din] extends js.Object {
  var mapFilterCriterion: js.UndefOr[
    js.Function1[/* filterCriterion */ js.Array[FilterOperator[D]], js.Array[FilterOperator[Din]]]
  ] = js.native
  var mapSortCriteria: js.UndefOr[
    js.Function1[/* sortCriteria */ js.Array[SortCriterion[D]], js.Array[SortCriterion[Din]]]
  ] = js.native
  var unmapSortCriteria: js.UndefOr[
    js.Function1[/* sortCriteria */ js.Array[SortCriterion[Din]], js.Array[SortCriterion[D]]]
  ] = js.native
  def mapFields(item: Item[Kin, Din]): Item[K, D] = js.native
}

object DataMapping {
  @scala.inline
  def apply[K, D, Kin, Din](mapFields: Item[Kin, Din] => Item[K, D]): DataMapping[K, D, Kin, Din] = {
    val __obj = js.Dynamic.literal(mapFields = js.Any.fromFunction1(mapFields))
    __obj.asInstanceOf[DataMapping[K, D, Kin, Din]]
  }
  @scala.inline
  implicit class DataMappingOps[Self <: DataMapping[_, _, _, _], K, D, Kin, Din] (val x: Self with (DataMapping[K, D, Kin, Din])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMapFields(value: Item[Kin, Din] => Item[K, D]): Self = this.set("mapFields", js.Any.fromFunction1(value))
    @scala.inline
    def setMapFilterCriterion(value: /* filterCriterion */ js.Array[FilterOperator[D]] => js.Array[FilterOperator[Din]]): Self = this.set("mapFilterCriterion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapFilterCriterion: Self = this.set("mapFilterCriterion", js.undefined)
    @scala.inline
    def setMapSortCriteria(value: /* sortCriteria */ js.Array[SortCriterion[D]] => js.Array[SortCriterion[Din]]): Self = this.set("mapSortCriteria", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapSortCriteria: Self = this.set("mapSortCriteria", js.undefined)
    @scala.inline
    def setUnmapSortCriteria(value: /* sortCriteria */ js.Array[SortCriterion[Din]] => js.Array[SortCriterion[D]]): Self = this.set("unmapSortCriteria", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnmapSortCriteria: Self = this.set("unmapSortCriteria", js.undefined)
  }
  
}

