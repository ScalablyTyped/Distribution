package typings
package ngDashTableLib.srcCoreDataNgTableDefaultGetDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefaultGetData[T] extends js.Object {
  def apply(data: js.Array[T], params: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T]): js.Array[T] = js.native
  /**
    * Convenience function that this service will use to apply paging to the data rows.
    *
    * Returns a slice of rows from the `data` array supplied and sets the `NgTableParams.total()`
    * on the `params` instance supplied to `data.length`
    */
  def applyPaging(data: js.Array[T], params: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[_]): js.Array[T] = js.native
  /**
    * Returns a reference to the function that this service will use to filter data rows
    */
  def getFilterFn(params: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T]): ngDashTableLib.srcCoreFilteringFilterFuncMod.IFilterFunc[T] = js.native
  /**
    * Returns a reference to the function that this service will use to sort data rows
    */
  def getOrderByFn(): angularLib.angularMod.angularNs.IFilterOrderBy = js.native
  def getOrderByFn(params: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T]): angularLib.angularMod.angularNs.IFilterOrderBy = js.native
}

