package typings.mnemonist

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/trie-map", JSImport.Namespace)
@js.native
object trieMapMod extends js.Object {
  @js.native
  trait TrieMap[K, V]
    extends Iterable[js.Tuple2[K, V]] {
    // Members
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def delete(prefix: K): Boolean = js.native
    def entries(): Iterator[js.Tuple2[K, V], _, js.UndefOr[scala.Nothing]] = js.native
    def find(prefix: K): js.Array[js.Tuple2[K, V]] = js.native
    def get(prefix: K): V = js.native
    def has(prefix: K): Boolean = js.native
    def inspect(): js.Any = js.native
    def keys(): Iterator[K, _, js.UndefOr[scala.Nothing]] = js.native
    def prefixes(): Iterator[K, _, js.UndefOr[scala.Nothing]] = js.native
    def set(prefix: K, value: V): this.type = js.native
    def values(): Iterator[V, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  // Constructor
  class default[K, V] () extends TrieMap[K, V] {
    def this(Token: Instantiable0[K]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I, J](iterable: StringDictionary[J]): TrieMap[I, J] = js.native
    // Statics
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]]): TrieMap[I, J] = js.native
  }
  
}

