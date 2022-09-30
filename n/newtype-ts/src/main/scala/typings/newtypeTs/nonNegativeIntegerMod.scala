package typings.newtypeTs

import typings.monocleTs.mod.Prism_
import typings.newtypeTs.integerMod.Integer
import typings.newtypeTs.mod.Concat
import typings.newtypeTs.nonNegativeMod.NonNegative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonNegativeIntegerMod {
  
  @JSImport("newtype-ts/lib/NonNegativeInteger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNonNegativeInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNegativeInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NonNegativeInteger", "prismNonNegativeInteger")
  @js.native
  val prismNonNegativeInteger: Prism_[Double, NonNegativeInteger] = js.native
  
  type NonNegativeInteger = Concat[NonNegative, Integer]
}
