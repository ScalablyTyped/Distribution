package typings.popmotionPose

import typings.popmotion.typesMod.ColdSubscription
import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.poseCore.typesMod.ActiveActions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  def default(
    element: Element,
    activeActions: ActiveActions[ColdSubscription],
    poser: DomPopmotionPoser,
    hasProps: DomPopmotionConfig
  ): Unit = js.native
}

