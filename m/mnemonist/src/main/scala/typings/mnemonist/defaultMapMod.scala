package typings.mnemonist

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultMapMod {
  
  @JSImport("mnemonist/default-map", JSImport.Default)
  @js.native
  open class default[K, V] protected ()
    extends StObject
       with DefaultMap[K, V] {
    // Constructor
    def this(factory: js.Function2[/* key */ K, /* index */ Double, V]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/default-map", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def autoIncrement(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("autoIncrement")().asInstanceOf[Double]
  }
  
  @js.native
  trait DefaultMap[K, V]
    extends StObject
       with Iterable[js.Tuple2[K, V]] {
    
    // Methods
    def clear(): Unit = js.native
    
    def delete(key: K): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: Any): Unit = js.native
    
    def get(key: K): V = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_DefaultMap: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    
    def keys(): IterableIterator[K] = js.native
    
    def peek(key: K): js.UndefOr[V] = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    // Members
    var size: Double = js.native
    
    def values(): IterableIterator[V] = js.native
  }
}
