package typings.mnemonist

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitSetMod {
  
  @JSImport("mnemonist/bit-set", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BitSet {
    // Constructor
    def this(length: Double) = this()
  }
  
  @js.native
  trait BitSet
    extends StObject
       with Iterable[Double] {
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, Double]] = js.native
    
    def flip(index: Double, value: Boolean): Unit = js.native
    def flip(index: Double, value: Double): Unit = js.native
    
    def forEach(callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* index */ Double, /* value */ Double, /* set */ this.type, Unit],
      scope: Any
    ): Unit = js.native
    
    def get(index: Double): Double = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_BitSet: js.Function0[IterableIterator[Double]] = js.native
    
    // Members
    var length: Double = js.native
    
    def rank(r: Double): Double = js.native
    
    def reset(index: Double, value: Boolean): Unit = js.native
    def reset(index: Double, value: Double): Unit = js.native
    
    def select(r: Double): Double = js.native
    
    def set(index: Double): Unit = js.native
    def set(index: Double, value: Boolean): Unit = js.native
    def set(index: Double, value: Double): Unit = js.native
    
    var size: Double = js.native
    
    def test(index: Double): Boolean = js.native
    
    def toJSON(): js.Array[Double] = js.native
    
    def values(): IterableIterator[Double] = js.native
  }
}
