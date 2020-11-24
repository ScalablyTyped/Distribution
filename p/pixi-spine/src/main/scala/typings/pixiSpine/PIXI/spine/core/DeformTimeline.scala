package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeformTimeline extends CurveTimeline {
  
  var attachment: VertexAttachment = js.native
  
  var frameVertices: js.Array[ArrayLike[Double]] = js.native
  
  var frames: ArrayLike[Double] = js.native
  
  def setFrame(frameIndex: Double, time: Double, vertices: ArrayLike[Double]): Unit = js.native
  
  var slotIndex: Double = js.native
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
  implicit class DeformTimelineOps[Self <: DeformTimeline] (val x: Self) extends AnyVal {
    
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
    def setAttachment(value: VertexAttachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameVerticesVarargs(value: ArrayLike[Double]*): Self = this.set("frameVertices", js.Array(value :_*))
    
    @scala.inline
    def setFrameVertices(value: js.Array[ArrayLike[Double]]): Self = this.set("frameVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrames(value: ArrayLike[Double]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFrame(value: (Double, Double, ArrayLike[Double]) => Unit): Self = this.set("setFrame", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSlotIndex(value: Double): Self = this.set("slotIndex", value.asInstanceOf[js.Any])
  }
}
