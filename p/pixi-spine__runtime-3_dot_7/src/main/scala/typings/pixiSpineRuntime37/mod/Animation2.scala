package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.IAnimation
import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait Animation2
  extends StObject
     with IAnimation[Timeline] {
  
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[Event2],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit
}
object Animation2 {
  
  inline def apply(
    apply: (Skeleton, Double, Double, Boolean, js.Array[Event2], Double, MixBlend, MixDirection) => Unit,
    duration: Double,
    name: String,
    timelines: js.Array[Timeline]
  ): Animation2 = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction8(apply), duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timelines = timelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation2]
  }
  
  extension [Self <: Animation2](x: Self) {
    
    inline def setApply(
      value: (Skeleton, Double, Double, Boolean, js.Array[Event2], Double, MixBlend, MixDirection) => Unit
    ): Self = StObject.set(x, "apply", js.Any.fromFunction8(value))
  }
}
