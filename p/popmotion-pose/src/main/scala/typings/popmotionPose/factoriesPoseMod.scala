package typings.popmotionPose

import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.mod.Action_
import typings.popmotionPose.libTypesMod.PoserConfig
import typings.popmotionPose.typesMod.PopmotionPoserFactoryConfig
import typings.popmotionPose.typesMod.TransitionDefinition
import typings.popmotionPose.typesMod.Value
import typings.poseCore.typesMod.Poser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/factories/pose", JSImport.Namespace)
@js.native
object factoriesPoseMod extends js.Object {
  def default[P](
    hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative: PopmotionPoserFactoryConfig[P, TransitionDefinition]
  ): js.Function1[
    /* config */ PoserConfig[Value], 
    Poser[Value, Action_[ColdSubscription], ColdSubscription, P]
  ] = js.native
}

