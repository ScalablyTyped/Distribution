package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.IkConstraintTimeline")
@js.native
class IkConstraintTimeline protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.IkConstraintTimeline {
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
  var ikConstraintIndex: Double = js.native
  
  /* CompleteClass */
  override def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  
  /* CompleteClass */
  override def setFrame(
    frameIndex: Double,
    time: Double,
    mix: Double,
    softness: Double,
    bendDirection: Double,
    compress: Boolean,
    stretch: Boolean
  ): Unit = js.native
  
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
}
object IkConstraintTimeline {
  
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.BEND_DIRECTION")
  @js.native
  def BEND_DIRECTION: Double = js.native
  inline def BEND_DIRECTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEND_DIRECTION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.COMPRESS")
  @js.native
  def COMPRESS: Double = js.native
  inline def COMPRESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPRESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.MIX")
  @js.native
  def MIX: Double = js.native
  inline def MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.PREV_BEND_DIRECTION")
  @js.native
  def PREV_BEND_DIRECTION: Double = js.native
  inline def PREV_BEND_DIRECTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_BEND_DIRECTION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.PREV_COMPRESS")
  @js.native
  def PREV_COMPRESS: Double = js.native
  inline def PREV_COMPRESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_COMPRESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.PREV_MIX")
  @js.native
  def PREV_MIX: Double = js.native
  inline def PREV_MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_MIX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.PREV_SOFTNESS")
  @js.native
  def PREV_SOFTNESS: Double = js.native
  inline def PREV_SOFTNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_SOFTNESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.PREV_STRETCH")
  @js.native
  def PREV_STRETCH: Double = js.native
  inline def PREV_STRETCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_STRETCH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.SOFTNESS")
  @js.native
  def SOFTNESS: Double = js.native
  inline def SOFTNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOFTNESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.IkConstraintTimeline.STRETCH")
  @js.native
  def STRETCH: Double = js.native
  inline def STRETCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRETCH")(x.asInstanceOf[js.Any])
}
