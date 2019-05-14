package typings
package popmotionDashPoseLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomPopmotionPoser
  extends poseDashCoreLib.libTypesMod.Poser[
      Value, 
      popmotionLib.popmotionMod.Action, 
      popmotionLib.libActionTypesMod.ColdSubscription, 
      DomPopmotionPoser
    ] {
  def addChild(element: stdLib.Element, config: poseDashCoreLib.libTypesMod.PoserConfig[Value]): DomPopmotionPoser = js.native
  def flip(op: js.Function): js.Promise[_] = js.native
  def measure(): BoundingBox = js.native
}

