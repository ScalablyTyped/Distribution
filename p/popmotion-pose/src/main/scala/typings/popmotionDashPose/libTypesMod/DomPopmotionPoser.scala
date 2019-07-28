package typings.popmotionDashPose.libTypesMod

import typings.popmotion.libActionTypesMod.ColdSubscription
import typings.popmotion.popmotionMod.Action
import typings.poseDashCore.libTypesMod.Poser
import typings.poseDashCore.libTypesMod.PoserConfig
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomPopmotionPoser extends Poser[Value, Action, ColdSubscription, DomPopmotionPoser] {
  def addChild(element: Element, config: PoserConfig[Value]): DomPopmotionPoser = js.native
  def flip(op: js.Function): js.Promise[_] = js.native
  def measure(): BoundingBox = js.native
}

