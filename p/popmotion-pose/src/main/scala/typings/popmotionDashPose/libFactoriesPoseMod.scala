package typings.popmotionDashPose

import typings.popmotion.libActionTypesMod.ColdSubscription
import typings.popmotion.popmotionMod.Action
import typings.popmotionDashPose.libTypesMod.PopmotionPoserFactoryConfig
import typings.popmotionDashPose.libTypesMod.TransitionDefinition
import typings.popmotionDashPose.libTypesMod.Value
import typings.popmotionDashPose.poseDashCoreLibTypesMod.PoserConfig
import typings.poseDashCore.libTypesMod.Poser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/factories/pose", JSImport.Namespace)
@js.native
object libFactoriesPoseMod extends js.Object {
  def default[P](
    hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative: PopmotionPoserFactoryConfig[P, TransitionDefinition]
  ): js.Function1[/* config */ PoserConfig[Value], Poser[Value, Action, ColdSubscription, P]] = js.native
}

