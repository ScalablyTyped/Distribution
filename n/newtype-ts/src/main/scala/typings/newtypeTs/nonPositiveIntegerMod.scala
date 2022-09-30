package typings.newtypeTs

import typings.monocleTs.mod.Prism_
import typings.newtypeTs.integerMod.Integer
import typings.newtypeTs.mod.Concat
import typings.newtypeTs.nonPositiveMod.NonPositive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonPositiveIntegerMod {
  
  @JSImport("newtype-ts/lib/NonPositiveInteger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNonPositiveInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonPositiveInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NonPositiveInteger", "prismNonPositiveInteger")
  @js.native
  val prismNonPositiveInteger: Prism_[Double, NonPositiveInteger] = js.native
  
  type NonPositiveInteger = Concat[NonPositive, Integer]
}
