package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.multiMapMod.default
import typings.std.ArrayConstructor
import typings.std.Iterable
import typings.std.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "MultiMap")
@js.native
// Constructor
class MultiMap[K, V] () extends default[K, V] {
  def this(Container: ArrayConstructor) = this()
  def this(Container: SetConstructor) = this()
}

/* static members */
@JSImport("mnemonist", "MultiMap")
@js.native
object MultiMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J]): typings.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], Container: ArrayConstructor): typings.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], Container: SetConstructor): typings.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  // Statics
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]]): typings.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]], Container: ArrayConstructor): typings.mnemonist.multiMapMod.MultiMap[I, J] = js.native
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]], Container: SetConstructor): typings.mnemonist.multiMapMod.MultiMap[I, J] = js.native
}

