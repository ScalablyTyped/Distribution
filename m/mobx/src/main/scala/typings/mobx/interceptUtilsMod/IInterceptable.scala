package typings.mobx.interceptUtilsMod

import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInterceptable[T] extends js.Object {
  var interceptors: js.UndefOr[js.Array[IInterceptor[T]]] = js.undefined
  def intercept(handler: IInterceptor[T]): Lambda
}

object IInterceptable {
  @scala.inline
  def apply[T](intercept: IInterceptor[T] => Lambda, interceptors: js.Array[IInterceptor[T]] = null): IInterceptable[T] = {
    val __obj = js.Dynamic.literal(intercept = js.Any.fromFunction1(intercept))
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInterceptable[T]]
  }
}

