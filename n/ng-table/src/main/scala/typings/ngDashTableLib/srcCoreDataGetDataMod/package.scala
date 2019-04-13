package typings
package ngDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreDataGetDataMod {
  type IGetDataFunc[T] = js.Function1[
    /* params */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
    js.Array[T] | angularLib.angularMod.IPromise[js.Array[T]]
  ]
  type IInterceptableGetDataFunc[T] = js.Function1[/* params */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], js.Any]
}
