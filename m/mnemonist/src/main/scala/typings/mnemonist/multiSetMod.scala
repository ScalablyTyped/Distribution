package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSetMod {
  
  @JSImport("mnemonist/multi-set", JSImport.Default)
  @js.native
  open class default[K] ()
    extends StObject
       with MultiSet[K]
  /* static members */
  object default {
    
    @JSImport("mnemonist/multi-set", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I]): MultiSet[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[MultiSet[I]]
    inline def from[I](iterable: StringDictionary[I]): MultiSet[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[MultiSet[I]]
    
    inline def isSubset[T](a: MultiSet[T], b: MultiSet[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isSuperset[T](a: MultiSet[T], b: MultiSet[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuperset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @js.native
  trait MultiSet[K]
    extends StObject
       with Iterable[K] {
    
    def add(key: K): this.type = js.native
    def add(key: K, count: Double): this.type = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def count(key: K): Double = js.native
    
    def delete(key: K): Boolean = js.native
    
    // Members
    var dimension: Double = js.native
    
    def edit(a: K, b: K): this.type = js.native
    
    def forEach(callback: js.Function3[/* value */ K, /* key */ K, /* set */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ K, /* key */ K, /* set */ this.type, Unit], scope: Any): Unit = js.native
    
    def forEachMultiplicity(callback: js.Function3[/* value */ Double, /* key */ K, /* set */ this.type, Unit]): Unit = js.native
    def forEachMultiplicity(callback: js.Function3[/* value */ Double, /* key */ K, /* set */ this.type, Unit], scope: Any): Unit = js.native
    
    def frequency(key: K): Double = js.native
    
    def get(key: K): Double = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_MultiSet: js.Function0[IterableIterator[K]] = js.native
    
    def keys(): IterableIterator[K] = js.native
    
    def multiplicities(): IterableIterator[js.Tuple2[K, Double]] = js.native
    
    def multiplicity(key: K): Double = js.native
    
    def remove(key: K): Unit = js.native
    def remove(key: K, count: Double): Unit = js.native
    
    def set(key: K, count: Double): this.type = js.native
    
    var size: Double = js.native
    
    def toJSON(): Any = js.native
    
    def top(n: Double): js.Array[js.Tuple2[K, Double]] = js.native
    
    def values(): IterableIterator[K] = js.native
  }
}
