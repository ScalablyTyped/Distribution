package typings.ow

import typings.ow.distPredicatesBasePredicateMod.BasePredicate
import typings.ow.distPredicatesPredicateMod.PredicateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPredicatesAnyMod {
  
  @JSImport("ow/dist/predicates/any", "AnyPredicate")
  @js.native
  open class AnyPredicate[T] protected ()
    extends StObject
       with BasePredicate[T] {
    def this(predicates: js.Array[BasePredicate[Any]]) = this()
    def this(predicates: js.Array[BasePredicate[Any]], options: PredicateOptions) = this()
    
    /* private */ val options: Any = js.native
    
    /* private */ val predicates: Any = js.native
  }
}
