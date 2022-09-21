package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.TransformConstraintTimeline")
@js.native
open class TransformConstraintTimeline protected ()
  extends StObject
     with typings.phaser.spine.TransformConstraintTimeline {
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
  override def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  
  /* CompleteClass */
  override def setFrame(
    frameIndex: Double,
    time: Double,
    rotateMix: Double,
    translateMix: Double,
    scaleMix: Double,
    shearMix: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  var transformConstraintIndex: Double = js.native
}
object TransformConstraintTimeline {
  
  @JSGlobal("spine.TransformConstraintTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.PREV_ROTATE")
  @js.native
  def PREV_ROTATE: Double = js.native
  inline def PREV_ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_ROTATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.PREV_SCALE")
  @js.native
  def PREV_SCALE: Double = js.native
  inline def PREV_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_SCALE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.PREV_SHEAR")
  @js.native
  def PREV_SHEAR: Double = js.native
  inline def PREV_SHEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_SHEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.PREV_TRANSLATE")
  @js.native
  def PREV_TRANSLATE: Double = js.native
  inline def PREV_TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TRANSLATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.ROTATE")
  @js.native
  def ROTATE: Double = js.native
  inline def ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROTATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.SCALE")
  @js.native
  def SCALE: Double = js.native
  inline def SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.SHEAR")
  @js.native
  def SHEAR: Double = js.native
  inline def SHEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TransformConstraintTimeline.TRANSLATE")
  @js.native
  def TRANSLATE: Double = js.native
  inline def TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSLATE")(x.asInstanceOf[js.Any])
}
