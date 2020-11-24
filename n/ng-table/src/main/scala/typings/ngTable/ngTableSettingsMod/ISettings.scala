package typings.ngTable.ngTableSettingsMod

import typings.angular.mod.IPromise
import typings.ngTable.dataSettingsMod.IDataSettings
import typings.ngTable.filterSettingsMod.IFilterSettings
import typings.ngTable.getDataMod.IGetDataFunc
import typings.ngTable.getDataMod.IInterceptableGetDataFunc
import typings.ngTable.getGroupMod.IGetGroupFunc
import typings.ngTable.groupSettingsMod.IGroupSettings
import typings.ngTable.interceptorMod.IInterceptor
import typings.ngTable.ngTableParamsMod.NgTableParams
import typings.ngTable.resultsMod.IDataRowGroup
import typings.ngTable.sortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISettings[T] extends js.Object {
  
  /**
    * Returns true whenever a call to `getData` is in progress
    */
  @JSName("$loading")
  var $loading: js.UndefOr[Boolean] = js.native
  
  /**
    * The page size buttons that should be displayed. Each value defined in the array
    * determines the possible values that can be supplied to {@link NgTableParams} `page`
    */
  var counts: js.UndefOr[js.Array[Double]] = js.native
  
  var dataOptions: js.UndefOr[IDataSettings] = js.native
  
  /**
    * An array that contains all the data rows that table should manage.
    * The `gateData` function will be used to manage the data rows
    * that ultimately will be displayed.
    */
  var dataset: js.UndefOr[js.Array[T]] = js.native
  
  var debugMode: js.UndefOr[Boolean] = js.native
  
  /**
    * The default sort direction that will be used whenever a sorting is supplied that
    * does not define its own sort direction
    */
  var defaultSort: js.UndefOr[SortDirection] = js.native
  
  var filterOptions: js.UndefOr[IFilterSettings[T]] = js.native
  
  /**
    * The function that will be used fetch data rows. Leave undefined to let the {@link IDefaultGetData}
    * service provide a default implementation that will work with the `dataset` array you supply.
    *
    * Typically you will supply a custom function when you need to execute filtering, paging and sorting
    * on the server
    */
  var getData: js.UndefOr[IGetDataFunc[T] | IInterceptableGetDataFunc[T]] = js.native
  
  /**
    * The function that will be used group data rows according to the groupings returned by {@link NgTableParams} `group`
    */
  var getGroups: js.UndefOr[IGetGroupFunc[T]] = js.native
  
  var groupOptions: js.UndefOr[IGroupSettings] = js.native
  
  /**
    * The collection of interceptors that should apply to the results of a call to
    * the `getData` function before the data rows are displayed in the table
    */
  var interceptors: js.UndefOr[js.Array[IInterceptor[T]]] = js.native
  
  /**
    * Configuration for the template that will display the page size buttons
    */
  var paginationMaxBlocks: js.UndefOr[Double] = js.native
  
  /**
    * Configuration for the template that will display the page size buttons
    */
  var paginationMinBlocks: js.UndefOr[Double] = js.native
  
  /**
    * The html tag that will be used to display the sorting indicator in the table header
    */
  var sortingIndicator: js.UndefOr[String] = js.native
  
  /**
    * The total number of data rows before paging has been applied.
    * Typically you will not need to supply this yourself
    */
  var total: js.UndefOr[Double] = js.native
}
object ISettings {
  
  @scala.inline
  def apply[T](): ISettings[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISettings[T]]
  }
  
  @scala.inline
  implicit class ISettingsOps[Self <: ISettings[_], T] (val x: Self with ISettings[T]) extends AnyVal {
    
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
    def set$loading(value: Boolean): Self = this.set("$loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$loading: Self = this.set("$loading", js.undefined)
    
    @scala.inline
    def setCountsVarargs(value: Double*): Self = this.set("counts", js.Array(value :_*))
    
    @scala.inline
    def setCounts(value: js.Array[Double]): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounts: Self = this.set("counts", js.undefined)
    
    @scala.inline
    def setDataOptions(value: IDataSettings): Self = this.set("dataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataOptions: Self = this.set("dataOptions", js.undefined)
    
    @scala.inline
    def setDatasetVarargs(value: T*): Self = this.set("dataset", js.Array(value :_*))
    
    @scala.inline
    def setDataset(value: js.Array[T]): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setDebugMode(value: Boolean): Self = this.set("debugMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugMode: Self = this.set("debugMode", js.undefined)
    
    @scala.inline
    def setDefaultSort(value: SortDirection): Self = this.set("defaultSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSort: Self = this.set("defaultSort", js.undefined)
    
    @scala.inline
    def setFilterOptions(value: IFilterSettings[T]): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setGetData(value: /* params */ NgTableParams[T] => js.Any | js.Array[T] | IPromise[js.Array[T]]): Self = this.set("getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    
    @scala.inline
    def setGetGroups(
      value: /* params */ NgTableParams[T] => js.Array[IDataRowGroup[T]] | IPromise[js.Array[IDataRowGroup[T]]]
    ): Self = this.set("getGroups", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetGroups: Self = this.set("getGroups", js.undefined)
    
    @scala.inline
    def setGroupOptions(value: IGroupSettings): Self = this.set("groupOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupOptions: Self = this.set("groupOptions", js.undefined)
    
    @scala.inline
    def setInterceptorsVarargs(value: IInterceptor[T]*): Self = this.set("interceptors", js.Array(value :_*))
    
    @scala.inline
    def setInterceptors(value: js.Array[IInterceptor[T]]): Self = this.set("interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterceptors: Self = this.set("interceptors", js.undefined)
    
    @scala.inline
    def setPaginationMaxBlocks(value: Double): Self = this.set("paginationMaxBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationMaxBlocks: Self = this.set("paginationMaxBlocks", js.undefined)
    
    @scala.inline
    def setPaginationMinBlocks(value: Double): Self = this.set("paginationMinBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationMinBlocks: Self = this.set("paginationMinBlocks", js.undefined)
    
    @scala.inline
    def setSortingIndicator(value: String): Self = this.set("sortingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortingIndicator: Self = this.set("sortingIndicator", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
