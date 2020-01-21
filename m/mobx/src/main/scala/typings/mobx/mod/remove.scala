package typings.mobx.mod

import typings.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "remove")
@js.native
object remove extends js.Object {
  def apply[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def apply[T](obj: typings.mobx.internalMod.ObservableSet[T], key: T): js.Any = js.native
  def apply[T](obj: IObservableArray[T], index: Double): js.Any = js.native
  def apply[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K): js.Any = js.native
}

