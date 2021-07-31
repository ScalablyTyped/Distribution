package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.TranslateTimeline")
@js.native
class TranslateTimeline protected ()
  extends StObject
     with typings.phaser.spine.TranslateTimeline {
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
  
  /* CompleteClass */
  var boneIndex: Double = js.native
  
  /* CompleteClass */
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
  override def setFrame(frameIndex: Double, time: Double, x: Double, y: Double): Unit = js.native
  
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
}
object TranslateTimeline {
  
  @JSGlobal("spine.TranslateTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.TranslateTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  @scala.inline
  def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TranslateTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  @scala.inline
  def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TranslateTimeline.PREV_X")
  @js.native
  def PREV_X: Double = js.native
  @scala.inline
  def PREV_X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TranslateTimeline.PREV_Y")
  @js.native
  def PREV_Y: Double = js.native
  @scala.inline
  def PREV_Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TranslateTimeline.X")
  @js.native
  def X: Double = js.native
  @scala.inline
  def X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.TranslateTimeline.Y")
  @js.native
  def Y: Double = js.native
  @scala.inline
  def Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
}
