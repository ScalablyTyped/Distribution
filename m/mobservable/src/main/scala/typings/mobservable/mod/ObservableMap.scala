package typings.mobservable.mod

import typings.mobservable.observablemapMod.Entries
import typings.mobservable.observablemapMod.KeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "ObservableMap")
@js.native
class ObservableMap[V] ()
  extends typings.mobservable.observablemapMod.ObservableMap[V] {
  def this(initialData: Entries[V]) = this()
  def this(initialData: KeyValueMap[V]) = this()
  def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
  def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
}

