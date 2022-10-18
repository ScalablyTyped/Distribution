package typings.newtypeTs

import typings.monocleTs.mod.Prism_
import typings.newtypeTs.libIntegerMod.Integer
import typings.newtypeTs.libNonZeroMod.NonZero
import typings.newtypeTs.mod.Concat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNonZeroIntegerMod {
  
  @JSImport("newtype-ts/lib/NonZeroInteger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNonZeroInteger(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonZeroInteger")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("newtype-ts/lib/NonZeroInteger", "prismNonZeroInteger")
  @js.native
  val prismNonZeroInteger: Prism_[Double, NonZeroInteger] = js.native
  
  type NonZeroInteger = Concat[NonZero, Integer]
}
