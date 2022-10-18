package typings.ngTable

import typings.angular.mod.IFilterOrderBy
import typings.angular.mod.IFilterService
import typings.angular.mod.IServiceProvider
import typings.ngTable.srcCoreFilteringFilterFuncMod.IFilterFunc
import typings.ngTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel
import typings.ngTable.srcCoreNgTableParamsMod.NgTableParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreDataNgTableDefaultGetDataMod {
  
  @JSImport("ng-table/src/core/data/ngTableDefaultGetData", "NgTableDefaultGetDataProvider")
  @js.native
  open class NgTableDefaultGetDataProvider ()
    extends StObject
       with IServiceProvider {
    
    /* CompleteClass */
    @JSName("$get")
    var $get: Any = js.native
    @JSName("$get")
    def $get_MNgTableDefaultGetDataProvider($filter: IFilterService, ngTableEventsChannel: NgTableEventsChannel): IDefaultGetData[Any] = js.native
    
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
  }
  
  @js.native
  trait IDefaultGetData[T] extends StObject {
    
    def apply(data: js.Array[T], params: NgTableParams[T]): js.Array[T] = js.native
    
    /**
      * Convenience function that this service will use to apply paging to the data rows.
      *
      * Returns a slice of rows from the `data` array supplied and sets the `NgTableParams.total()`
      * on the `params` instance supplied to `data.length`
      */
    def applyPaging(data: js.Array[T], params: NgTableParams[Any]): js.Array[T] = js.native
    
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
}
