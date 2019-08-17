package typings.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreGroupingGetGroupMod {
  import typings.angular.angularMod.IPromise
  import typings.ngDashTable.srcCoreDataResultsMod.IDataRowGroup
  import typings.ngDashTable.srcCoreNgTableParamsMod.NgTableParams

  type IGetGroupFunc[T] = js.Function1[
    /* params */ NgTableParams[T], 
    js.Array[IDataRowGroup[T]] | IPromise[js.Array[IDataRowGroup[T]]]
  ]
}
