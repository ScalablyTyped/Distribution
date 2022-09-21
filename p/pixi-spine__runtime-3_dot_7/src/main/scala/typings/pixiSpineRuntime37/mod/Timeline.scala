package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ITimeline
import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeline
  extends StObject
     with ITimeline {
  
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event2],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit
  
  def getPropertyId(): Double
}
object Timeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event2], Double, MixBlend, MixDirection) => Unit,
    getPropertyId: () => Double
  ): Timeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), getPropertyId = js.Any.fromFunction0(getPropertyId))
    __obj.asInstanceOf[Timeline]
  }
  
  extension [Self <: Timeline](x: Self) {
    
    inline def setApply(value: (Skeleton, Double, Double, js.Array[Event2], Double, MixBlend, MixDirection) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction7(value))
    
    inline def setGetPropertyId(value: () => Double): Self = StObject.set(x, "getPropertyId", js.Any.fromFunction0(value))
  }
}
