package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "RotateTimeline")
@js.native
open class RotateTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  var boneIndex: Double = js.native
  
  var frames: ArrayLike2[Double] = js.native
  
  /** Sets the time and angle of the specified keyframe. */
  def setFrame(frameIndex: Double, time: Double, degrees: Double): Unit = js.native
}
/* static members */
object RotateTimeline {
  
  @JSImport("@pixi-spine/runtime-3.7", "RotateTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.7", "RotateTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "RotateTimeline.PREV_ROTATION")
  @js.native
  def PREV_ROTATION: Double = js.native
  inline def PREV_ROTATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_ROTATION")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "RotateTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "RotateTimeline.ROTATION")
  @js.native
  def ROTATION: Double = js.native
  inline def ROTATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROTATION")(x.asInstanceOf[js.Any])
}
