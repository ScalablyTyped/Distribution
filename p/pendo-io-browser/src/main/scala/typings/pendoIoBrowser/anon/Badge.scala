package typings.pendoIoBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Badge extends js.Object {
  var badge: js.Any
  var device: Desktop
  var launcher: Keywords
   // TODO
  var priority: Double
  var `type`: String
}

object Badge {
  @scala.inline
  def apply(badge: js.Any, device: Desktop, launcher: Keywords, priority: Double, `type`: String): Badge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], launcher = launcher.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
}

