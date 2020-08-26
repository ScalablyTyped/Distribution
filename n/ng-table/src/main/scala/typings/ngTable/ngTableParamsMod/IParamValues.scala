package typings.ngTable.ngTableParamsMod

import typings.ngTable.filterFuncMod.IFilterValues
import typings.ngTable.groupingFuncMod.Grouping
import typings.ngTable.sortingMod.ISortingValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParamValues[T] extends js.Object {
  /**
    * The number of data rows per page
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * The filter that should be applied to restrict the set of data rows
    */
  var filter: js.UndefOr[IFilterValues] = js.native
  /**
    * The grouping that should be applied to the data rows
    */
  var group: js.UndefOr[String | Grouping[T]] = js.native
  /**
    * The index of the "slice" of data rows, starting at 1, to be displayed by the table.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * The sort order that should be applied to the data rows.
    */
  var sorting: js.UndefOr[ISortingValues] = js.native
}

object IParamValues {
  @scala.inline
  def apply[T](): IParamValues[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParamValues[T]]
  }
  @scala.inline
  implicit class IParamValuesOps[Self <: IParamValues[_], T] (val x: Self with IParamValues[T]) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFilter(value: IFilterValues): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGroup(value: String | Grouping[T]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setSorting(value: ISortingValues): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
  }
  
}

