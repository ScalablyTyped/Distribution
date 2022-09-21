package typings.mnemonist

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitVectorMod {
  
  @JSImport("mnemonist/bit-vector", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BitVector {
    // Constructor
    def this(length: Double) = this()
    def this(options: BitVectorOptions) = this()
  }
  
  @js.native
  trait BitVector
    extends StObject
       with Iterable[Double] {
    
    // Members
    var capacity: Double = js.native
    
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
    
    def grow(): this.type = js.native
    def grow(capacity: Double): this.type = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_BitVector: js.Function0[IterableIterator[Double]] = js.native
    
    var length: Double = js.native
    
    def pop(): js.UndefOr[Double] = js.native
    
    def push(value: Boolean): Double = js.native
    def push(value: Double): Double = js.native
    
    def rank(r: Double): Double = js.native
    
    def reallocate(capacity: Double): this.type = js.native
    
    def reset(index: Double, value: Boolean): Unit = js.native
    def reset(index: Double, value: Double): Unit = js.native
    
    def resize(length: Double): this.type = js.native
    
    def select(r: Double): Double = js.native
    
    def set(index: Double): this.type = js.native
    def set(index: Double, value: Boolean): this.type = js.native
    def set(index: Double, value: Double): this.type = js.native
    
    var size: Double = js.native
    
    def test(index: Double): Boolean = js.native
    
    def toJSON(): js.Array[Double] = js.native
    
    def values(): IterableIterator[Double] = js.native
  }
  
  trait BitVectorOptions extends StObject {
    
    var initialCapacity: js.UndefOr[Double] = js.undefined
    
    var initialLength: js.UndefOr[Double] = js.undefined
    
    var policy: js.UndefOr[js.Function1[/* capacity */ Double, Double]] = js.undefined
  }
  object BitVectorOptions {
    
    inline def apply(): BitVectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BitVectorOptions]
    }
    
    extension [Self <: BitVectorOptions](x: Self) {
      
      inline def setInitialCapacity(value: Double): Self = StObject.set(x, "initialCapacity", value.asInstanceOf[js.Any])
      
      inline def setInitialCapacityUndefined: Self = StObject.set(x, "initialCapacity", js.undefined)
      
      inline def setInitialLength(value: Double): Self = StObject.set(x, "initialLength", value.asInstanceOf[js.Any])
      
      inline def setInitialLengthUndefined: Self = StObject.set(x, "initialLength", js.undefined)
      
      inline def setPolicy(value: /* capacity */ Double => Double): Self = StObject.set(x, "policy", js.Any.fromFunction1(value))
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
