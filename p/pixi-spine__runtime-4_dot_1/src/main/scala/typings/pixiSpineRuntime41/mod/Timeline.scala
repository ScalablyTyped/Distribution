package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.ITimeline
import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import typings.pixiSpineBase.mod.NumberArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "Timeline")
@js.native
abstract class Timeline protected ()
  extends StObject
     with ITimeline {
  def this(frameCount: Double, propertyIds: js.Array[String]) = this()
  
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event2],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: Null,
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  
  var frames: NumberArrayLike = js.native
  
  def getDuration(): Double = js.native
  
  def getFrameCount(): Double = js.native
  
  def getFrameEntries(): Double = js.native
  
  def getPropertyIds(): js.Array[String] = js.native
  
  var propertyIds: js.Array[String] = js.native
}
/* static members */
object Timeline {
  
  @JSImport("@pixi-spine/runtime-4.1", "Timeline")
  @js.native
  val ^ : js.Any = js.native
  
  inline def search(frames: NumberArrayLike, time: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(frames.asInstanceOf[js.Any], time.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def search1(frames: NumberArrayLike, time: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("search1")(frames.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Double]
}
