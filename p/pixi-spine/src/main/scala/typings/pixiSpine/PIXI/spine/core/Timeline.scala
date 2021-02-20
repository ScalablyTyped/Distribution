package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeline extends StObject {
  
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  
  def getPropertyId(): Double = js.native
}
object Timeline {
  
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    getPropertyId: () => Double
  ): Timeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), getPropertyId = js.Any.fromFunction0(getPropertyId))
    __obj.asInstanceOf[Timeline]
  }
  
  @scala.inline
  implicit class TimelineMutableBuilder[Self <: Timeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction7(value))
    
    @scala.inline
    def setGetPropertyId(value: () => Double): Self = StObject.set(x, "getPropertyId", js.Any.fromFunction0(value))
  }
}
