package typings.ow

import typings.ow.basePredicateMod.BasePredicate
import typings.ow.predicateMod.PredicateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/any", JSImport.Namespace)
@js.native
object anyMod extends js.Object {
  
  @js.native
  class AnyPredicate[T] protected () extends BasePredicate[T] {
    def this(predicates: js.Array[BasePredicate[_]]) = this()
    def this(predicates: js.Array[BasePredicate[_]], options: PredicateOptions) = this()
    
    val options: js.Any = js.native
    
    val predicates: js.Any = js.native
  }
}
