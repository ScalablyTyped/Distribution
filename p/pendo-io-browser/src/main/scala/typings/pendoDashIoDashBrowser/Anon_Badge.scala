package typings.pendoDashIoDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Badge extends js.Object {
  var badge: js.Any
  var device: Anon_Desktop
  var launcher: Anon_Keywords
   // TODO
  var priority: Double
  var `type`: String
}

object Anon_Badge {
  @scala.inline
  def apply(badge: js.Any, device: Anon_Desktop, launcher: Anon_Keywords, priority: Double, `type`: String): Anon_Badge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], launcher = launcher.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Badge]
  }
}

