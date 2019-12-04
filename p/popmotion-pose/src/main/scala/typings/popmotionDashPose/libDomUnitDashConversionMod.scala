package typings.popmotionDashPose

import typings.popmotion.libActionTypesMod.ColdSubscription
import typings.popmotionDashPose.libDomFlipMod.Action
import typings.popmotionDashPose.libTypesMod.DomPopmotionPoser
import typings.popmotionDashPose.libTypesMod.TransitionDefinition
import typings.popmotionDashPose.libTypesMod.Value
import typings.popmotionDashPose.poseDashCoreLibTypesMod.Pose
import typings.popmotionDashPose.poseDashCoreLibTypesMod.PoserState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/unit-conversion", JSImport.Namespace)
@js.native
object libDomUnitDashConversionMod extends js.Object {
  def convertPositionalUnits(
    state: PoserState[Value, Action, ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[Action, TransitionDefinition]
  ): Pose[Action, TransitionDefinition] = js.native
  def isPositional(pose: Pose[Action, TransitionDefinition]): Boolean = js.native
}

