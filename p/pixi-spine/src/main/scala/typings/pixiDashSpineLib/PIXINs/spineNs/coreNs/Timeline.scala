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
    pose: MixPose,
    direction: MixDirection
  ): scala.Unit
  def getPropertyId(): scala.Double
}

object Timeline {
  @scala.inline
  def apply(
    apply: js.Function7[
      Skeleton, 
      scala.Double, 
      scala.Double, 
      js.Array[Event], 
      scala.Double, 
      MixPose, 
      MixDirection, 
      scala.Unit
    ],
    getPropertyId: js.Function0[scala.Double]
  ): Timeline = {
    val __obj = js.Dynamic.literal(apply = apply, getPropertyId = getPropertyId)
  
    __obj.asInstanceOf[Timeline]
  }
}

