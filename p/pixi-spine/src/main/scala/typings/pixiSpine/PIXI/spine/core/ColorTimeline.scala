package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorTimeline
  extends StObject
     with CurveTimeline {
  
  var frames: ArrayLike[Double]
  
  def setFrame(frameIndex: Double, time: Double, r: Double, g: Double, b: Double, a: Double): Unit
  
  var slotIndex: Double
}
object ColorTimeline {
  
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    curves: js.Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, Double, Double, Double, Double) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit,
    slotIndex: Double
  ): ColorTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction6(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTimeline]
  }
  
  @scala.inline
  implicit class ColorTimelineMutableBuilder[Self <: ColorTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFrame(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction6(value))
    
    @scala.inline
    def setSlotIndex(value: Double): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}
