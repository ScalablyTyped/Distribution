package typings.mobservable.mobservableMod

import typings.mobservable.libObservablemapMod.KeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "map")
@js.native
object map extends js.Object {
  def apply[V](): typings.mobservable.libObservablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V]): typings.mobservable.libObservablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V], valueModifier: js.Function): typings.mobservable.libObservablemapMod.ObservableMap[V] = js.native
}

