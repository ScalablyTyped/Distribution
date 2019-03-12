package typings
package mobxLib.libTypesInterceptDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInterceptable[T] extends js.Object {
  var interceptors: js.UndefOr[js.Array[IInterceptor[T]]]
  def intercept(handler: IInterceptor[T]): mobxLib.libUtilsUtilsMod.Lambda
}

object IInterceptable {
  @scala.inline
  def apply[T](
    intercept: IInterceptor[T] => mobxLib.libUtilsUtilsMod.Lambda,
    interceptors: js.Array[IInterceptor[T]] = null
  ): IInterceptable[T] = {
    val __obj = js.Dynamic.literal(intercept = js.Any.fromFunction1(intercept))
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors)
    __obj.asInstanceOf[IInterceptable[T]]
  }
}

