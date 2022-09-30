package typings.newtypeTs

import typings.monocleTs.mod.Prism_
import typings.newtypeTs.mod.Concat
import typings.newtypeTs.nonPositiveMod.NonPositive
import typings.newtypeTs.nonZeroMod.NonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object negativeMod {
  
  @JSImport("newtype-ts/lib/Negative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNegative(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegative")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/Negative", "prismNegative")
  @js.native
  val prismNegative: Prism_[Double, Negative] = js.native
  
  type Negative = Concat[NonZero, NonPositive]
}
