package typings.newtypeTs

import typings.monocleTs.mod.Prism_
import typings.newtypeTs.libNonNegativeMod.NonNegative
import typings.newtypeTs.libNonZeroMod.NonZero
import typings.newtypeTs.mod.Concat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPositiveMod {
  
  @JSImport("newtype-ts/lib/Positive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPositive(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositive")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/Positive", "prismPositive")
  @js.native
  val prismPositive: Prism_[Double, Positive] = js.native
  
  type Positive = Concat[NonZero, NonNegative]
}
