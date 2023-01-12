package typings.miniprogramWxs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberConstructor extends StObject {
  
  // new(value?: any): Number;
  // (value?: any): number;
  // readonly prototype: Number;
  /** The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308. */
  val MAX_VALUE: Double
  
  /** The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324. */
  val MIN_VALUE: Double
  
  /**
    * A value that is less than the largest negative number that can be represented in JavaScript.
    * JavaScript displays NEGATIVE_INFINITY values as -infinity.
    */
  val NEGATIVE_INFINITY: Double
  
  /**
    * A value that is not a number.
    * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
    */
  val NaN: Double
  
  /**
    * A value greater than the largest number that can be represented in JavaScript.
    * JavaScript displays POSITIVE_INFINITY values as infinity.
    */
  val POSITIVE_INFINITY: Double
}
object NumberConstructor {
  
  inline def apply(
    MAX_VALUE: Double,
    MIN_VALUE: Double,
    NEGATIVE_INFINITY: Double,
    NaN: Double,
    POSITIVE_INFINITY: Double
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal(MAX_VALUE = MAX_VALUE.asInstanceOf[js.Any], MIN_VALUE = MIN_VALUE.asInstanceOf[js.Any], NEGATIVE_INFINITY = NEGATIVE_INFINITY.asInstanceOf[js.Any], NaN = NaN.asInstanceOf[js.Any], POSITIVE_INFINITY = POSITIVE_INFINITY.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberConstructor] (val x: Self) extends AnyVal {
    
    inline def setMAX_VALUE(value: Double): Self = StObject.set(x, "MAX_VALUE", value.asInstanceOf[js.Any])
    
    inline def setMIN_VALUE(value: Double): Self = StObject.set(x, "MIN_VALUE", value.asInstanceOf[js.Any])
    
    inline def setNEGATIVE_INFINITY(value: Double): Self = StObject.set(x, "NEGATIVE_INFINITY", value.asInstanceOf[js.Any])
    
    inline def setNaN(value: Double): Self = StObject.set(x, "NaN", value.asInstanceOf[js.Any])
    
    inline def setPOSITIVE_INFINITY(value: Double): Self = StObject.set(x, "POSITIVE_INFINITY", value.asInstanceOf[js.Any])
  }
}
