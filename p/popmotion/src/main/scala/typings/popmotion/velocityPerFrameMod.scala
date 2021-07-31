package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object velocityPerFrameMod {
  
  @JSImport("popmotion/lib/utils/velocity-per-frame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def velocityPerFrame(xps: Double, frameDuration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("velocityPerFrame")(xps.asInstanceOf[js.Any], frameDuration.asInstanceOf[js.Any])).asInstanceOf[Double]
}
