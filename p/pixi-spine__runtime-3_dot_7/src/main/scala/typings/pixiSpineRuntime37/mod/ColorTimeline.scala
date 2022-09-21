package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "ColorTimeline")
@js.native
open class ColorTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  var frames: ArrayLike2[Double] = js.native
  
  /** Sets the time and value of the specified keyframe. */
  def setFrame(frameIndex: Double, time: Double, r: Double, g: Double, b: Double, a: Double): Unit = js.native
  
  var slotIndex: Double = js.native
}
/* static members */
object ColorTimeline {
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.A")
  @js.native
  def A: Double = js.native
  inline def A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("A")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.B")
  @js.native
  def B: Double = js.native
  inline def B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("B")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.G")
  @js.native
  def G: Double = js.native
  inline def G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.PREV_A")
  @js.native
  def PREV_A: Double = js.native
  inline def PREV_A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_A")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.PREV_B")
  @js.native
  def PREV_B: Double = js.native
  inline def PREV_B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_B")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.PREV_G")
  @js.native
  def PREV_G: Double = js.native
  inline def PREV_G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_G")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.PREV_R")
  @js.native
  def PREV_R: Double = js.native
  inline def PREV_R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_R")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "ColorTimeline.R")
  @js.native
  def R: Double = js.native
  inline def R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("R")(x.asInstanceOf[js.Any])
}
