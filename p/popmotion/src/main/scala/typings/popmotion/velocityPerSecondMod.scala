package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object velocityPerSecondMod {
  
  @JSImport("popmotion/lib/utils/velocity-per-second", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def velocityPerSecond(velocity: Double, frameDuration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("velocityPerSecond")(velocity.asInstanceOf[js.Any], frameDuration.asInstanceOf[js.Any])).asInstanceOf[Double]
}
