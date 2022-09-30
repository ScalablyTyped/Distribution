package typings.ow

import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod {
  
  @JSImport("ow/dist/predicates/boolean", "BooleanPredicate")
  @js.native
  /**
    @hidden
    */
  open class BooleanPredicate () extends Predicate[Boolean] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test a boolean to be false.
      */
    def `false`: this.type = js.native
    
    /**
      Test a boolean to be true.
      */
    def `true`: this.type = js.native
  }
}
