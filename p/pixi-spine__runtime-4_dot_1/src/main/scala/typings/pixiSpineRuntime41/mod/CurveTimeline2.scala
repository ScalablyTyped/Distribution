package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "CurveTimeline2")
@js.native
abstract class CurveTimeline2 protected () extends CurveTimeline {
  /** @param bezierCount The maximum number of Bezier curves. See {@link #shrink(int)}.
    * @param propertyIds Unique identifiers for the properties the timeline modifies. */
  def this(frameCount: Double, bezierCount: Double, propertyId1: String, propertyId2: String) = this()
  
  /** Sets the time and values for the specified frame.
    * @param frame Between 0 and <code>frameCount</code>, inclusive.
    * @param time The frame time in seconds. */
  def setFrame(frame: Double, time: Double, value1: Double, value2: Double): Unit = js.native
}
