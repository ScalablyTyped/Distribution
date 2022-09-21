package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.PathConstraintMixTimeline")
@js.native
open class PathConstraintMixTimeline protected ()
  extends StObject
     with typings.phaser.spine.PathConstraintMixTimeline {
  def this(frameCount: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typings.phaser.spine.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typings.phaser.spine.Event],
    alpha: Double,
    blend: typings.phaser.spine.MixBlend,
    direction: typings.phaser.spine.MixDirection
  ): Unit = js.native
  
  /* private */ /* CompleteClass */
  var curves: Any = js.native
  
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
  override def setFrame(frameIndex: Double, time: Double, rotateMix: Double, translateMix: Double): Unit = js.native
  
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
}
object PathConstraintMixTimeline {
  
  @JSGlobal("spine.PathConstraintMixTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.PathConstraintMixTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraintMixTimeline.PREV_ROTATE")
  @js.native
  def PREV_ROTATE: Double = js.native
  inline def PREV_ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_ROTATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraintMixTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraintMixTimeline.PREV_TRANSLATE")
  @js.native
  def PREV_TRANSLATE: Double = js.native
  inline def PREV_TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TRANSLATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraintMixTimeline.ROTATE")
  @js.native
  def ROTATE: Double = js.native
  inline def ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROTATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraintMixTimeline.TRANSLATE")
  @js.native
  def TRANSLATE: Double = js.native
  inline def TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSLATE")(x.asInstanceOf[js.Any])
}
