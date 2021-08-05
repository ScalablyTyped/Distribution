package typings.monthDays

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get the number of days in a month.
  @example
  ```
  import monthDays = require('month-days');
  monthDays({month: 1, year: 2016});
  //=> 29
  ```
  */
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  inline def apply(options: Options): Double = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("month-days", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Note that the month is zero-index to be consistent with the native date methods.
    		@default (new Date()).getUTCMonth()
    		*/
    val month: js.UndefOr[Double] = js.undefined
    
    /**
    		@default (new Date).getUTCFullYear()
    		*/
    val year: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
}
