package typings.mobservable.mobservableMod

import typings.mobservable.libObservablemapMod.Entries
import typings.mobservable.libObservablemapMod.KeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "ObservableMap")
@js.native
class ObservableMap[V] ()
  extends typings.mobservable.libObservablemapMod.ObservableMap[V] {
  def this(initialData: Entries[V]) = this()
  def this(initialData: KeyValueMap[V]) = this()
  def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
  def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
}

