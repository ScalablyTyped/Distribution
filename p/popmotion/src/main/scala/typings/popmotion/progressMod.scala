package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("popmotion/lib/utils/progress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def progress(from: Double, to: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
}
