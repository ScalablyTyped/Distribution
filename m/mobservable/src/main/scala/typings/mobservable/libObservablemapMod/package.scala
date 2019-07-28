package typings.mobservable

import org.scalablytyped.runtime.StringDictionary
import typings.mobservable.libInterfacesMod.IObjectChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libObservablemapMod {
  type Entries[V] = js.Array[js.Tuple2[String, V]]
  type IObservableMapChange[T] = IObjectChange[T, ObservableMap[T]]
  type KeyValueMap[V] = StringDictionary[V]
}
