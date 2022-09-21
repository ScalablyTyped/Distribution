package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "CurveTimeline1")
@js.native
abstract class CurveTimeline1 protected () extends CurveTimeline {
  def this(frameCount: Double, bezierCount: Double, propertyId: String) = this()
  
  /** Returns the interpolated value for the specified time. */
  def getCurveValue(time: Double): Double = js.native
  
  /** Sets the time and value for the specified frame.
    * @param frame Between 0 and <code>frameCount</code>, inclusive.
    * @param time The frame time in seconds. */
  def setFrame(frame: Double, time: Double, value: Double): Unit = js.native
}
