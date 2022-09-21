package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.typesMod.IArrayLikeConstructor
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorMod {
  
  @JSImport("mnemonist/vector", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Vector {
    // Constructor
    def this(ArrayClass: IArrayLikeConstructor, length: Double) = this()
    def this(ArrayClass: IArrayLikeConstructor, length: VectorOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/vector", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[Vector]
  }
  
  @JSImport("mnemonist/vector", "Float32Vector")
  @js.native
  open class Float32Vector ()
    extends StObject
       with TypedVector
  
  @JSImport("mnemonist/vector", "Float64Array")
  @js.native
  open class Float64Array ()
    extends StObject
       with TypedVector
  
  @JSImport("mnemonist/vector", "Int16Vector")
  @js.native
  open class Int16Vector ()
    extends StObject
       with TypedVector
  
  @JSImport("mnemonist/vector", "Int32Vector")
  @js.native
  open class Int32Vector ()
    extends StObject
       with TypedVector
  
  @JSImport("mnemonist/vector", "Int8Vector")
  @js.native
  open class Int8Vector ()
    extends StObject
       with TypedVector
  
  @JSImport("mnemonist/vector", "Uint16Vector")
  @js.native
  open class Uint16Vector ()
    extends StObject
       with TypedVector
  
  @JSImport("mnemonist/vector", "Uint32Vector")
  @js.native
  open class Uint32Vector ()
    extends StObject
       with TypedVector
  
  @JSImport("mnemonist/vector", "Uint8ClampedVector")
  @js.native
  open class Uint8ClampedVector ()
    extends StObject
       with TypedVector
  
  @JSImport("mnemonist/vector", "Uint8Vector")
  @js.native
  open class Uint8Vector ()
    extends StObject
       with TypedVector
  
  @js.native
  trait TypedVector
    extends StObject
       with Iterable[Double] {
    
    // Members
    var capacity: Double = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, Double]] = js.native
    
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
    var iterator_TypedVector: js.Function0[IterableIterator[Double]] = js.native
    
    var length: Double = js.native
    
    def pop(): js.UndefOr[Double] = js.native
    
    def push(value: Double): Double = js.native
    
    def reallocate(capacity: Double): this.type = js.native
    
    def resize(length: Double): this.type = js.native
    
    def set(index: Double, value: Double): this.type = js.native
    
    var size: Double = js.native
    
    def toJSON(): Any = js.native
    
    def values(): IterableIterator[Double] = js.native
  }
  
  @js.native
  trait Vector
    extends StObject
       with Iterable[Double] {
    
    // Members
    var capacity: Double = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, Double]] = js.native
    
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
    var iterator_Vector: js.Function0[IterableIterator[Double]] = js.native
    
    var length: Double = js.native
    
    def pop(): js.UndefOr[Double] = js.native
    
    def push(value: Double): Double = js.native
    
    def reallocate(capacity: Double): this.type = js.native
    
    def resize(length: Double): this.type = js.native
    
    def set(index: Double, value: Double): this.type = js.native
    
    var size: Double = js.native
    
    def toJSON(): Any = js.native
    
    def values(): IterableIterator[Double] = js.native
  }
  
  trait VectorOptions extends StObject {
    
    var initialCapacity: js.UndefOr[Double] = js.undefined
    
    var initialLength: js.UndefOr[Double] = js.undefined
    
    var policy: js.UndefOr[js.Function1[/* capacity */ Double, Double]] = js.undefined
  }
  object VectorOptions {
    
    inline def apply(): VectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VectorOptions]
    }
    
    extension [Self <: VectorOptions](x: Self) {
      
      inline def setInitialCapacity(value: Double): Self = StObject.set(x, "initialCapacity", value.asInstanceOf[js.Any])
      
      inline def setInitialCapacityUndefined: Self = StObject.set(x, "initialCapacity", js.undefined)
      
      inline def setInitialLength(value: Double): Self = StObject.set(x, "initialLength", value.asInstanceOf[js.Any])
      
      inline def setInitialLengthUndefined: Self = StObject.set(x, "initialLength", js.undefined)
      
      inline def setPolicy(value: /* capacity */ Double => Double): Self = StObject.set(x, "policy", js.Any.fromFunction1(value))
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
