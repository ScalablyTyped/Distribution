package typings.ngTable

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.ILogService
import typings.angular.mod.IPromise
import typings.angular.mod.IQService
import typings.ngTable.filterFuncMod.IFilterValues
import typings.ngTable.groupingFuncMod.GroupSort
import typings.ngTable.groupingFuncMod.Grouping
import typings.ngTable.groupingFuncMod.IGroupValues
import typings.ngTable.groupingFuncMod.IGroupingFunc
import typings.ngTable.ngTableDefaultsMod.IDefaults
import typings.ngTable.ngTableEventsChannelMod.NgTableEventsChannel
import typings.ngTable.ngTableSettingsMod.ISettings
import typings.ngTable.ngTableSettingsMod.NgTableSettings
import typings.ngTable.pagingMod.IPageButton
import typings.ngTable.resultsMod.DataResult
import typings.ngTable.sortingMod.ISortingValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableParamsMod {
  
  @JSImport("ng-table/src/core/ngTableParams", "NgTableParams")
  @js.native
  class NgTableParams[T] () extends StObject {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: Unit, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
    
    /* private */ var _params: js.Any = js.native
    
    /* private */ var _settings: js.Any = js.native
    
    /**
      * Returns the number of data rows per page
      */
    def count(): Double = js.native
    /**
      * Sets the number of data rows per page.
      * Changes to count will cause `isDataReloadRequired` to return true
      */
    def count(count: Double): this.type = js.native
    
    /* private */ def createComparableParams(): js.Any = js.native
    
    /**
      * The page of data rows currently being displayed in the table
      */
    var data: js.Array[T] = js.native
    
    /* private */ var defaultSettings: js.Any = js.native
    
    /* private */ var errParamsMemento: js.Any = js.native
    
    /**
      * Returns the current filter values used to restrict the set of data rows.
      * @param trim supply true to return the current filter minus any insignificant values
      * (null,  undefined and empty string)
      */
    def filter(): IFilterValues = js.native
    /**
      * Sets filter values to the `filter` supplied; any existing filter will be removed
      * Changes to filter will cause `isDataReloadRequired` to return true and the current `page` to be set to 1
      */
    def filter(filter: IFilterValues): this.type = js.native
    def filter(trim: Boolean): IFilterValues = js.native
    
    /**
      * Generate array of pages.
      * When no arguments supplied, the current parameter state of this `NgTableParams` instance will be used
      * @param currentPage Which page must be active
      * @param totalItems  Total quantity of items
      * @param pageSize    Quantity of items on page
      * @param maxBlocks   Quantity of blocks for pagination
      * @returns Array of pages
      */
    def generatePagesArray(): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Double, totalItems: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Double, totalItems: Double, pageSize: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Double, totalItems: Double, pageSize: Double, maxBlocks: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Double, totalItems: Double, pageSize: Unit, maxBlocks: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Double, totalItems: Unit, pageSize: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Double, totalItems: Unit, pageSize: Double, maxBlocks: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Double, totalItems: Unit, pageSize: Unit, maxBlocks: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Unit, totalItems: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Unit, totalItems: Double, pageSize: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Unit, totalItems: Double, pageSize: Double, maxBlocks: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Unit, totalItems: Double, pageSize: Unit, maxBlocks: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Unit, totalItems: Unit, pageSize: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Unit, totalItems: Unit, pageSize: Double, maxBlocks: Double): js.Array[IPageButton] = js.native
    def generatePagesArray(currentPage: Unit, totalItems: Unit, pageSize: Unit, maxBlocks: Double): js.Array[IPageButton] = js.native
    
    /**
      * Returns the current grouping used to group the data rows
      */
    def group(): Grouping[T] = js.native
    /**
      * Sets grouping to the `field` and `sortDirection` supplied; any existing grouping will be removed
      * Changes to group will cause `isDataReloadRequired` to return true and the current `page` to be set to 1
      */
    def group(field: String): this.type = js.native
    def group(field: String, sortDirection: GroupSort): this.type = js.native
    /**
      * Sets grouping to the `group` supplied; any existing grouping will be removed.
      * Changes to group will cause `isDataReloadRequired` to return true and the current `page` to be set to 1
      */
    def group(group: IGroupValues): this.type = js.native
    /**
      * Sets grouping to the `group` supplied; any existing grouping will be removed.
      * If `sortDirection` is supplied, this will be assigned to the sortDirection property of `group`
      * Changes to group will cause `isDataReloadRequired` to return true and the current `page` to be set to 1
      */
    def group(group: IGroupingFunc[T]): this.type = js.native
    def group(group: IGroupingFunc[T], sortDirection: GroupSort): this.type = js.native
    
    /**
      * Returns true when an attempt to `reload` the current `parameter` values have resulted in a failure.
      * This method will continue to return true until the `reload` is successfully called or when the
      * `parameter` values have changed
      */
    def hasErrorState(): Boolean = js.native
    
    /**
      * Returns true if `filter` has significant filter value(s) (any value except null, undefined, or empty string),
      * otherwise false
      */
    def hasFilter(): Boolean = js.native
    
    /**
      * Return true when a change to `filters` require the `reload` method
      * to be run so as to ensure the data presented to the user reflects these filters
      */
    def hasFilterChanges(): Boolean = js.native
    
    /* private */ def hasGlobalSearchFieldChanges(): js.Any = js.native
    
    /**
      * Returns true when at least one group has been set
      */
    def hasGroup(): Boolean = js.native
    /**
      * Returns true when the `group` and when supplied, the `sortDirection` matches an existing group
      */
    def hasGroup(group: String): Boolean = js.native
    def hasGroup(group: String, sortDirection: String): Boolean = js.native
    def hasGroup(group: IGroupingFunc[T]): Boolean = js.native
    def hasGroup(group: IGroupingFunc[T], sortDirection: String): Boolean = js.native
    
    /* private */ var initialEvents: js.Any = js.native
    
    /* private */ var isCommittedDataset: js.Any = js.native
    
    /**
      * Return true when a change to this instance should require the `reload` method
      * to be run so as to ensure the data rows presented to the user reflects the current state.
      *
      * Note that this method will return false when the `reload` method has run but fails. In this case
      * `hasErrorState` will return true.
      *
      * The built-in `ngTable` directives will watch for when this function returns true and will then call
      * the `reload` method to load its data rows
      */
    def isDataReloadRequired(): Boolean = js.native
    
    var isNullInstance: Boolean = js.native
    
    /**
      * Returns true if sorting by the field supplied. Where direction supplied
      * the field must also be sorted by that direction to return true
      */
    def isSortBy(field: String): Boolean = js.native
    def isSortBy(field: String, direction: String): Boolean = js.native
    
    /* private */ def log(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type <none> is not an array type */ args: js.Any
    ): js.Any = js.native
    
    /**
      * Returns sorting values in a format that can be consumed by the angular `$orderBy` filter service
      */
    def orderBy(): js.Array[String] = js.native
    
    /**
      * Returns the index of the current "slice" of data rows
      */
    def page(): Double = js.native
    /**
      * Sets the index of the current "slice" of data rows. The index starts at 1.
      * Changing the page number will cause `isDataReloadRequired` to return true
      */
    def page(page: Double): this.type = js.native
    
    /**
      * Set new parameters
      */
    def parameters(): this.type = js.native
    def parameters(newParameters: StringDictionary[String]): this.type = js.native
    def parameters(newParameters: StringDictionary[String], parseParamsFromUrl: Boolean): this.type = js.native
    def parameters(newParameters: Unit, parseParamsFromUrl: Boolean): this.type = js.native
    def parameters(newParameters: IParamValues[T]): this.type = js.native
    def parameters(newParameters: IParamValues[T], parseParamsFromUrl: Boolean): this.type = js.native
    @JSName("parameters")
    def parameters_IParamValues(): IParamValues[T] = js.native
    
    /* private */ def parseGroup(group: js.Any): js.Any = js.native
    
    /* private */ var prevParamsMemento: js.Any = js.native
    
    /**
      * Trigger a reload of the data rows
      */
    def reload[TResult /* <: DataResult[T] */](): IPromise[js.Array[TResult]] = js.native
    
    def reloadPages(): Unit = js.native
    
    /* private */ def runInterceptorPipeline(fetchedData: js.Any): js.Any = js.native
    
    /**
      * Returns the settings for the table.
      */
    def settings(): ISettings[T] = js.native
    /**
      * Sets the settings for the table; new setting values will be merged with the existing settings.
      * Supplying a new `dataset` will cause `isDataReloadRequired` to return true and the `ngTableEventsChannel`
      * to fire its `datasetChanged` event
      */
    def settings(newSettings: ISettings[T]): this.type = js.native
    
    /**
      * Returns the current sorting used to order the data rows.
      * Changes to sorting will cause `isDataReloadRequired` to return true
      */
    def sorting(): ISortingValues = js.native
    /**
      * Sets sorting to the `field` and `direction` supplied; any existing sorting will be removed
      */
    def sorting(field: String, direction: String): this.type = js.native
    /**
      * Sets sorting values to the `sorting` supplied; any existing sorting will be removed.
      * Changes to sorting will cause `isDataReloadRequired` to return true
      */
    def sorting(sorting: ISortingValues): this.type = js.native
    
    /**
      * Returns the count of the data rows that match the current `filter`
      */
    def total(): Double = js.native
    /**
      * Sets `settings().total` to the value supplied.
      * Typically you will need to set a `total` in the body of any custom `getData` function
      * you supply as a setting value to this instance.
      * @example
      * ```js
      * const tp = new NgTableParams({}, { getData: customGetData })
      * function customGetData(params) {
      *      const queryResult = // code to fetch current data rows and total //
      *      params.total(queryResult.total);
      *      return queryResult.dataRowsPage;
      * }
      * ```
      */
    def total(total: Double): this.type = js.native
    
    /**
      * Returns the current parameter values uri-encoded. Set `asString` to
      * true for the parameters to be returned as an array of strings of the form 'paramName=value'
      * otherwise parameters returned as a key-value object
      */
    def url(): StringDictionary[String] = js.native
    def url(asString: Boolean): StringDictionary[String] = js.native
  }
  /* static members */
  object NgTableParams {
    
    @JSImport("ng-table/src/core/ngTableParams", "NgTableParams")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/core/ngTableParams", "NgTableParams.$log")
    @js.native
    def $log: js.Any = js.native
    inline def $log_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$log")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core/ngTableParams", "NgTableParams.$q")
    @js.native
    def $q: js.Any = js.native
    inline def $q_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$q")(x.asInstanceOf[js.Any])
    
    inline def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")($q.asInstanceOf[js.Any], $log.asInstanceOf[js.Any], ngTableDefaults.asInstanceOf[js.Any], ngTableEventsChannel.asInstanceOf[js.Any], ngTableSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("ng-table/src/core/ngTableParams", "NgTableParams.ngTableDefaults")
    @js.native
    def ngTableDefaults: js.Any = js.native
    inline def ngTableDefaults_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableDefaults")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core/ngTableParams", "NgTableParams.ngTableEventsChannel")
    @js.native
    def ngTableEventsChannel: js.Any = js.native
    inline def ngTableEventsChannel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableEventsChannel")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core/ngTableParams", "NgTableParams.ngTableSettings")
    @js.native
    def ngTableSettings: js.Any = js.native
    inline def ngTableSettings_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableSettings")(x.asInstanceOf[js.Any])
  }
  
  trait IParamValues[T] extends StObject {
    
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
    
    inline def apply[T](): IParamValues[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParamValues[T]]
    }
    
    extension [Self <: IParamValues[?], T](x: Self & IParamValues[T]) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setFilter(value: IFilterValues): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGroup(value: String | Grouping[T]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setSorting(value: ISortingValues): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
      
      inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    }
  }
  
  @js.native
  trait InternalTableParams[T] extends NgTableParams[T]
}
