package typings.mnemonist

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseQueueSetMod {
  
  @JSImport("mnemonist/sparse-queue-set", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SparseQueueSet {
    // Constructor
    def this(length: Double) = this()
  }
  
  @js.native
  trait SparseQueueSet
    extends StObject
       with Iterable[Double] {
    
    // Members
    var capacity: Double = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def dequeue(): js.UndefOr[Double] = js.native
    
    def enqueue(value: Double): this.type = js.native
    
    def forEach(callback: js.Function3[/* value */ Double, /* key */ Double, /* set */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ Double, /* key */ Double, /* set */ this.type, Unit],
      scope: Any
    ): Unit = js.native
    
    def has(value: Double): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_SparseQueueSet: js.Function0[IterableIterator[Double]] = js.native
    
    var size: Double = js.native
    
    var start: Double = js.native
    
    def values(): IterableIterator[Double] = js.native
  }
}
