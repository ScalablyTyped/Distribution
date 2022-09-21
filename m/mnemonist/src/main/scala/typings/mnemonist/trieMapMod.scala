package typings.mnemonist

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trieMapMod {
  
  @JSImport("mnemonist/trie-map", JSImport.Default)
  @js.native
  // Constructor
  open class default[K, V] ()
    extends StObject
       with TrieMap[K, V] {
    def this(Token: Instantiable0[K]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/trie-map", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): TrieMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[TrieMap[I, J]]
    inline def from[I, J](iterable: StringDictionary[J]): TrieMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[TrieMap[I, J]]
  }
  
  @js.native
  trait TrieMap[K, V]
    extends StObject
       with Iterable[js.Tuple2[K, V]] {
    
    // Methods
    def clear(): Unit = js.native
    
    def delete(prefix: K): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
    
    def find(prefix: K): js.Array[js.Tuple2[K, V]] = js.native
    
    def get(prefix: K): V = js.native
    
    def has(prefix: K): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_TrieMap: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    
    def keys(): IterableIterator[K] = js.native
    
    def prefixes(): IterableIterator[K] = js.native
    
    def set(prefix: K, value: V): this.type = js.native
    
    // Members
    var size: Double = js.native
    
    def update(prefix: K, updateFunction: js.Function1[/* oldValue */ js.UndefOr[V], V]): this.type = js.native
    
    def values(): IterableIterator[V] = js.native
  }
}
