package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeformTimeline
  extends StObject
     with CurveTimeline {
  
  var attachment: VertexAttachment
  
  var frameVertices: js.Array[ArrayLike[Double]]
  
  var frames: ArrayLike[Double]
  
  def setFrame(frameIndex: Double, time: Double, vertices: ArrayLike[Double]): Unit
  
  var slotIndex: Double
}
object DeformTimeline {
  
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    attachment: VertexAttachment,
    curves: js.Any,
    frameVertices: js.Array[ArrayLike[Double]],
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, ArrayLike[Double]) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit,
    slotIndex: Double
  ): DeformTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), attachment = attachment.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], frameVertices = frameVertices.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction3(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeformTimeline]
  }
  
  @scala.inline
  implicit class DeformTimelineMutableBuilder[Self <: DeformTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: VertexAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameVertices(value: js.Array[ArrayLike[Double]]): Self = StObject.set(x, "frameVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameVerticesVarargs(value: ArrayLike[Double]*): Self = StObject.set(x, "frameVertices", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFrame(value: (Double, Double, ArrayLike[Double]) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSlotIndex(value: Double): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}
