package typings.mnemonist

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseSetMod {
  
  @JSImport("mnemonist/sparse-set", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SparseSet {
    // Constructor
    def this(length: Double) = this()
  }
  
  @js.native
  trait SparseSet
    extends StObject
       with Iterable[Double] {
    
    def add(value: Double): this.type = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def delete(value: Double): Boolean = js.native
    
    def forEach(callback: js.Function3[/* value */ Double, /* key */ Double, /* set */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ Double, /* key */ Double, /* set */ this.type, Unit],
      scope: Any
    ): Unit = js.native
    
    def has(value: Double): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_SparseSet: js.Function0[IterableIterator[Double]] = js.native
    
    // Members
    var length: Double = js.native
    
    var size: Double = js.native
    
    def values(): IterableIterator[Double] = js.native
  }
}
