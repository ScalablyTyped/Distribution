package typings
package ngDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreGroupingGetGroupMod {
  type IGetGroupFunc[T] = js.Function1[
    /* params */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
    js.Array[ngDashTableLib.srcCoreDataResultsMod.IDataRowGroup[T]] | angularLib.angularMod.IPromise[js.Array[ngDashTableLib.srcCoreDataResultsMod.IDataRowGroup[T]]]
  ]
}
