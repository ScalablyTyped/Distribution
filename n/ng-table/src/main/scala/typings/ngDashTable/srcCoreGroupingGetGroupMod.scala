package typings.ngDashTable

import typings.angular.angularMod.IPromise
import typings.ngDashTable.srcCoreDataResultsMod.IDataRowGroup
import typings.ngDashTable.srcCoreNgTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/grouping/getGroup", JSImport.Namespace)
@js.native
object srcCoreGroupingGetGroupMod extends js.Object {
  type IGetGroupFunc[T] = js.Function1[
    /* params */ NgTableParams[T], 
    js.Array[IDataRowGroup[T]] | IPromise[js.Array[IDataRowGroup[T]]]
  ]
}

