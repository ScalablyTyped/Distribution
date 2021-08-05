package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.PathConstraintPositionTimeline")
@js.native
class PathConstraintPositionTimeline protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.PathConstraintPositionTimeline {
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
  
  /* private */ /* CompleteClass */
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
  var pathConstraintIndex: Double = js.native
  
  /* CompleteClass */
  override def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  
  /* CompleteClass */
  override def setFrame(frameIndex: Double, time: Double, value: Double): Unit = js.native
  
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
}
object PathConstraintPositionTimeline {
  
  @JSGlobal("PIXI.spine.core.PathConstraintPositionTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraintPositionTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraintPositionTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraintPositionTimeline.PREV_VALUE")
  @js.native
  def PREV_VALUE: Double = js.native
  inline def PREV_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_VALUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraintPositionTimeline.VALUE")
  @js.native
  def VALUE: Double = js.native
  inline def VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE")(x.asInstanceOf[js.Any])
}
