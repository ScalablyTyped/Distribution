package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "CurveTimeline")
@js.native
abstract class CurveTimeline protected ()
  extends StObject
     with Timeline {
  def this(frameCount: Double) = this()
  
  /** Applies this timeline to the skeleton.
    * @param skeleton The skeleton the timeline is being applied to. This provides access to the bones, slots, and other
    *           skeleton components the timeline may change.
    * @param lastTime The time this timeline was last applied. Timelines such as {@link EventTimeline}} trigger only at specific
    *           times rather than every frame. In that case, the timeline triggers everything between `lastTime`
    *           (exclusive) and `time` (inclusive).
    * @param time The time within the animation. Most timelines find the key before and the key after this time so they can
    *           interpolate between the keys.
    * @param events If any events are fired, they are added to this list. Can be null to ignore fired events or if the timeline
    *           does not fire events.
    * @param alpha 0 applies the current or setup value (depending on `blend`). 1 applies the timeline value.
    *           Between 0 and 1 applies a value between the current or setup value and the timeline value. By adjusting
    *           `alpha` over time, an animation can be mixed in or out. `alpha` can also be useful to
    *           apply animations on top of each other (layering).
    * @param blend Controls how mixing is applied when `alpha` < 1.
    * @param direction Indicates whether the timeline is mixing in or out. Used by timelines which perform instant transitions,
    *           such as {@link DrawOrderTimeline} or {@link AttachmentTimeline}. */
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event2],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  
  /* private */ var curves: Any = js.native
  
  /** Returns the interpolated percentage for the specified key frame and linear percentage. */
  def getCurvePercent(frameIndex: Double, percent: Double): Double = js.native
  
  /** Returns the interpolation type for the specified key frame.
    * @returns Linear is 0, stepped is 1, Bezier is 2. */
  def getCurveType(frameIndex: Double): Double = js.native
  
  /** The number of key frames for this timeline. */
  def getFrameCount(): Double = js.native
  
  /** Uniquely encodes both the type of this timeline and the skeleton property that it affects. */
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  
  /** Sets the specified key frame to Bezier interpolation. `cx1` and `cx2` are from 0 to 1,
    * representing the percent of time between the two key frames. `cy1` and `cy2` are the percent of the
    * difference between the key frame's values. */
  def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  
  /** Sets the specified key frame to linear interpolation. */
  def setLinear(frameIndex: Double): Unit = js.native
  
  /** Sets the specified key frame to stepped interpolation. */
  def setStepped(frameIndex: Double): Unit = js.native
}
/* static members */
object CurveTimeline {
  
  @JSImport("@pixi-spine/runtime-3.8", "CurveTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "CurveTimeline.BEZIER")
  @js.native
  def BEZIER: Double = js.native
  inline def BEZIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "CurveTimeline.BEZIER_SIZE")
  @js.native
  def BEZIER_SIZE: Double = js.native
  inline def BEZIER_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER_SIZE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "CurveTimeline.LINEAR")
  @js.native
  def LINEAR: Double = js.native
  inline def LINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "CurveTimeline.STEPPED")
  @js.native
  def STEPPED: Double = js.native
  inline def STEPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STEPPED")(x.asInstanceOf[js.Any])
}
