package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurveTimeline
  extends StObject
     with Timeline {
  
  /* private */ var curves: Any
  
  def getCurvePercent(frameIndex: Double, percent: Double): Double
  
  def getCurveType(frameIndex: Double): Double
  
  def getFrameCount(): Double
  
  def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit
  
  def setLinear(frameIndex: Double): Unit
  
  def setStepped(frameIndex: Double): Unit
}
object CurveTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    curves: Any,
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
  implicit open class MutableBuilder[Self <: CurveTimeline] (val x: Self) extends AnyVal {
    
    inline def setCurves(value: Any): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
    
    inline def setGetCurvePercent(value: (Double, Double) => Double): Self = StObject.set(x, "getCurvePercent", js.Any.fromFunction2(value))
    
    inline def setGetCurveType(value: Double => Double): Self = StObject.set(x, "getCurveType", js.Any.fromFunction1(value))
    
    inline def setGetFrameCount(value: () => Double): Self = StObject.set(x, "getFrameCount", js.Any.fromFunction0(value))
    
    inline def setSetCurve(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setCurve", js.Any.fromFunction5(value))
    
    inline def setSetLinear(value: Double => Unit): Self = StObject.set(x, "setLinear", js.Any.fromFunction1(value))
    
    inline def setSetStepped(value: Double => Unit): Self = StObject.set(x, "setStepped", js.Any.fromFunction1(value))
  }
}
