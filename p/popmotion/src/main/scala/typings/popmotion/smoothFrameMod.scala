package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smoothFrameMod {
  
  @JSImport("popmotion/lib/utils/smooth-frame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothFrame")(prevValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothFrame")(prevValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], smoothing.asInstanceOf[js.Any])).asInstanceOf[Double]
}
