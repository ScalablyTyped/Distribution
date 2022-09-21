package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "CurveTimeline")
@js.native
abstract class CurveTimeline protected ()
  extends StObject
     with Timeline {
  def this(frameCount: Double) = this()
  
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
  
  def getCurvePercent(frameIndex: Double, percent: Double): Double = js.native
  
  def getCurveType(frameIndex: Double): Double = js.native
  
  def getFrameCount(): Double = js.native
  
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  
  /** Sets the control handle positions for an interpolation bezier curve used to transition from this keyframe to the next.
    * cx1 and cx2 are from 0 to 1, representing the percent of time between the two keyframes. cy1 and cy2 are the percent of
    * the difference between the keyframe's values. */
  def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  
  def setLinear(frameIndex: Double): Unit = js.native
  
  def setStepped(frameIndex: Double): Unit = js.native
}
/* static members */
object CurveTimeline {
  
  @JSImport("@pixi-spine/runtime-3.7", "CurveTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.7", "CurveTimeline.BEZIER")
  @js.native
  def BEZIER: Double = js.native
  inline def BEZIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "CurveTimeline.BEZIER_SIZE")
  @js.native
  def BEZIER_SIZE: Double = js.native
  inline def BEZIER_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER_SIZE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "CurveTimeline.LINEAR")
  @js.native
  def LINEAR: Double = js.native
  inline def LINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "CurveTimeline.STEPPED")
  @js.native
  def STEPPED: Double = js.native
  inline def STEPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STEPPED")(x.asInstanceOf[js.Any])
}
