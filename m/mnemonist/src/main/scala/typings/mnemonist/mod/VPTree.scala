package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.vpTreeMod.DistanceFunction
import typings.mnemonist.vpTreeMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "VPTree")
@js.native
class VPTree[T] protected () extends default[T] {
  // Constructor
  def this(distance: DistanceFunction[T], items: Iterable[T]) = this()
}

/* static members */
@JSImport("mnemonist", "VPTree")
@js.native
object VPTree extends js.Object {
  def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): typings.mnemonist.vpTreeMod.VPTree[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I], distance: DistanceFunction[I]): typings.mnemonist.vpTreeMod.VPTree[I] = js.native
}

