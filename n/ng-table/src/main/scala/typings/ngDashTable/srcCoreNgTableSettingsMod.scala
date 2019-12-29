package typings.ngDashTable

import typings.ngDashTable.srcCoreDataDataSettingsMod.IDataSettings
import typings.ngDashTable.srcCoreDataGetDataMod.IGetDataFunc
import typings.ngDashTable.srcCoreDataGetDataMod.IInterceptableGetDataFunc
import typings.ngDashTable.srcCoreDataInterceptorMod.IInterceptor
import typings.ngDashTable.srcCoreDataNgTableDefaultGetDataMod.IDefaultGetData
import typings.ngDashTable.srcCoreFilteringFilterSettingsMod.IFilterSettings
import typings.ngDashTable.srcCoreGroupingGetGroupMod.IGetGroupFunc
import typings.ngDashTable.srcCoreGroupingGroupSettingsMod.IGroupSettings
import typings.ngDashTable.srcCoreNgTableDefaultsMod.IDefaults
import typings.ngDashTable.srcCoreSortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/ngTableSettings", JSImport.Namespace)
@js.native
object srcCoreNgTableSettingsMod extends js.Object {
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
  
  @js.native
  class NgTableSettings protected () extends js.Object {
    def this(
      ngTableDefaults: IDefaults,
      ngTableDefaultGetData: IDefaultGetData[_],
      ngTableDefaultGetGroups: IGetGroupFunc[_]
    ) = this()
    var defaults: js.Any = js.native
    var ngTableDefaultGetData: js.Any = js.native
    var ngTableDefaultGetGroups: js.Any = js.native
    var ngTableDefaults: js.Any = js.native
    def createDefaults[T](): ISettings[T] = js.native
    def merge[T](existing: ISettings[T], newSettings: ISettings[T]): ISettings[T] = js.native
    /* private */ def optimizeFilterDelay[T](settings: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object NgTableSettings extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
}

