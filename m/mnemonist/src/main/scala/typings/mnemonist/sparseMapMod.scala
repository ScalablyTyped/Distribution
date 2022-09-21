package typings.mnemonist

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseMapMod {
  
  @JSImport("mnemonist/sparse-map", JSImport.Default)
  @js.native
  open class default[V] protected ()
    extends StObject
       with SparseMap[V] {
    // Constructor
    def this(length: Double) = this()
  }
  
  @js.native
  trait SparseMap[V]
    extends StObject
       with Iterable[js.Tuple2[Double, V]] {
    
    // Methods
    def clear(): Unit = js.native
    
    def delete(key: Double): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, V]] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ Double, /* set */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ Double, /* set */ this.type, Unit], scope: Any): Unit = js.native
    
    def get(key: Double): js.UndefOr[V] = js.native
    
    def has(key: Double): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_SparseMap: js.Function0[IterableIterator[js.Tuple2[Double, V]]] = js.native
    
    def keys(): IterableIterator[Double] = js.native
    
    // Members
    var length: Double = js.native
    
    def set(key: Double, value: V): this.type = js.native
    
    var size: Double = js.native
    
    def values(): IterableIterator[V] = js.native
  }
}
