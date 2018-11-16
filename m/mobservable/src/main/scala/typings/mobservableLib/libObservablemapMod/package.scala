package typings
package mobservableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libObservablemapMod {
  type Entries[V] = js.Array[js.Tuple2[java.lang.String, V]]
  type IObservableMapChange[T] = mobservableLib.libInterfacesMod.IObjectChange[T, ObservableMap[T]]
}
