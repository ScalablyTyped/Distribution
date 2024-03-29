package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathConstraintPositionTimeline
  extends StObject
     with CurveTimeline {
  
  var frames: ArrayLike[Double]
  
  var pathConstraintIndex: Double
  
  def setFrame(frameIndex: Double, time: Double, value: Double): Unit
}
object PathConstraintPositionTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    curves: Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    pathConstraintIndex: Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, Double) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit
  ): PathConstraintPositionTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), pathConstraintIndex = pathConstraintIndex.asInstanceOf[js.Any], setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction3(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped))
    __obj.asInstanceOf[PathConstraintPositionTimeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathConstraintPositionTimeline] (val x: Self) extends AnyVal {
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setPathConstraintIndex(value: Double): Self = StObject.set(x, "pathConstraintIndex", value.asInstanceOf[js.Any])
    
    inline def setSetFrame(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction3(value))
  }
}
