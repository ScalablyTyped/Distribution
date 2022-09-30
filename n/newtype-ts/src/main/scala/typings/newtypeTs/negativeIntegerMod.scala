package typings.newtypeTs

import typings.monocleTs.mod.Prism_
import typings.newtypeTs.mod.Concat
import typings.newtypeTs.nonPositiveIntegerMod.NonPositiveInteger
import typings.newtypeTs.nonZeroMod.NonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object negativeIntegerMod {
  
  @JSImport("newtype-ts/lib/NegativeInteger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNegativeInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativeInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NegativeInteger", "prismNegativeInteger")
  @js.native
  val prismNegativeInteger: Prism_[Double, NegativeInteger] = js.native
  
  type NegativeInteger = Concat[NonZero, NonPositiveInteger]
}
