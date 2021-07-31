package typings.popmotionPopcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smoothFrameMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/smooth-frame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prevValue: Double, nextValue: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prevValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def default(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prevValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], smoothing.asInstanceOf[js.Any])).asInstanceOf[Double]
}
