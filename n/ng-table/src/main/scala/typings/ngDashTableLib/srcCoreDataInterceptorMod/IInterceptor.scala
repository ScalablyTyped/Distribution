package typings
package ngDashTableLib.srcCoreDataInterceptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInterceptor[T] extends js.Object {
  var response: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* params */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
      _
    ]
  ] = js.undefined
  var responseError: js.UndefOr[
    js.Function2[
      /* reason */ js.Any, 
      /* params */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
      _
    ]
  ] = js.undefined
}

