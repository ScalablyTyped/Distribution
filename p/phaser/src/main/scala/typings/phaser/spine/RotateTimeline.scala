package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateTimeline
  extends StObject
     with CurveTimeline {
  
  var boneIndex: Double
  
  var frames: ArrayLike[Double]
  
  def setFrame(frameIndex: Double, time: Double, degrees: Double): Unit
}
object RotateTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    boneIndex: Double,
    curves: Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, Double) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit
  ): RotateTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), boneIndex = boneIndex.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction3(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped))
    __obj.asInstanceOf[RotateTimeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotateTimeline] (val x: Self) extends AnyVal {
    
    inline def setBoneIndex(value: Double): Self = StObject.set(x, "boneIndex", value.asInstanceOf[js.Any])
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setSetFrame(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction3(value))
  }
}
