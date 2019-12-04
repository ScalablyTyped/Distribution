package typings.popmotionDashPose

import typings.popmotion.popmotionMod.Action
import typings.popmotionDashPose.libTypesMod.TransitionDefinition
import typings.poseDashCore.libTypesMod.TransitionMap
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/inc/default-transitions", JSImport.Namespace)
@js.native
object libIncDefaultDashTransitionsMod extends js.Object {
  val default: Map[String, TransitionMap[Action, TransitionDefinition]] = js.native
  def just(from: js.Any): Action = js.native
}

