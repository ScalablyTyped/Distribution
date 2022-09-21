package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "TranslateTimeline")
@js.native
open class TranslateTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  /** The index of the bone in {@link Skeleton#bones} that will be changed. */
  var boneIndex: Double = js.native
  
  /** The time in seconds, x, and y values for each key frame. */
  var frames: ArrayLike2[Double] = js.native
  
  /** Sets the time in seconds, x, and y values for the specified key frame. */
  def setFrame(frameIndex: Double, time: Double, x: Double, y: Double): Unit = js.native
}
/* static members */
object TranslateTimeline {
  
  @JSImport("@pixi-spine/runtime-3.8", "TranslateTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "TranslateTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TranslateTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TranslateTimeline.PREV_X")
  @js.native
  def PREV_X: Double = js.native
  inline def PREV_X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_X")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TranslateTimeline.PREV_Y")
  @js.native
  def PREV_Y: Double = js.native
  inline def PREV_Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_Y")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TranslateTimeline.X")
  @js.native
  def X: Double = js.native
  inline def X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TranslateTimeline.Y")
  @js.native
  def Y: Double = js.native
  inline def Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
}
