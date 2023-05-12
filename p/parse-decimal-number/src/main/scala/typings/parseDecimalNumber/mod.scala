package typings.parseDecimalNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(/**
    * A string that is supposed to contain a number.
    */
  string: String): Double = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(
    /**
    * A string that is supposed to contain a number.
    */
  string: String,
    /**
    * A string, array or hash with thousands and decimal separators.
    */
  options: Unit,
    /**
    * A boolean indicating whether to support that individual groups between the thousands
    * character are exactly 3 digits.
    */
  enforceGroupSize: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any], enforceGroupSize.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(
    /**
    * A string that is supposed to contain a number.
    */
  string: String,
    /**
    * A string, array or hash with thousands and decimal separators.
    */
  options: Options
  ): Double = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(
    /**
    * A string that is supposed to contain a number.
    */
  string: String,
    /**
    * A string, array or hash with thousands and decimal separators.
    */
  options: Options,
    /**
    * A boolean indicating whether to support that individual groups between the thousands
    * character are exactly 3 digits.
    */
  enforceGroupSize: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any], enforceGroupSize.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("parse-decimal-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Has the same effect as `parseDecimalNumber.setOptions({ thousands: ",", decimal: "." })`.
    */
  inline def factoryReset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("factoryReset")().asInstanceOf[Unit]
  
  /**
    * Set the default thousands and decimal characters that are used when no options are passed to
    * {@link parseDecimalNumber}.
    */
  inline def setOptions(hash: HashOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(hash.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns a function that will take a string as an argument and return a float or `NaN`,
    * just like {@link parseDecimalNumber}.
    */
  inline def withOptions(options: Options): js.Function1[/* string */ String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* string */ String, Double]]
  inline def withOptions(options: Options, enforceGroupSize: Boolean): js.Function1[/* string */ String, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")(options.asInstanceOf[js.Any], enforceGroupSize.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* string */ String, Double]]
  
  type ArrayOptions = js.Tuple2[/* thousands */ String, /* decimal */ String]
  
  trait HashOptions extends StObject {
    
    /**
      * Decimal point character.
      * Default: ".".
      */
    var decimal: String
    
    /**
      * Thousands separator character.
      * Default: ",".
      */
    var thousands: String
  }
  object HashOptions {
    
    inline def apply(decimal: String, thousands: String): HashOptions = {
      val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashOptions] (val x: Self) extends AnyVal {
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = ArrayOptions | HashOptions | String
}
