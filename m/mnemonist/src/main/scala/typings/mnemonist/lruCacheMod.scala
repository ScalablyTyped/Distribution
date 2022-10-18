package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.anon.Evicted
import typings.mnemonist.utilsTypesMod.IArrayLikeConstructor
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lruCacheMod {
  
  @JSImport("mnemonist/lru-cache", JSImport.Default)
  @js.native
  open class default[K, V] protected ()
    extends StObject
       with LRUCache[K, V] {
    // Constructor
    def this(capacity: Double) = this()
    def this(KeyArrayClass: IArrayLikeConstructor, ValueArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/lru-cache", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): LRUCache[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[LRUCache[I, J]]
    // Statics
    inline def from[I, J](
      iterable: js.Iterable[js.Tuple2[I, J]],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor
    ): LRUCache[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], KeyArrayClass.asInstanceOf[js.Any], ValueArrayClass.asInstanceOf[js.Any])).asInstanceOf[LRUCache[I, J]]
    inline def from[I, J](
      iterable: js.Iterable[js.Tuple2[I, J]],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor,
      capacity: Double
    ): LRUCache[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], KeyArrayClass.asInstanceOf[js.Any], ValueArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[LRUCache[I, J]]
    inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], capacity: Double): LRUCache[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[LRUCache[I, J]]
    inline def from[I, J](iterable: StringDictionary[J]): LRUCache[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[LRUCache[I, J]]
    inline def from[I, J](
      iterable: StringDictionary[J],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor
    ): LRUCache[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], KeyArrayClass.asInstanceOf[js.Any], ValueArrayClass.asInstanceOf[js.Any])).asInstanceOf[LRUCache[I, J]]
    inline def from[I, J](
      iterable: StringDictionary[J],
      KeyArrayClass: IArrayLikeConstructor,
      ValueArrayClass: IArrayLikeConstructor,
      capacity: Double
    ): LRUCache[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], KeyArrayClass.asInstanceOf[js.Any], ValueArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[LRUCache[I, J]]
    inline def from[I, J](iterable: StringDictionary[J], capacity: Double): LRUCache[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[LRUCache[I, J]]
  }
  
  @js.native
  trait LRUCache[K, V]
    extends StObject
       with Iterable[js.Tuple2[K, V]] {
    
    // Members
    var capacity: Double = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* cache */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* cache */ this.type, Unit], scope: Any): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_LRUCache: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    
    def keys(): IterableIterator[K] = js.native
    
    def peek(key: K): js.UndefOr[V] = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    def setpop(key: K, value: V): Evicted[K, V] = js.native
    
    var size: Double = js.native
    
    def values(): IterableIterator[V] = js.native
  }
}
