package typings.minimalBitArray

import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimal-bit-array", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with BitArray {
    def this(length: Double) = this()
    
    /* CompleteClass */
    var bits: Uint32Array = js.native
    
    /* CompleteClass */
    override def get(index: Double): Boolean = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    override def set(index: Double, value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def toJSON(): BitArrayJSON = js.native
  }
  @JSImport("minimal-bit-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromJSON(bitArrayJSON: BitArrayJSON): BitArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(bitArrayJSON.asInstanceOf[js.Any]).asInstanceOf[BitArray]
  
  trait BitArray extends StObject {
    
    var bits: Uint32Array
    
    def get(index: Double): Boolean
    
    var length: Double
    
    def set(index: Double, value: js.Any): Boolean
    
    def toJSON(): BitArrayJSON
  }
  object BitArray {
    
    inline def apply(
      bits: Uint32Array,
      get: Double => Boolean,
      length: Double,
      set: (Double, js.Any) => Boolean,
      toJSON: () => BitArrayJSON
    ): BitArray = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[BitArray]
    }
    
    extension [Self <: BitArray](x: Self) {
      
      inline def setBits(value: Uint32Array): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setGet(value: Double => Boolean): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (Double, js.Any) => Boolean): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setToJSON(value: () => BitArrayJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait BitArrayJSON extends StObject {
    
    var bits: js.Array[Double]
    
    var length: Double
  }
  object BitArrayJSON {
    
    inline def apply(bits: js.Array[Double], length: Double): BitArrayJSON = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitArrayJSON]
    }
    
    extension [Self <: BitArrayJSON](x: Self) {
      
      inline def setBits(value: js.Array[Double]): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsVarargs(value: Double*): Self = StObject.set(x, "bits", js.Array(value :_*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
