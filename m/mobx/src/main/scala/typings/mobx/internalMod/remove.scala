package typings.mobx.internalMod

import typings.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "remove")
@js.native
object remove extends js.Object {
  
  def apply[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def apply[T](obj: ObservableSet[T], key: T): js.Any = js.native
  def apply[T](obj: IObservableArray[T], index: Double): js.Any = js.native
  def apply[K, V](obj: ObservableMap[K, V], key: K): js.Any = js.native
}
