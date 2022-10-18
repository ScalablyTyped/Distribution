package typings.ow

import typings.ow.distPredicatesPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperatorsNotMod {
  
  @JSImport("ow/dist/operators/not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def not(predicate: Predicate[Any]): Predicate[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(predicate.asInstanceOf[js.Any]).asInstanceOf[Predicate[Any]]
}
