package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends js.Object {
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: scala.Double,
    time: scala.Double,
    events: js.Array[Event],
    alpha: scala.Double,
    blend: MixBlend,
    direction: MixDirection
  ): scala.Unit
  def getPropertyId(): scala.Double
}

object Timeline {
  @scala.inline
  def apply(
    apply: (Skeleton, scala.Double, scala.Double, js.Array[Event], scala.Double, MixBlend, MixDirection) => scala.Unit,
    getPropertyId: () => scala.Double
  ): Timeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), getPropertyId = js.Any.fromFunction0(getPropertyId))
  
    __obj.asInstanceOf[Timeline]
  }
}

