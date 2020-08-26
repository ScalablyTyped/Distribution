package typings.mnemonist.vpTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/vp-tree", JSImport.Default)
@js.native
class default[T] protected () extends VPTree[T] {
  // Constructor
  def this(distance: DistanceFunction[T], items: Iterable[T]) = this()
}

/* static members */
@JSImport("mnemonist/vp-tree", JSImport.Default)
@js.native
object default extends js.Object {
  def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): VPTree[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I], distance: DistanceFunction[I]): VPTree[I] = js.native
}

