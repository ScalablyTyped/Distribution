package typings.ngDashTable.srcCoreNgTableSettingsMod

import typings.angular.angularMod.IPromise
import typings.ngDashTable.srcCoreDataDataSettingsMod.IDataSettings
import typings.ngDashTable.srcCoreDataGetDataMod.IGetDataFunc
import typings.ngDashTable.srcCoreDataGetDataMod.IInterceptableGetDataFunc
import typings.ngDashTable.srcCoreDataInterceptorMod.IInterceptor
import typings.ngDashTable.srcCoreDataResultsMod.IDataRowGroup
import typings.ngDashTable.srcCoreFilteringFilterSettingsMod.IFilterSettings
import typings.ngDashTable.srcCoreGroupingGetGroupMod.IGetGroupFunc
import typings.ngDashTable.srcCoreGroupingGroupSettingsMod.IGroupSettings
import typings.ngDashTable.srcCoreNgTableParamsMod.NgTableParams
import typings.ngDashTable.srcCoreSortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettings[T] extends js.Object {
  /**
    * Returns true whenever a call to `getData` is in progress
    */
  @JSName("$loading")
  var $loading: js.UndefOr[Boolean] = js.undefined
  /**
    * The page size buttons that should be displayed. Each value defined in the array
    * determines the possible values that can be supplied to {@link NgTableParams} `page`
    */
  var counts: js.UndefOr[js.Array[Double]] = js.undefined
  var dataOptions: js.UndefOr[IDataSettings] = js.undefined
  /**
    * An array that contains all the data rows that table should manage.
    * The `gateData` function will be used to manage the data rows
    * that ultimately will be displayed.
    */
  var dataset: js.UndefOr[js.Array[T]] = js.undefined
  var debugMode: js.UndefOr[Boolean] = js.undefined
  /**
    * The default sort direction that will be used whenever a sorting is supplied that
    * does not define its own sort direction
    */
  var defaultSort: js.UndefOr[SortDirection] = js.undefined
  var filterOptions: js.UndefOr[IFilterSettings[T]] = js.undefined
  /**
    * The function that will be used fetch data rows. Leave undefined to let the {@link IDefaultGetData}
    * service provide a default implementation that will work with the `dataset` array you supply.
    *
    * Typically you will supply a custom function when you need to execute filtering, paging and sorting
    * on the server
    */
  var getData: js.UndefOr[IGetDataFunc[T] | IInterceptableGetDataFunc[T]] = js.undefined
  /**
    * The function that will be used group data rows according to the groupings returned by {@link NgTableParams} `group`
    */
  var getGroups: js.UndefOr[IGetGroupFunc[T]] = js.undefined
  var groupOptions: js.UndefOr[IGroupSettings] = js.undefined
  /**
    * The collection of interceptors that should apply to the results of a call to
    * the `getData` function before the data rows are displayed in the table
    */
  var interceptors: js.UndefOr[js.Array[IInterceptor[T]]] = js.undefined
  /**
    * Configuration for the template that will display the page size buttons
    */
  var paginationMaxBlocks: js.UndefOr[Double] = js.undefined
  /**
    * Configuration for the template that will display the page size buttons
    */
  var paginationMinBlocks: js.UndefOr[Double] = js.undefined
  /**
    * The html tag that will be used to display the sorting indicator in the table header
    */
  var sortingIndicator: js.UndefOr[String] = js.undefined
  /**
    * The total number of data rows before paging has been applied.
    * Typically you will not need to supply this yourself
    */
  var total: js.UndefOr[Double] = js.undefined
}

object ISettings {
  @scala.inline
  def apply[T](
    $loading: js.UndefOr[Boolean] = js.undefined,
    counts: js.Array[Double] = null,
    dataOptions: IDataSettings = null,
    dataset: js.Array[T] = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    defaultSort: SortDirection = null,
    filterOptions: IFilterSettings[T] = null,
    getData: /* params */ NgTableParams[T] => js.Any | js.Array[T] | IPromise[js.Array[T]] = null,
    getGroups: /* params */ NgTableParams[T] => js.Array[IDataRowGroup[T]] | IPromise[js.Array[IDataRowGroup[T]]] = null,
    groupOptions: IGroupSettings = null,
    interceptors: js.Array[IInterceptor[T]] = null,
    paginationMaxBlocks: Int | Double = null,
    paginationMinBlocks: Int | Double = null,
    sortingIndicator: String = null,
    total: Int | Double = null
  ): ISettings[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($loading)) __obj.updateDynamic("$loading")($loading.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (dataOptions != null) __obj.updateDynamic("dataOptions")(dataOptions.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.asInstanceOf[js.Any])
    if (defaultSort != null) __obj.updateDynamic("defaultSort")(defaultSort.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction1(getData))
    if (getGroups != null) __obj.updateDynamic("getGroups")(js.Any.fromFunction1(getGroups))
    if (groupOptions != null) __obj.updateDynamic("groupOptions")(groupOptions.asInstanceOf[js.Any])
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    if (paginationMaxBlocks != null) __obj.updateDynamic("paginationMaxBlocks")(paginationMaxBlocks.asInstanceOf[js.Any])
    if (paginationMinBlocks != null) __obj.updateDynamic("paginationMinBlocks")(paginationMinBlocks.asInstanceOf[js.Any])
    if (sortingIndicator != null) __obj.updateDynamic("sortingIndicator")(sortingIndicator.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings[T]]
  }
}

