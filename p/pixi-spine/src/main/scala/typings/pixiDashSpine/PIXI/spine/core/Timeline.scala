package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends js.Object {
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit
  def getPropertyId(): Double
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
}

