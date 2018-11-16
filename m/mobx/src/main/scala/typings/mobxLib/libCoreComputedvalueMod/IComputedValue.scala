package typings
package mobxLib.libCoreComputedvalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComputedValue[T] extends js.Object {
  def get(): T = js.native
  def observe(
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def set(value: T): scala.Unit = js.native
}

