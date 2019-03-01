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

object IInterceptor {
  @scala.inline
  def apply[T](
    response: js.Function2[
      /* data */ js.Any, 
      /* params */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
      _
    ] = null,
    responseError: js.Function2[
      /* reason */ js.Any, 
      /* params */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
      _
    ] = null
  ): IInterceptor[T] = {
    val __obj = js.Dynamic.literal()
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseError != null) __obj.updateDynamic("responseError")(responseError)
    __obj.asInstanceOf[IInterceptor[T]]
  }
}

