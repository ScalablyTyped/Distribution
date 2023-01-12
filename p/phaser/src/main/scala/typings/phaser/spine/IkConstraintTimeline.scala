package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IkConstraintTimeline
  extends StObject
     with CurveTimeline {
  
  var frames: ArrayLike[Double]
  
  var ikConstraintIndex: Double
  
  def setFrame(
    frameIndex: Double,
    time: Double,
    mix: Double,
    softness: Double,
    bendDirection: Double,
    compress: Boolean,
    stretch: Boolean
  ): Unit
}
object IkConstraintTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    curves: Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    ikConstraintIndex: Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, Double, Double, Double, Boolean, Boolean) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit
  ): IkConstraintTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), ikConstraintIndex = ikConstraintIndex.asInstanceOf[js.Any], setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction7(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped))
    __obj.asInstanceOf[IkConstraintTimeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IkConstraintTimeline] (val x: Self) extends AnyVal {
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setIkConstraintIndex(value: Double): Self = StObject.set(x, "ikConstraintIndex", value.asInstanceOf[js.Any])
    
    inline def setSetFrame(value: (Double, Double, Double, Double, Double, Boolean, Boolean) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction7(value))
  }
}
