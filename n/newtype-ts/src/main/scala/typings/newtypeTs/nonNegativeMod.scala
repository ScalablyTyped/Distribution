package typings.newtypeTs

import typings.monocleTs.mod.Prism_
import typings.newtypeTs.mod.Newtype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonNegativeMod {
  
  @JSImport("newtype-ts/lib/NonNegative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNonNegative(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNegative")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NonNegative", "prismNonNegative")
  @js.native
  val prismNonNegative: Prism_[Double, NonNegative] = js.native
  
  type NonNegative = Newtype[typings.newtypeTs.anon.NonNegative, Double]
}
