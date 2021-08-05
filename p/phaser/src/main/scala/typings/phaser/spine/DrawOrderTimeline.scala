package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawOrderTimeline
  extends StObject
     with Timeline {
  
  var drawOrders: js.Array[js.Array[Double]]
  
  var frames: ArrayLike[Double]
  
  def getFrameCount(): Double
  
  def setFrame(frameIndex: Double, time: Double, drawOrder: js.Array[Double]): Unit
}
object DrawOrderTimeline {
  
  inline def apply(
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
  
  extension [Self <: DrawOrderTimeline](x: Self) {
    
    inline def setDrawOrders(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "drawOrders", value.asInstanceOf[js.Any])
    
    inline def setDrawOrdersVarargs(value: js.Array[Double]*): Self = StObject.set(x, "drawOrders", js.Array(value :_*))
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setGetFrameCount(value: () => Double): Self = StObject.set(x, "getFrameCount", js.Any.fromFunction0(value))
    
    inline def setSetFrame(value: (Double, Double, js.Array[Double]) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction3(value))
  }
}
