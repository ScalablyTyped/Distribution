package typings.mnemonist.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.trieMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "Trie")
@js.native
// Constructor
class Trie[T] () extends default[T] {
  def this(Token: Instantiable0[T]) = this()
}

/* static members */
@JSImport("mnemonist", "Trie")
@js.native
object Trie extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.trieMod.Trie[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.trieMod.Trie[I] = js.native
}

