package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline")
@js.native
open class TransformConstraintTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  var frames: ArrayLike2[Double] = js.native
  
  /** Sets the time and mixes of the specified keyframe. */
  def setFrame(
    frameIndex: Double,
    time: Double,
    rotateMix: Double,
    translateMix: Double,
    scaleMix: Double,
    shearMix: Double
  ): Unit = js.native
  
  var transformConstraintIndex: Double = js.native
}
/* static members */
object TransformConstraintTimeline {
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.PREV_ROTATE")
  @js.native
  def PREV_ROTATE: Double = js.native
  inline def PREV_ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_ROTATE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.PREV_SCALE")
  @js.native
  def PREV_SCALE: Double = js.native
  inline def PREV_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_SCALE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.PREV_SHEAR")
  @js.native
  def PREV_SHEAR: Double = js.native
  inline def PREV_SHEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_SHEAR")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.PREV_TRANSLATE")
  @js.native
  def PREV_TRANSLATE: Double = js.native
  inline def PREV_TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TRANSLATE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.ROTATE")
  @js.native
  def ROTATE: Double = js.native
  inline def ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROTATE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.SCALE")
  @js.native
  def SCALE: Double = js.native
  inline def SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.SHEAR")
  @js.native
  def SHEAR: Double = js.native
  inline def SHEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHEAR")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TransformConstraintTimeline.TRANSLATE")
  @js.native
  def TRANSLATE: Double = js.native
  inline def TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSLATE")(x.asInstanceOf[js.Any])
}
