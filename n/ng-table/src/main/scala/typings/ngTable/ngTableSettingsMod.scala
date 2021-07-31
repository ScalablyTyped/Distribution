package typings.ngTable

import typings.angular.mod.IPromise
import typings.ngTable.dataSettingsMod.IDataSettings
import typings.ngTable.filterSettingsMod.IFilterSettings
import typings.ngTable.getDataMod.IGetDataFunc
import typings.ngTable.getDataMod.IInterceptableGetDataFunc
import typings.ngTable.getGroupMod.IGetGroupFunc
import typings.ngTable.groupSettingsMod.IGroupSettings
import typings.ngTable.interceptorMod.IInterceptor
import typings.ngTable.ngTableDefaultGetDataMod.IDefaultGetData
import typings.ngTable.ngTableDefaultsMod.IDefaults
import typings.ngTable.ngTableParamsMod.NgTableParams
import typings.ngTable.resultsMod.IDataRowGroup
import typings.ngTable.sortingMod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableSettingsMod {
  
  @JSImport("ng-table/src/core/ngTableSettings", "NgTableSettings")
  @js.native
  class NgTableSettings protected () extends StObject {
    def this(
      ngTableDefaults: IDefaults,
      ngTableDefaultGetData: IDefaultGetData[js.Any],
      ngTableDefaultGetGroups: IGetGroupFunc[js.Any]
    ) = this()
    
    def createDefaults[T](): ISettings[T] = js.native
    
    var defaults: js.Any = js.native
    
    def merge[T](existing: ISettings[T], newSettings: ISettings[T]): ISettings[T] = js.native
    
    var ngTableDefaultGetData: js.Any = js.native
    
    var ngTableDefaultGetGroups: js.Any = js.native
    
    var ngTableDefaults: js.Any = js.native
    
    /* private */ def optimizeFilterDelay[T](settings: js.Any): js.Any = js.native
  }
  /* static members */
  object NgTableSettings {
    
    @JSImport("ng-table/src/core/ngTableSettings", "NgTableSettings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/core/ngTableSettings", "NgTableSettings.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  trait ISettings[T] extends StObject {
    
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
    def apply[T](): ISettings[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISettings[T]]
    }
    
    @scala.inline
    implicit class ISettingsMutableBuilder[Self <: ISettings[?], T] (val x: Self & ISettings[T]) extends AnyVal {
      
      @scala.inline
      def set$loading(value: Boolean): Self = StObject.set(x, "$loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$loadingUndefined: Self = StObject.set(x, "$loading", js.undefined)
      
      @scala.inline
      def setCounts(value: js.Array[Double]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
      
      @scala.inline
      def setCountsVarargs(value: Double*): Self = StObject.set(x, "counts", js.Array(value :_*))
      
      @scala.inline
      def setDataOptions(value: IDataSettings): Self = StObject.set(x, "dataOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataOptionsUndefined: Self = StObject.set(x, "dataOptions", js.undefined)
      
      @scala.inline
      def setDataset(value: js.Array[T]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      @scala.inline
      def setDatasetVarargs(value: T*): Self = StObject.set(x, "dataset", js.Array(value :_*))
      
      @scala.inline
      def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      @scala.inline
      def setDefaultSort(value: SortDirection): Self = StObject.set(x, "defaultSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSortUndefined: Self = StObject.set(x, "defaultSort", js.undefined)
      
      @scala.inline
      def setFilterOptions(value: IFilterSettings[T]): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
      
      @scala.inline
      def setGetData(value: /* params */ NgTableParams[T] => js.Any | js.Array[T] | IPromise[js.Array[T]]): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      @scala.inline
      def setGetGroups(
        value: /* params */ NgTableParams[T] => js.Array[IDataRowGroup[T]] | IPromise[js.Array[IDataRowGroup[T]]]
      ): Self = StObject.set(x, "getGroups", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetGroupsUndefined: Self = StObject.set(x, "getGroups", js.undefined)
      
      @scala.inline
      def setGroupOptions(value: IGroupSettings): Self = StObject.set(x, "groupOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupOptionsUndefined: Self = StObject.set(x, "groupOptions", js.undefined)
      
      @scala.inline
      def setInterceptors(value: js.Array[IInterceptor[T]]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
      
      @scala.inline
      def setInterceptorsVarargs(value: IInterceptor[T]*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
      
      @scala.inline
      def setPaginationMaxBlocks(value: Double): Self = StObject.set(x, "paginationMaxBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationMaxBlocksUndefined: Self = StObject.set(x, "paginationMaxBlocks", js.undefined)
      
      @scala.inline
      def setPaginationMinBlocks(value: Double): Self = StObject.set(x, "paginationMinBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationMinBlocksUndefined: Self = StObject.set(x, "paginationMinBlocks", js.undefined)
      
      @scala.inline
      def setSortingIndicator(value: String): Self = StObject.set(x, "sortingIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingIndicatorUndefined: Self = StObject.set(x, "sortingIndicator", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
