package typings.popmotionPose

import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.mod.Action_
import typings.popmotionPose.typesMod.TransitionDefinition
import typings.poseCore.typesMod.TransitionMap
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/inc/default-transitions", JSImport.Namespace)
@js.native
object defaultTransitionsMod extends js.Object {
  val default: Map[String, TransitionMap[Action_[ColdSubscription], TransitionDefinition]] = js.native
  def just(from: js.Any): Action_[ColdSubscription] = js.native
}

