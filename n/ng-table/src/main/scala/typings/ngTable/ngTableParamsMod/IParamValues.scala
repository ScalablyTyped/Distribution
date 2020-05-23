package typings.ngTable.ngTableParamsMod

import typings.ngTable.filterFuncMod.IFilterValues
import typings.ngTable.groupingFuncMod.Grouping
import typings.ngTable.sortingMod.ISortingValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParamValues[T] extends js.Object {
  /**
    * The number of data rows per page
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * The filter that should be applied to restrict the set of data rows
    */
  var filter: js.UndefOr[IFilterValues] = js.undefined
  /**
    * The grouping that should be applied to the data rows
    */
  var group: js.UndefOr[String | Grouping[T]] = js.undefined
  /**
    * The index of the "slice" of data rows, starting at 1, to be displayed by the table.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * The sort order that should be applied to the data rows.
    */
  var sorting: js.UndefOr[ISortingValues] = js.undefined
}

object IParamValues {
  @scala.inline
  def apply[T](
    count: js.UndefOr[Double] = js.undefined,
    filter: IFilterValues = null,
    group: String | Grouping[T] = null,
    page: js.UndefOr[Double] = js.undefined,
    sorting: ISortingValues = null
  ): IParamValues[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParamValues[T]]
  }
}

