package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.lruMapMod.default
import typings.mnemonist.typesMod.IArrayLikeConstructor
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "LRUMap")
@js.native
class LRUMap[K, V] protected () extends default[K, V] {
  // Constructor
  def this(capacity: Double) = this()
  def this(KeyArrayClass: IArrayLikeConstructor, ValueArrayClass: IArrayLikeConstructor, capacity: Double) = this()
}

/* static members */
@JSImport("mnemonist", "LRUMap")
@js.native
object LRUMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J]): typings.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](
    iterable: StringDictionary[J],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor
  ): typings.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](
    iterable: StringDictionary[J],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor,
    capacity: Double
  ): typings.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], capacity: Double): typings.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]]): typings.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  // Statics
  def from[I, J](
    iterable: Iterable[js.Tuple2[I, J]],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor
  ): typings.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](
    iterable: Iterable[js.Tuple2[I, J]],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor,
    capacity: Double
  ): typings.mnemonist.lruMapMod.LRUMap[I, J] = js.native
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]], capacity: Double): typings.mnemonist.lruMapMod.LRUMap[I, J] = js.native
}

