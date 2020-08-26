package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.biMapMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "BiMap")
@js.native
class BiMap[K, V] () extends default[K, V]

/* static members */
@JSImport("mnemonist", "BiMap")
@js.native
object BiMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J]): typings.mnemonist.biMapMod.BiMap[I, J] = js.native
  // Statics
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]]): typings.mnemonist.biMapMod.BiMap[I, J] = js.native
}

