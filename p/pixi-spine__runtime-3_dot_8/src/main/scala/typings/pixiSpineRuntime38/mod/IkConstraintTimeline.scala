package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline")
@js.native
open class IkConstraintTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  /** The time in seconds, mix, softness, bend direction, compress, and stretch for each key frame. */
  var frames: ArrayLike2[Double] = js.native
  
  /** The index of the IK constraint slot in {@link Skeleton#ikConstraints} that will be changed. */
  var ikConstraintIndex: Double = js.native
  
  /** Sets the time in seconds, mix, softness, bend direction, compress, and stretch for the specified key frame. */
  def setFrame(
    frameIndex: Double,
    time: Double,
    mix: Double,
    softness: Double,
    bendDirection: Double,
    compress: Boolean,
    stretch: Boolean
  ): Unit = js.native
}
/* static members */
object IkConstraintTimeline {
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.BEND_DIRECTION")
  @js.native
  def BEND_DIRECTION: Double = js.native
  inline def BEND_DIRECTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEND_DIRECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.COMPRESS")
  @js.native
  def COMPRESS: Double = js.native
  inline def COMPRESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPRESS")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.MIX")
  @js.native
  def MIX: Double = js.native
  inline def MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIX")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.PREV_BEND_DIRECTION")
  @js.native
  def PREV_BEND_DIRECTION: Double = js.native
  inline def PREV_BEND_DIRECTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_BEND_DIRECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.PREV_COMPRESS")
  @js.native
  def PREV_COMPRESS: Double = js.native
  inline def PREV_COMPRESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_COMPRESS")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.PREV_MIX")
  @js.native
  def PREV_MIX: Double = js.native
  inline def PREV_MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_MIX")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.PREV_SOFTNESS")
  @js.native
  def PREV_SOFTNESS: Double = js.native
  inline def PREV_SOFTNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_SOFTNESS")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.PREV_STRETCH")
  @js.native
  def PREV_STRETCH: Double = js.native
  inline def PREV_STRETCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_STRETCH")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.SOFTNESS")
  @js.native
  def SOFTNESS: Double = js.native
  inline def SOFTNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOFTNESS")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "IkConstraintTimeline.STRETCH")
  @js.native
  def STRETCH: Double = js.native
  inline def STRETCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRETCH")(x.asInstanceOf[js.Any])
}
