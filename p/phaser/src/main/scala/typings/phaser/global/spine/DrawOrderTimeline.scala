package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.DrawOrderTimeline")
@js.native
class DrawOrderTimeline protected ()
  extends StObject
     with typings.phaser.spine.DrawOrderTimeline {
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
  var drawOrders: js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var frames: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  override def getFrameCount(): Double = js.native
  
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  
  /* CompleteClass */
  override def setFrame(frameIndex: Double, time: Double, drawOrder: js.Array[Double]): Unit = js.native
}
