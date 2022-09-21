package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.NumberArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "CurveTimeline")
@js.native
abstract class CurveTimeline protected () extends Timeline {
  def this(frameCount: Double, bezierCount: Double, propertyIds: js.Array[String]) = this()
  
  /* protected */ var curves: NumberArrayLike = js.native
  
  /** Returns the Bezier interpolated value for the specified time.
    * @param frameIndex The index into {@link #getFrames()} for the values of the frame before <code>time</code>.
    * @param valueOffset The offset from <code>frameIndex</code> to the value this curve is used for.
    * @param i The index of the Bezier segments. See {@link #getCurveType(int)}. */
  def getBezierValue(time: Double, frameIndex: Double, valueOffset: Double, i: Double): Double = js.native
  
  /** Stores the segments for the specified Bezier curve. For timelines that modify multiple values, there may be more than
    * one curve per frame.
    * @param bezier The ordinal of this Bezier curve for this timeline, between 0 and <code>bezierCount - 1</code> (specified
    *           in the constructor), inclusive.
    * @param frame Between 0 and <code>frameCount - 1</code>, inclusive.
    * @param value The index of the value for this frame that this curve is used for.
    * @param time1 The time for the first key.
    * @param value1 The value for the first key.
    * @param cx1 The time for the first Bezier handle.
    * @param cy1 The value for the first Bezier handle.
    * @param cx2 The time of the second Bezier handle.
    * @param cy2 The value for the second Bezier handle.
    * @param time2 The time for the second key.
    * @param value2 The value for the second key. */
  def setBezier(
    bezier: Double,
    frame: Double,
    value: Double,
    time1: Double,
    value1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    time2: Double,
    value2: Double
  ): Unit = js.native
  
  /** Sets the specified key frame to linear interpolation. */
  def setLinear(frame: Double): Unit = js.native
  
  /** Sets the specified key frame to stepped interpolation. */
  def setStepped(frame: Double): Unit = js.native
  
  /** Shrinks the storage for Bezier curves, for use when <code>bezierCount</code> (specified in the constructor) was larger
    * than the actual number of Bezier curves. */
  def shrink(bezierCount: Double): Unit = js.native
}
