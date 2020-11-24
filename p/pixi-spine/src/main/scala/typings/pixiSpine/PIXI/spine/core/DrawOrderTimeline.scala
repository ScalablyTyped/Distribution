package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawOrderTimeline extends Timeline {
  
  var drawOrders: js.Array[js.Array[Double]] = js.native
  
  var frames: ArrayLike[Double] = js.native
  
  def getFrameCount(): Double = js.native
  
  def setFrame(frameIndex: Double, time: Double, drawOrder: js.Array[Double]): Unit = js.native
}
object DrawOrderTimeline {
  
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    drawOrders: js.Array[js.Array[Double]],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setFrame: (Double, Double, js.Array[Double]) => Unit
  ): DrawOrderTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), drawOrders = drawOrders.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setFrame = js.Any.fromFunction3(setFrame))
    __obj.asInstanceOf[DrawOrderTimeline]
  }
  
  @scala.inline
  implicit class DrawOrderTimelineOps[Self <: DrawOrderTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDrawOrdersVarargs(value: js.Array[Double]*): Self = this.set("drawOrders", js.Array(value :_*))
    
    @scala.inline
    def setDrawOrders(value: js.Array[js.Array[Double]]): Self = this.set("drawOrders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrames(value: ArrayLike[Double]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFrameCount(value: () => Double): Self = this.set("getFrameCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFrame(value: (Double, Double, js.Array[Double]) => Unit): Self = this.set("setFrame", js.Any.fromFunction3(value))
  }
}
