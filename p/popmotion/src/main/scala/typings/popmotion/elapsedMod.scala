package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elapsedMod {
  
  @JSImport("popmotion/lib/animations/utils/elapsed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasRepeatDelayElapsed(elapsed: Double, duration: Double, delay: Double, isForwardPlayback: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasRepeatDelayElapsed")(elapsed.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], isForwardPlayback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def loopElapsed(elapsed: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loopElapsed")(elapsed.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def loopElapsed(elapsed: Double, duration: Double, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loopElapsed")(elapsed.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reverseElapsed(elapsed: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseElapsed")(elapsed.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def reverseElapsed(elapsed: Double, duration: Double, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseElapsed")(elapsed.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def reverseElapsed(elapsed: Double, duration: Double, delay: Double, isForwardPlayback: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseElapsed")(elapsed.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], isForwardPlayback.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def reverseElapsed(elapsed: Double, duration: Double, delay: Unit, isForwardPlayback: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseElapsed")(elapsed.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], isForwardPlayback.asInstanceOf[js.Any])).asInstanceOf[Double]
}
