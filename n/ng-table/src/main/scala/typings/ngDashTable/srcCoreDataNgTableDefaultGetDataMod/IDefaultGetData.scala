package typings.ngDashTable.srcCoreDataNgTableDefaultGetDataMod

import typings.angular.angularMod.IFilterOrderBy
import typings.ngDashTable.srcCoreFilteringFilterFuncMod.IFilterFunc
import typings.ngDashTable.srcCoreNgTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

