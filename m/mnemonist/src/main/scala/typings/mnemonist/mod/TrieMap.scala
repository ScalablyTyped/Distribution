package typings.mnemonist.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.trieMapMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "TrieMap")
@js.native
// Constructor
class TrieMap[K, V] () extends default[K, V] {
  def this(Token: Instantiable0[K]) = this()
}

/* static members */
@JSImport("mnemonist", "TrieMap")
@js.native
object TrieMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J]): typings.mnemonist.trieMapMod.TrieMap[I, J] = js.native
  // Statics
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]]): typings.mnemonist.trieMapMod.TrieMap[I, J] = js.native
}

