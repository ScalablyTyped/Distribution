package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline")
@js.native
open class TwoColorTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  /** The time in seconds, red, green, blue, and alpha values of the color, red, green, blue of the dark color, for each key frame. */
  var frames: ArrayLike2[Double] = js.native
  
  /** Sets the time in seconds, light, and dark colors for the specified key frame. */
  def setFrame(
    frameIndex: Double,
    time: Double,
    r: Double,
    g: Double,
    b: Double,
    a: Double,
    r2: Double,
    g2: Double,
    b2: Double
  ): Unit = js.native
  
  /** The index of the slot in {@link Skeleton#slots()} that will be changed. The {@link Slot#darkColor()} must not be
    * null. */
  var slotIndex: Double = js.native
}
/* static members */
object TwoColorTimeline {
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.A")
  @js.native
  def A: Double = js.native
  inline def A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("A")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.B")
  @js.native
  def B: Double = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.B2")
  @js.native
  def B2: Double = js.native
  inline def B2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("B2")(x.asInstanceOf[js.Any])
  
  inline def B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("B")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.G")
  @js.native
  def G: Double = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.G2")
  @js.native
  def G2: Double = js.native
  inline def G2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G2")(x.asInstanceOf[js.Any])
  
  inline def G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.PREV_A")
  @js.native
  def PREV_A: Double = js.native
  inline def PREV_A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_A")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.PREV_B")
  @js.native
  def PREV_B: Double = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.PREV_B2")
  @js.native
  def PREV_B2: Double = js.native
  inline def PREV_B2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_B2")(x.asInstanceOf[js.Any])
  
  inline def PREV_B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_B")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.PREV_G")
  @js.native
  def PREV_G: Double = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.PREV_G2")
  @js.native
  def PREV_G2: Double = js.native
  inline def PREV_G2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_G2")(x.asInstanceOf[js.Any])
  
  inline def PREV_G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_G")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.PREV_R")
  @js.native
  def PREV_R: Double = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.PREV_R2")
  @js.native
  def PREV_R2: Double = js.native
  inline def PREV_R2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_R2")(x.asInstanceOf[js.Any])
  
  inline def PREV_R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_R")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.R")
  @js.native
  def R: Double = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "TwoColorTimeline.R2")
  @js.native
  def R2: Double = js.native
  inline def R2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("R2")(x.asInstanceOf[js.Any])
  
  inline def R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("R")(x.asInstanceOf[js.Any])
}
