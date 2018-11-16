package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableArray[T]
  extends IObservable
     with stdLib.Array[T] {
  def clear(): js.Array[T] = js.native
  def find(
    predicate: js.Function3[/* item */ T, /* index */ scala.Double, /* array */ IObservableArray[T], scala.Boolean],
    thisArg: js.Any,
    fromIndex: scala.Double
  ): T = js.native
  def peek(): js.Array[T] = js.native
  def remove(value: T): scala.Boolean = js.native
  def replace(newItems: js.Array[T]): js.Array[T] = js.native
  def spliceWithArray(index: scala.Double): js.Array[T] = js.native
  def spliceWithArray(index: scala.Double, deleteCount: scala.Double): js.Array[T] = js.native
  def spliceWithArray(index: scala.Double, deleteCount: scala.Double, newItems: js.Array[T]): js.Array[T] = js.native
}

