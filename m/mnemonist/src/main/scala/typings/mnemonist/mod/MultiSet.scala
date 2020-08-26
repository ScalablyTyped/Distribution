package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.multiSetMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "MultiSet")
@js.native
class MultiSet[K] () extends default[K]

/* static members */
@JSImport("mnemonist", "MultiSet")
@js.native
object MultiSet extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.multiSetMod.MultiSet[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.multiSetMod.MultiSet[I] = js.native
  def isSubset[T](a: typings.mnemonist.multiSetMod.MultiSet[T], b: typings.mnemonist.multiSetMod.MultiSet[T]): Boolean = js.native
  def isSuperset[T](a: typings.mnemonist.multiSetMod.MultiSet[T], b: typings.mnemonist.multiSetMod.MultiSet[T]): Boolean = js.native
}

