package typings
package mobxLib.libTypesObservablevalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableValue[T] extends js.Object {
  def get(): T = js.native
  def intercept(handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[IValueWillChange[T]]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(listener: js.Function1[/* change */ IValueDidChange[T], scala.Unit]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(
    listener: js.Function1[/* change */ IValueDidChange[T], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def set(value: T): scala.Unit = js.native
}

