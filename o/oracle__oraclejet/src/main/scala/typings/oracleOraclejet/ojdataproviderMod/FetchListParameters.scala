package typings.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchListParameters[D] extends js.Object {
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.native
  var filterCriterion: js.UndefOr[FilterOperator[D]] = js.native
  var size: Double = js.native
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.native
}

object FetchListParameters {
  @scala.inline
  def apply[D](size: Double): FetchListParameters[D] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchListParameters[D]]
  }
  @scala.inline
  implicit class FetchListParametersOps[Self <: FetchListParameters[_], D] (val x: Self with FetchListParameters[D]) extends AnyVal {
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesVarargs(value: (String | FetchAttribute)*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String | FetchAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setFilterCriterion(value: FilterOperator[D]): Self = this.set("filterCriterion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterCriterion: Self = this.set("filterCriterion", js.undefined)
    @scala.inline
    def setSortCriteriaVarargs(value: SortCriterion[D]*): Self = this.set("sortCriteria", js.Array(value :_*))
    @scala.inline
    def setSortCriteria(value: js.Array[SortCriterion[D]]): Self = this.set("sortCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortCriteria: Self = this.set("sortCriteria", js.undefined)
  }
  
}

