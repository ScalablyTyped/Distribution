package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.ColorTimeline")
@js.native
class ColorTimeline protected ()
  extends StObject
     with typings.phaser.spine.ColorTimeline {
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
  override def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  
  /* CompleteClass */
  override def setFrame(frameIndex: Double, time: Double, r: Double, g: Double, b: Double, a: Double): Unit = js.native
  
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  var slotIndex: Double = js.native
}
object ColorTimeline {
  
  @JSGlobal("spine.ColorTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.A")
  @js.native
  def A: Double = js.native
  inline def A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("A")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.B")
  @js.native
  def B: Double = js.native
  inline def B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("B")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.G")
  @js.native
  def G: Double = js.native
  inline def G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.PREV_A")
  @js.native
  def PREV_A: Double = js.native
  inline def PREV_A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_A")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.PREV_B")
  @js.native
  def PREV_B: Double = js.native
  inline def PREV_B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_B")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.PREV_G")
  @js.native
  def PREV_G: Double = js.native
  inline def PREV_G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_G")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.PREV_R")
  @js.native
  def PREV_R: Double = js.native
  inline def PREV_R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_R")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.ColorTimeline.R")
  @js.native
  def R: Double = js.native
  inline def R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("R")(x.asInstanceOf[js.Any])
}
