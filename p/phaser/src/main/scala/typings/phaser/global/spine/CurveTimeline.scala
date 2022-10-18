package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("spine.CurveTimeline")
@js.native
open class CurveTimeline protected ()
  extends StObject
     with typings.phaser.spine.CurveTimeline {
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
  override def setLinear(frameIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
}
object CurveTimeline {
  
  @JSGlobal("spine.CurveTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.CurveTimeline.BEZIER")
  @js.native
  def BEZIER: Double = js.native
  inline def BEZIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.CurveTimeline.BEZIER_SIZE")
  @js.native
  def BEZIER_SIZE: Double = js.native
  inline def BEZIER_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER_SIZE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.CurveTimeline.LINEAR")
  @js.native
  def LINEAR: Double = js.native
  inline def LINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.CurveTimeline.STEPPED")
  @js.native
  def STEPPED: Double = js.native
  inline def STEPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STEPPED")(x.asInstanceOf[js.Any])
}
