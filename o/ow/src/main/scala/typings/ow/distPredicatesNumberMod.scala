package typings.ow

import typings.ow.distPredicatesPredicateMod.Predicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesNumberMod {
  
  @JSImport("ow/dist/predicates/number", "NumberPredicate")
  @js.native
  /**
    @hidden
    */
  open class NumberPredicate () extends Predicate[Double] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a number to be equal to a specified number.
      @param expected - Expected value to match.
      */
    def equal(expected: Double): this.type = js.native
    
    /**
      Test a number to be finite.
      */
    def finite: this.type = js.native
    
    /**
      Test a number to be greater than the provided value.
      @param number - Minimum value.
      */
    def greaterThan(number: Double): this.type = js.native
    
    /**
      Test a number to be greater than or equal to the provided value.
      @param number - Minimum value.
      */
    def greaterThanOrEqual(number: Double): this.type = js.native
    
    /**
      Test a number to be in a specified range.
      @param start - Start of the range.
      @param end - End of the range.
      */
    def inRange(start: Double, end: Double): this.type = js.native
    
    /**
      Test a number to be infinite.
      */
    def infinite: this.type = js.native
    
    /**
      Test a number to be in a valid range for a 16-bit signed integer.
      */
    def int16: this.type = js.native
    
    /**
      Test a number to be in a valid range for a 32-bit signed integer.
      */
    def int32: this.type = js.native
    
    /**
      Test a number to be in a valid range for a 8-bit signed integer.
      */
    def int8: this.type = js.native
    
    /**
      Test a number to be an integer.
      */
    def integer: this.type = js.native
    
    /**
      Test a number to be an integer or infinite.
      */
    def integerOrInfinite: this.type = js.native
    
    /**
      Test a number to be less than the provided value.
      @param number - Maximum value.
      */
    def lessThan(number: Double): this.type = js.native
    
    /**
      Test a number to be less than or equal to the provided value.
      @param number - Minimum value.
      */
    def lessThanOrEqual(number: Double): this.type = js.native
    
    /**
      Test a number to be negative.
      */
    def negative: this.type = js.native
    
    /**
      Test if a number is an element of the provided list.
      @param list - List of possible values.
      */
    def oneOf(list: js.Array[Double]): this.type = js.native
    
    /**
      Test a number to be positive.
      */
    def positive: this.type = js.native
    
    /**
      Test a number to be in a valid range for a 16-bit unsigned integer.
      */
    def uint16: this.type = js.native
    
    /**
      Test a number to be in a valid range for a 32-bit unsigned integer.
      */
    def uint32: this.type = js.native
    
    /**
      Test a number to be in a valid range for a 8-bit unsigned integer.
      */
    def uint8: this.type = js.native
  }
}
