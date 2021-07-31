package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixMod {
  
  @JSImport("popmotion/lib/utils/mix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mix(from: Double, to: Double, progress: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[Double]
}
