package typings.monthDays

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("month-days", JSImport.Namespace)
  @js.native
  def apply(): Double = js.native
  @JSImport("month-days", JSImport.Namespace)
  @js.native
  def apply(options: Options): Double = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Note that the month is zero-index to be consistent with the native date methods.
    		@default (new Date()).getUTCMonth()
    		*/
    val month: js.UndefOr[Double] = js.native
    
    /**
    		@default (new Date).getUTCFullYear()
    		*/
    val year: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
}
