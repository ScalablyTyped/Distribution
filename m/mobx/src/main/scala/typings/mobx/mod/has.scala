package typings.mobx.mod

import typings.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "has")
@js.native
object has extends js.Object {
  def apply[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  def apply[K](obj: typings.mobx.internalMod.ObservableMap[K, _], key: K): Boolean = js.native
  def apply[T](obj: typings.mobx.internalMod.ObservableSet[T], key: T): Boolean = js.native
  def apply[T](obj: IObservableArray[T], index: Double): Boolean = js.native
}

