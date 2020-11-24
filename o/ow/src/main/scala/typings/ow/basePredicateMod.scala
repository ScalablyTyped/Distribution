package typings.ow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/base-predicate", JSImport.Namespace)
@js.native
object basePredicateMod extends js.Object {
  
  def isPredicate(value: js.Any): /* is ow.ow/dist/source/predicates/base-predicate.BasePredicate<unknown> */ Boolean = js.native
  
  val testSymbol: js.Symbol = js.native
  
  @js.native
  trait BasePredicate[T] extends js.Object
}
