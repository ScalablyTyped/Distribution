package typings.popmotionPose.typesMod

import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.mod.Action_
import typings.poseCore.typesMod.Poser
import typings.poseCore.typesMod.PoserConfig
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomPopmotionPoser extends Poser[Value, Action_[ColdSubscription], ColdSubscription, DomPopmotionPoser] {
  def addChild(element: Element, config: PoserConfig[Value]): DomPopmotionPoser = js.native
  def flip(op: js.Function): js.Promise[_] = js.native
  def measure(): BoundingBox = js.native
}

