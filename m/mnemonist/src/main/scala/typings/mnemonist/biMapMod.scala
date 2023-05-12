package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object biMapMod {
  
  @JSImport("mnemonist/bi-map", JSImport.Default)
  @js.native
  open class default[K, V] ()
    extends StObject
       with BiMap[K, V]
  /* static members */
  object default {
    
    @JSImport("mnemonist/bi-map", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): BiMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[BiMap[I, J]]
    inline def from[I, J](iterable: StringDictionary[J]): BiMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[BiMap[I, J]]
  }
  
  @JSImport("mnemonist/bi-map", "InverseMap")
  @js.native
  open class InverseMap[K, V] ()
    extends StObject
       with Iterable[js.Tuple2[K, V]] {
    
    // Methods
    def clear(): Unit = js.native
    
    def delete(key: K): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: Any): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): Any = js.native
    
    var inverse: BiMap[V, K] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_InverseMap: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    
    def keys(): IterableIterator[K] = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    // Members
    var size: Double = js.native
    
    def values(): IterableIterator[V] = js.native
  }
  
  @js.native
  trait BiMap[K, V]
    extends StObject
       with Iterable[js.Tuple2[K, V]] {
    
    // Methods
    def clear(): Unit = js.native
    
    def delete(key: K): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: Any): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): Any = js.native
    
    var inverse: InverseMap[V, K] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_BiMap: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    
    def keys(): IterableIterator[K] = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    // Members
    var size: Double = js.native
    
    def values(): IterableIterator[V] = js.native
  }
}
