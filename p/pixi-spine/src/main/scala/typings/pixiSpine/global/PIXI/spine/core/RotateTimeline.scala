package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.RotateTimeline")
@js.native
class RotateTimeline protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.RotateTimeline {
  def this(frameCount: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typings.pixiSpine.PIXI.spine.core.Event],
    alpha: Double,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend,
    direction: typings.pixiSpine.PIXI.spine.core.MixDirection
  ): Unit = js.native
  
  /* CompleteClass */
  var boneIndex: Double = js.native
  
  /* CompleteClass */
  var curves: js.Any = js.native
  
  /* CompleteClass */
  var frames: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  override def getCurvePercent(frameIndex: Double, percent: Double): Double = js.native
  
  /* CompleteClass */
  override def getCurveType(frameIndex: Double): Double = js.native
  
  /* CompleteClass */
  override def getFrameCount(): Double = js.native
  
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  
  /* CompleteClass */
  override def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  
  /* CompleteClass */
  override def setFrame(frameIndex: Double, time: Double, degrees: Double): Unit = js.native
  
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
}
object RotateTimeline {
  
  @JSGlobal("PIXI.spine.core.RotateTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.RotateTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  @scala.inline
  def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.RotateTimeline.PREV_ROTATION")
  @js.native
  def PREV_ROTATION: Double = js.native
  @scala.inline
  def PREV_ROTATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_ROTATION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.RotateTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  @scala.inline
  def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.RotateTimeline.ROTATION")
  @js.native
  def ROTATION: Double = js.native
  @scala.inline
  def ROTATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROTATION")(x.asInstanceOf[js.Any])
}
