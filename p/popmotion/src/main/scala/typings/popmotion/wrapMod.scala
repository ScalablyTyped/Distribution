package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapMod {
  
  @JSImport("popmotion/lib/utils/wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrap(min: Double, max: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
}
