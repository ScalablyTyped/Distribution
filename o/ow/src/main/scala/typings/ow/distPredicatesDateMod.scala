package typings.ow

import typings.ow.distPredicatesPredicateMod.Predicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesDateMod {
  
  @JSImport("ow/dist/predicates/date", "DatePredicate")
  @js.native
  /**
    @hidden
    */
  open class DatePredicate ()
    extends Predicate[js.Date] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a date to be before another date.
      @param date - Minimum value.
      */
    def after(date: js.Date): this.type = js.native
    
    /**
      Test a date to be before another date.
      @param date - Maximum value.
      */
    def before(date: js.Date): this.type = js.native
  }
}
