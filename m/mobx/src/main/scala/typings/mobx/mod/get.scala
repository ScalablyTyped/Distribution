package typings.mobx.mod

import typings.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "get")
@js.native
object get extends js.Object {
  def apply[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def apply[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = js.native
  def apply[K, V](obj: typings.mobx.observablemapMod.ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
}

