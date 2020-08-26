package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.anon.Evicted
import typings.mnemonist.typesMod.IArrayLikeConstructor
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/lru-cache", JSImport.Namespace)
@js.native
object lruCacheMod extends js.Object {
  @js.native
  trait LRUCache[K, V]
    extends Iterable[js.Tuple2[K, V]] {
    // Members
    var capacity: Double = js.native
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def entries(): Iterator[js.Tuple2[K, V], _, js.UndefOr[scala.Nothing]] = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* cache */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* cache */ this.type, Unit], scope: js.Any): Unit = js.native
    def get(key: K): js.UndefOr[V] = js.native
    def has(key: K): Boolean = js.native
    def inspect(): js.Any = js.native
    def keys(): Iterator[K, _, js.UndefOr[scala.Nothing]] = js.native
    def peek(key: K): js.UndefOr[V] = js.native
    def set(key: K, value: V): this.type = js.native
    def setpop(key: K, value: V): Evicted[K, V] = js.native
    def values(): Iterator[V, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[K, V] protected () extends LRUCache[K, V] {
    // Constructor
    def this(capacity: Double) = this()
    def this(KeyArrayClass: IArrayLikeConstructor, ValueArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I, J](iterable: StringDictionary[J]): LRUCache[I, J] = js.native
    def from[I, J](
      iterable: StringDictionary[J],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor
    ): LRUCache[I, J] = js.native
    def from[I, J](
      iterable: StringDictionary[J],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor,
      capacity: Double
    ): LRUCache[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], capacity: Double): LRUCache[I, J] = js.native
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]]): LRUCache[I, J] = js.native
    // Statics
    def from[I, J](
      iterable: Iterable[js.Tuple2[I, J]],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor
    ): LRUCache[I, J] = js.native
    def from[I, J](
      iterable: Iterable[js.Tuple2[I, J]],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor,
      capacity: Double
    ): LRUCache[I, J] = js.native
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]], capacity: Double): LRUCache[I, J] = js.native
  }
  
}

