package typings.mnemonist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suffixArrayMod {
  
  @JSImport("mnemonist/suffix-array", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SuffixArray {
    // Constructor
    def this(string: String) = this()
    def this(string: js.Array[String]) = this()
    
    // Members
    /* CompleteClass */
    var array: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var string: String | js.Array[String] = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Array[Double] = js.native
  }
  
  @JSImport("mnemonist/suffix-array", "GeneralizedSuffixArray")
  @js.native
  open class GeneralizedSuffixArray protected () extends StObject {
    // Constructor
    def this(strings: js.Array[js.Array[String] | String]) = this()
    
    // Members
    var array: js.Array[Double] = js.native
    
    def inspect(): Any = js.native
    
    var length: Double = js.native
    
    // Methods
    def longestCommonSubsequence(): String | js.Array[String] = js.native
    
    var size: Double = js.native
    
    var text: String | js.Array[String] = js.native
    
    def toJSON(): js.Array[Double] = js.native
  }
  
  trait SuffixArray extends StObject {
    
    // Members
    var array: js.Array[Double]
    
    def inspect(): Any
    
    var length: Double
    
    var string: String | js.Array[String]
    
    def toJSON(): js.Array[Double]
  }
  object SuffixArray {
    
    inline def apply(
      array: js.Array[Double],
      inspect: () => Any,
      length: Double,
      string: String | js.Array[String],
      toJSON: () => js.Array[Double]
    ): SuffixArray = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[SuffixArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuffixArray] (val x: Self) extends AnyVal {
      
      inline def setArray(value: js.Array[Double]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayVarargs(value: Double*): Self = StObject.set(x, "array", js.Array(value*))
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setString(value: String | js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value*))
      
      inline def setToJSON(value: () => js.Array[Double]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
