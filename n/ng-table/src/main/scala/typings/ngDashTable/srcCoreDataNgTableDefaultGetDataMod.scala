package typings.ngDashTable

import typings.angular.angularMod.IFilterOrderBy
import typings.angular.angularMod.IFilterService
import typings.angular.angularMod.IServiceProvider
import typings.ngDashTable.srcCoreDataNgTableDefaultGetDataMod.IDefaultGetData
import typings.ngDashTable.srcCoreFilteringFilterFuncMod.IFilterFunc
import typings.ngDashTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel
import typings.ngDashTable.srcCoreNgTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/data/ngTableDefaultGetData", JSImport.Namespace)
@js.native
object srcCoreDataNgTableDefaultGetDataMod extends js.Object {
  @js.native
  trait IDefaultGetData[T] extends js.Object {
    def apply(data: js.Array[T], params: NgTableParams[T]): js.Array[T] = js.native
    /**
      * Convenience function that this service will use to apply paging to the data rows.
      *
      * Returns a slice of rows from the `data` array supplied and sets the `NgTableParams.total()`
      * on the `params` instance supplied to `data.length`
      */
    def applyPaging(data: js.Array[T], params: NgTableParams[_]): js.Array[T] = js.native
    /**
      * Returns a reference to the function that this service will use to filter data rows
      */
    def getFilterFn(params: NgTableParams[T]): IFilterFunc[T] = js.native
    /**
      * Returns a reference to the function that this service will use to sort data rows
      */
    def getOrderByFn(): IFilterOrderBy = js.native
    def getOrderByFn(params: NgTableParams[T]): IFilterOrderBy = js.native
  }
  
  @js.native
  class NgTableDefaultGetDataProvider () extends IServiceProvider {
    /**
      * The name of a angular filter that knows how to apply the values returned by
      * `NgTableParams.filter()` to restrict an array of data.
      * (defaults to the angular `filter` filter service)
      */
    var filterFilterName: String = js.native
    /**
      * The name of a angular filter that knows how to apply the values returned by
      * `NgTableParams.orderBy()` to sort an array of data.
      * (defaults to the angular `orderBy` filter service)
      */
    var sortingFilterName: String = js.native
    @JSName("$get")
    def $get_MNgTableDefaultGetDataProvider($filter: IFilterService, ngTableEventsChannel: NgTableEventsChannel): IDefaultGetData[_] = js.native
  }
  
}

