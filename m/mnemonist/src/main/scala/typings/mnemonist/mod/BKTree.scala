package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.bkTreeMod.DistanceFunction
import typings.mnemonist.bkTreeMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "BKTree")
@js.native
class BKTree[T] protected () extends default[T] {
  // Constructor
  def this(distance: DistanceFunction[T]) = this()
}

/* static members */
@JSImport("mnemonist", "BKTree")
@js.native
object BKTree extends js.Object {
  def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): typings.mnemonist.bkTreeMod.BKTree[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I], distance: DistanceFunction[I]): typings.mnemonist.bkTreeMod.BKTree[I] = js.native
}

