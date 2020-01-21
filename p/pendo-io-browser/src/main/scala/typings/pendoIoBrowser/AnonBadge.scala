package typings.pendoIoBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBadge extends js.Object {
  var badge: js.Any
  var device: AnonDesktop
  var launcher: AnonKeywords
   // TODO
  var priority: Double
  var `type`: String
}

object AnonBadge {
  @scala.inline
  def apply(badge: js.Any, device: AnonDesktop, launcher: AnonKeywords, priority: Double, `type`: String): AnonBadge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], launcher = launcher.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBadge]
  }
}

