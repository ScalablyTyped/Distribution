package typings
package mobxLib.libTypesObservablearrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableArray[T]
  extends stdLib.Array[T] {
  def clear(): js.Array[T] = js.native
  def intercept(
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(listener: js.Function1[/* changeData */ IArrayChange[T] | IArraySplice[T], scala.Unit]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(
    listener: js.Function1[/* changeData */ IArrayChange[T] | IArraySplice[T], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def remove(value: T): scala.Boolean = js.native
  def replace(newItems: js.Array[T]): js.Array[T] = js.native
  def spliceWithArray(index: scala.Double): js.Array[T] = js.native
  def spliceWithArray(index: scala.Double, deleteCount: scala.Double): js.Array[T] = js.native
  def spliceWithArray(index: scala.Double, deleteCount: scala.Double, newItems: js.Array[T]): js.Array[T] = js.native
  def toJS(): js.Array[T] = js.native
  def toJSON(): js.Array[T] = js.native
}

