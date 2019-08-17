package typings.mobservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libObservablemapMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.mobservable.libInterfacesMod.IObjectChange

  type Entries[V] = js.Array[js.Tuple2[String, V]]
  type IObservableMapChange[T] = IObjectChange[T, ObservableMap[T]]
  type KeyValueMap[V] = StringDictionary[V]
}
