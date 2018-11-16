package typings
package mobservableLib.mobservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "ObservableMap")
@js.native
class ObservableMap[V] ()
  extends mobservableLib.libObservablemapMod.ObservableMap[V] {
  def this(initialData: mobservableLib.libObservablemapMod.Entries[V]) = this()
  def this(initialData: mobservableLib.libObservablemapMod.KeyValueMap[V]) = this()
  def this(initialData: mobservableLib.libObservablemapMod.Entries[V], valueModeFunc: js.Function) = this()
  def this(initialData: mobservableLib.libObservablemapMod.KeyValueMap[V], valueModeFunc: js.Function) = this()
}

