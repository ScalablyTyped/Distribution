package typings
package ngDashTableLib.srcCoreNgTableSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettings[T] extends js.Object {
  /**
    * Returns true whenever a call to `getData` is in progress
    */
  @JSName("$loading")
  var $loading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The page size buttons that should be displayed. Each value defined in the array
    * determines the possible values that can be supplied to {@link NgTableParams} `page`
    */
  var counts: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var dataOptions: js.UndefOr[ngDashTableLib.srcCoreDataDataSettingsMod.IDataSettings] = js.undefined
  /**
    * An array that contains all the data rows that table should manage.
    * The `gateData` function will be used to manage the data rows
    * that ultimately will be displayed.
    */
  var dataset: js.UndefOr[js.Array[T]] = js.undefined
  var debugMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default sort direction that will be used whenever a sorting is supplied that
    * does not define its own sort direction
    */
  var defaultSort: js.UndefOr[ngDashTableLib.srcCoreSortingMod.SortDirection] = js.undefined
  var filterOptions: js.UndefOr[ngDashTableLib.srcCoreFilteringFilterSettingsMod.IFilterSettings[T]] = js.undefined
  /**
    * The function that will be used fetch data rows. Leave undefined to let the {@link IDefaultGetData}
    * service provide a default implementation that will work with the `dataset` array you supply.
    *
    * Typically you will supply a custom function when you need to execute filtering, paging and sorting
    * on the server
    */
  var getData: js.UndefOr[
    ngDashTableLib.srcCoreDataGetDataMod.IGetDataFunc[T] | ngDashTableLib.srcCoreDataGetDataMod.IInterceptableGetDataFunc[T]
  ] = js.undefined
  /**
    * The function that will be used group data rows according to the groupings returned by {@link NgTableParams} `group`
    */
  var getGroups: js.UndefOr[ngDashTableLib.srcCoreGroupingGetGroupMod.IGetGroupFunc[T]] = js.undefined
  var groupOptions: js.UndefOr[ngDashTableLib.srcCoreGroupingGroupSettingsMod.IGroupSettings] = js.undefined
  /**
    * The collection of interceptors that should apply to the results of a call to
    * the `getData` function before the data rows are displayed in the table
    */
  var interceptors: js.UndefOr[js.Array[ngDashTableLib.srcCoreDataInterceptorMod.IInterceptor[T]]] = js.undefined
  /**
    * Configuration for the template that will display the page size buttons
    */
  var paginationMaxBlocks: js.UndefOr[scala.Double] = js.undefined
  /**
    * Configuration for the template that will display the page size buttons
    */
  var paginationMinBlocks: js.UndefOr[scala.Double] = js.undefined
  /**
    * The html tag that will be used to display the sorting indicator in the table header
    */
  var sortingIndicator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The total number of data rows before paging has been applied.
    * Typically you will not need to supply this yourself
    */
  var total: js.UndefOr[scala.Double] = js.undefined
}

object ISettings {
  @scala.inline
  def apply[T](
    $loading: js.UndefOr[scala.Boolean] = js.undefined,
    counts: js.Array[scala.Double] = null,
    dataOptions: ngDashTableLib.srcCoreDataDataSettingsMod.IDataSettings = null,
    dataset: js.Array[T] = null,
    debugMode: js.UndefOr[scala.Boolean] = js.undefined,
    defaultSort: ngDashTableLib.srcCoreSortingMod.SortDirection = null,
    filterOptions: ngDashTableLib.srcCoreFilteringFilterSettingsMod.IFilterSettings[T] = null,
    getData: ngDashTableLib.srcCoreDataGetDataMod.IGetDataFunc[T] | ngDashTableLib.srcCoreDataGetDataMod.IInterceptableGetDataFunc[T] = null,
    getGroups: ngDashTableLib.srcCoreGroupingGetGroupMod.IGetGroupFunc[T] = null,
    groupOptions: ngDashTableLib.srcCoreGroupingGroupSettingsMod.IGroupSettings = null,
    interceptors: js.Array[ngDashTableLib.srcCoreDataInterceptorMod.IInterceptor[T]] = null,
    paginationMaxBlocks: scala.Int | scala.Double = null,
    paginationMinBlocks: scala.Int | scala.Double = null,
    sortingIndicator: java.lang.String = null,
    total: scala.Int | scala.Double = null
  ): ISettings[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($loading)) __obj.updateDynamic("$loading")($loading)
    if (counts != null) __obj.updateDynamic("counts")(counts)
    if (dataOptions != null) __obj.updateDynamic("dataOptions")(dataOptions)
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode)
    if (defaultSort != null) __obj.updateDynamic("defaultSort")(defaultSort)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (getData != null) __obj.updateDynamic("getData")(getData.asInstanceOf[js.Any])
    if (getGroups != null) __obj.updateDynamic("getGroups")(getGroups)
    if (groupOptions != null) __obj.updateDynamic("groupOptions")(groupOptions)
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors)
    if (paginationMaxBlocks != null) __obj.updateDynamic("paginationMaxBlocks")(paginationMaxBlocks.asInstanceOf[js.Any])
    if (paginationMinBlocks != null) __obj.updateDynamic("paginationMinBlocks")(paginationMinBlocks.asInstanceOf[js.Any])
    if (sortingIndicator != null) __obj.updateDynamic("sortingIndicator")(sortingIndicator)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings[T]]
  }
}

