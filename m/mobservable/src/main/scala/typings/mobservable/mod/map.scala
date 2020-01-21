package typings.mobservable.mod

import typings.mobservable.observablemapMod.KeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "map")
@js.native
object map extends js.Object {
  def apply[V](): typings.mobservable.observablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V]): typings.mobservable.observablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V], valueModifier: js.Function): typings.mobservable.observablemapMod.ObservableMap[V] = js.native
}

