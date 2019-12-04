package typings.popmotionDashPose

import typings.popmotion.libActionTypesMod.ColdSubscription
import typings.popmotionDashPose.libTypesMod.DomPopmotionConfig
import typings.popmotionDashPose.libTypesMod.DomPopmotionPoser
import typings.poseDashCore.libTypesMod.ActiveActions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/events", JSImport.Namespace)
@js.native
object libDomEventsMod extends js.Object {
  def default(
    element: Element,
    activeActions: ActiveActions[ColdSubscription],
    poser: DomPopmotionPoser,
    hasProps: DomPopmotionConfig
  ): Unit = js.native
}

