package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurveTimeline extends Timeline {
  
  var curves: js.Any = js.native
  
  def getCurvePercent(frameIndex: Double, percent: Double): Double = js.native
  
  def getCurveType(frameIndex: Double): Double = js.native
  
  def getFrameCount(): Double = js.native
  
  def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  
  def setLinear(frameIndex: Double): Unit = js.native
  
  def setStepped(frameIndex: Double): Unit = js.native
}
object CurveTimeline {
  
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    curves: js.Any,
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit
  ): CurveTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), curves = curves.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setCurve = js.Any.fromFunction5(setCurve), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped))
    __obj.asInstanceOf[CurveTimeline]
  }
  
  @scala.inline
  implicit class CurveTimelineMutableBuilder[Self <: CurveTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurves(value: js.Any): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurvePercent(value: (Double, Double) => Double): Self = StObject.set(x, "getCurvePercent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCurveType(value: Double => Double): Self = StObject.set(x, "getCurveType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFrameCount(value: () => Double): Self = StObject.set(x, "getFrameCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCurve(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setCurve", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSetLinear(value: Double => Unit): Self = StObject.set(x, "setLinear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStepped(value: Double => Unit): Self = StObject.set(x, "setStepped", js.Any.fromFunction1(value))
  }
}
