package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "PathConstraintMixTimeline")
@js.native
open class PathConstraintMixTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  /** The time in seconds, rotate mix, and translate mix for each key frame. */
  var frames: ArrayLike2[Double] = js.native
  
  /** The index of the path constraint slot in {@link Skeleton#getPathConstraints()} that will be changed. */
  var pathConstraintIndex: Double = js.native
  
  /** The time in seconds, rotate mix, and translate mix for the specified key frame. */
  def setFrame(frameIndex: Double, time: Double, rotateMix: Double, translateMix: Double): Unit = js.native
}
/* static members */
object PathConstraintMixTimeline {
  
  @JSImport("@pixi-spine/runtime-3.8", "PathConstraintMixTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "PathConstraintMixTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "PathConstraintMixTimeline.PREV_ROTATE")
  @js.native
  def PREV_ROTATE: Double = js.native
  inline def PREV_ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_ROTATE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "PathConstraintMixTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "PathConstraintMixTimeline.PREV_TRANSLATE")
  @js.native
  def PREV_TRANSLATE: Double = js.native
  inline def PREV_TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TRANSLATE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "PathConstraintMixTimeline.ROTATE")
  @js.native
  def ROTATE: Double = js.native
  inline def ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROTATE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "PathConstraintMixTimeline.TRANSLATE")
  @js.native
  def TRANSLATE: Double = js.native
  inline def TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSLATE")(x.asInstanceOf[js.Any])
}
