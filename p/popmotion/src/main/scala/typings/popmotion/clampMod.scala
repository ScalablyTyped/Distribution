package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clampMod {
  
  @JSImport("popmotion/lib/utils/clamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clamp(min: Double, max: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
}
