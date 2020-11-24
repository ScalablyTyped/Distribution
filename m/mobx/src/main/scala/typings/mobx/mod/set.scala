package typings.mobx.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mobx.observablearrayMod.IObservableArray
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "set")
@js.native
object set extends js.Object {
  
  def apply[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = js.native
  def apply[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = js.native
  def apply[V](obj: typings.mobx.internalMod.ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = js.native
  def apply[T](obj: typings.mobx.internalMod.ObservableSet[T], value: T): js.Any = js.native
  def apply[T](obj: IObservableArray[T], index: Double, value: T): js.Any = js.native
  def apply[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K, value: V): js.Any = js.native
}
