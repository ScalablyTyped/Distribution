package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.CurveTimeline")
@js.native
abstract class CurveTimeline protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.CurveTimeline {
  def this(frameCount: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typings.pixiSpine.PIXI.spine.core.Event],
    alpha: Double,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend,
    direction: typings.pixiSpine.PIXI.spine.core.MixDirection
  ): Unit = js.native
  
  /* private */ /* CompleteClass */
  var curves: js.Any = js.native
  
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
  
  @JSGlobal("PIXI.spine.core.CurveTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.CurveTimeline.BEZIER")
  @js.native
  def BEZIER: Double = js.native
  inline def BEZIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.CurveTimeline.BEZIER_SIZE")
  @js.native
  def BEZIER_SIZE: Double = js.native
  inline def BEZIER_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER_SIZE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.CurveTimeline.LINEAR")
  @js.native
  def LINEAR: Double = js.native
  inline def LINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.CurveTimeline.STEPPED")
  @js.native
  def STEPPED: Double = js.native
  inline def STEPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STEPPED")(x.asInstanceOf[js.Any])
}
