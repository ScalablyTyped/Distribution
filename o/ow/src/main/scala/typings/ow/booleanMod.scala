package typings.ow

import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/boolean", JSImport.Namespace)
@js.native
object booleanMod extends js.Object {
  
  @js.native
  /**
    @hidden
    */
  class BooleanPredicate () extends Predicate[Boolean] {
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
