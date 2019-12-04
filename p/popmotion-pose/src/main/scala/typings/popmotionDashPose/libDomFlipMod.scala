package typings.popmotionDashPose

import typings.popmotion.libActionTypesMod.ColdSubscription
import typings.popmotionDashPose.libTypesMod.DomPopmotionPoser
import typings.popmotionDashPose.libTypesMod.TransitionDefinition
import typings.popmotionDashPose.libTypesMod.Value
import typings.popmotionDashPose.poseDashCoreLibTypesMod.Pose
import typings.popmotionDashPose.poseDashCoreLibTypesMod.PoserState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/flip", JSImport.Namespace)
@js.native
object libDomFlipMod extends js.Object {
  @js.native
  class Action ()
    extends typings.popmotion.libActionMod.Action
  
  def flipPose(
    props: PoserState[Value, typings.popmotion.popmotionMod.Action, ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[typings.popmotion.popmotionMod.Action, TransitionDefinition]
  ): Pose[typings.popmotion.popmotionMod.Action, TransitionDefinition] = js.native
  def isFlipPose(
    flip: Boolean,
    key: String,
    state: PoserState[Value, typings.popmotion.popmotionMod.Action, ColdSubscription, DomPopmotionPoser]
  ): Boolean = js.native
  def setValue(
    hasValuesProps: PoserState[Value, typings.popmotion.popmotionMod.Action, ColdSubscription, DomPopmotionPoser],
    key: String,
    to: js.Any
  ): Unit = js.native
}

