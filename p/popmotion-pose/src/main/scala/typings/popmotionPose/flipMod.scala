package typings.popmotionPose

import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.mod.Action_
import typings.popmotionPose.libTypesMod.Pose
import typings.popmotionPose.libTypesMod.PoserState
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.popmotionPose.typesMod.TransitionDefinition
import typings.popmotionPose.typesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/flip", JSImport.Namespace)
@js.native
object flipMod extends js.Object {
  @js.native
  class Action[Sub /* <: ColdSubscription */] ()
    extends typings.popmotion.actionMod.Action[Sub]
  
  def flipPose(
    props: PoserState[Value, Action_[ColdSubscription], ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[Action_[ColdSubscription], TransitionDefinition]
  ): Pose[Action_[ColdSubscription], TransitionDefinition] = js.native
  def isFlipPose(
    flip: Boolean,
    key: String,
    state: PoserState[Value, Action_[ColdSubscription], ColdSubscription, DomPopmotionPoser]
  ): Boolean = js.native
  def setValue(
    hasValuesProps: PoserState[Value, Action_[ColdSubscription], ColdSubscription, DomPopmotionPoser],
    key: String,
    to: js.Any
  ): Unit = js.native
}

