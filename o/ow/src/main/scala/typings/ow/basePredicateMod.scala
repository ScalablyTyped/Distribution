package typings.ow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePredicateMod {
  
  @JSImport("ow/dist/source/predicates/base-predicate", "isPredicate")
  @js.native
  def isPredicate(value: js.Any): /* is ow.ow/dist/source/predicates/base-predicate.BasePredicate<unknown> */ Boolean = js.native
  
  @JSImport("ow/dist/source/predicates/base-predicate", "testSymbol")
  @js.native
  val testSymbol: js.Symbol = js.native
  
  @js.native
  trait BasePredicate[T] extends StObject
}
