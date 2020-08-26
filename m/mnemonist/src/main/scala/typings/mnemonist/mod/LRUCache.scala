package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.lruCacheMod.default
import typings.mnemonist.typesMod.IArrayLikeConstructor
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "LRUCache")
@js.native
class LRUCache[K, V] protected () extends default[K, V] {
  // Constructor
  def this(capacity: Double) = this()
  def this(KeyArrayClass: IArrayLikeConstructor, ValueArrayClass: IArrayLikeConstructor, capacity: Double) = this()
}

/* static members */
@JSImport("mnemonist", "LRUCache")
@js.native
object LRUCache extends js.Object {
  def from[I, J](iterable: StringDictionary[J]): typings.mnemonist.lruCacheMod.LRUCache[I, J] = js.native
  def from[I, J](
    iterable: StringDictionary[J],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor
  ): typings.mnemonist.lruCacheMod.LRUCache[I, J] = js.native
  def from[I, J](
    iterable: StringDictionary[J],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor,
    capacity: Double
  ): typings.mnemonist.lruCacheMod.LRUCache[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], capacity: Double): typings.mnemonist.lruCacheMod.LRUCache[I, J] = js.native
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]]): typings.mnemonist.lruCacheMod.LRUCache[I, J] = js.native
  // Statics
  def from[I, J](
    iterable: Iterable[js.Tuple2[I, J]],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor
  ): typings.mnemonist.lruCacheMod.LRUCache[I, J] = js.native
  def from[I, J](
    iterable: Iterable[js.Tuple2[I, J]],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor,
    capacity: Double
  ): typings.mnemonist.lruCacheMod.LRUCache[I, J] = js.native
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]], capacity: Double): typings.mnemonist.lruCacheMod.LRUCache[I, J] = js.native
}

