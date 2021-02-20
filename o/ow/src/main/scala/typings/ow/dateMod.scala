package typings.ow

import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("ow/dist/source/predicates/date", "DatePredicate")
  @js.native
  /**
    @hidden
    */
  class DatePredicate () extends Predicate[Date] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a date to be before another date.
      @param date - Minimum value.
      */
    def after(date: Date): this.type = js.native
    
    /**
      Test a date to be before another date.
      @param date - Maximum value.
      */
    def before(date: Date): this.type = js.native
  }
}
