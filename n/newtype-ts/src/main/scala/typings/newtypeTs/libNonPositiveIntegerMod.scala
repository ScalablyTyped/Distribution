package typings.newtypeTs

import typings.monocleTs.mod.Prism_
import typings.newtypeTs.libIntegerMod.Integer
import typings.newtypeTs.libNonPositiveMod.NonPositive
import typings.newtypeTs.mod.Concat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNonPositiveIntegerMod {
  
  @JSImport("newtype-ts/lib/NonPositiveInteger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNonPositiveInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonPositiveInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NonPositiveInteger", "prismNonPositiveInteger")
  @js.native
  val prismNonPositiveInteger: Prism_[Double, NonPositiveInteger] = js.native
  
  type NonPositiveInteger = Concat[NonPositive, Integer]
}
