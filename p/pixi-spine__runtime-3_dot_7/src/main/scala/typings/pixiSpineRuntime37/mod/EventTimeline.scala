package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ArrayLike2
import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "EventTimeline")
@js.native
open class EventTimeline protected ()
  extends StObject
     with Timeline {
  def this(frameCount: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event2],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  
  var events: js.Array[Event2] = js.native
  
  var frames: ArrayLike2[Double] = js.native
  
  def getFrameCount(): Double = js.native
  
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  
  /** Sets the time of the specified keyframe. */
  def setFrame(frameIndex: Double, event: Event2): Unit = js.native
}
