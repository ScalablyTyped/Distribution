package typings.ow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePredicateMod {
  
  @JSImport("ow/dist/predicates/base-predicate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPredicate(value: Any): /* is ow.ow/dist/predicates/base-predicate.BasePredicate<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPredicate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ow.ow/dist/predicates/base-predicate.BasePredicate<unknown> */ Boolean]
  
  @JSImport("ow/dist/predicates/base-predicate", "testSymbol")
  @js.native
  val testSymbol: js.Symbol = js.native
  
  @js.native
  trait BasePredicate[T] extends StObject
}
