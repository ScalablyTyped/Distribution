package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/animations/utils/elapsed", JSImport.Namespace)
@js.native
object elapsedMod extends js.Object {
  
  def hasRepeatDelayElapsed(elapsed: Double, duration: Double, delay: Double, isForwardPlayback: Boolean): Boolean = js.native
  
  def loopElapsed(elapsed: Double, duration: Double): Double = js.native
  def loopElapsed(elapsed: Double, duration: Double, delay: Double): Double = js.native
  
  def reverseElapsed(elapsed: Double, duration: Double): Double = js.native
  def reverseElapsed(elapsed: Double, duration: Double, delay: js.UndefOr[scala.Nothing], isForwardPlayback: Boolean): Double = js.native
  def reverseElapsed(elapsed: Double, duration: Double, delay: Double): Double = js.native
  def reverseElapsed(elapsed: Double, duration: Double, delay: Double, isForwardPlayback: Boolean): Double = js.native
}
