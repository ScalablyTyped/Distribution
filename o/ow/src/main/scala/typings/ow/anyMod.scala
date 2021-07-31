package typings.ow

import typings.ow.basePredicateMod.BasePredicate
import typings.ow.predicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyMod {
  
  @JSImport("ow/dist/source/predicates/any", "AnyPredicate")
  @js.native
  class AnyPredicate[T] protected ()
    extends StObject
       with BasePredicate[T] {
    def this(predicates: js.Array[BasePredicate[js.Any]]) = this()
    def this(predicates: js.Array[BasePredicate[js.Any]], options: PredicateOptions) = this()
    
    val options: js.Any = js.native
    
    val predicates: js.Any = js.native
  }
}
