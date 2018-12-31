package typings
package mobxLib.libTypesInterceptDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInterceptable[T] extends js.Object {
  var interceptors: js.UndefOr[js.Array[IInterceptor[T]]]
  def intercept(handler: IInterceptor[T]): mobxLib.libUtilsUtilsMod.Lambda
}

