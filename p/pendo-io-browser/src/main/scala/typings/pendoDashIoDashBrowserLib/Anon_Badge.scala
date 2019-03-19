package typings
package pendoDashIoDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Badge extends js.Object {
  var badge: js.Any
  var device: Anon_Desktop
  var launcher: Anon_Keywords
   // TODO
  var priority: scala.Double
  var `type`: java.lang.String
}

object Anon_Badge {
  @scala.inline
  def apply(
    badge: js.Any,
    device: Anon_Desktop,
    launcher: Anon_Keywords,
    priority: scala.Double,
    `type`: java.lang.String
  ): Anon_Badge = {
    val __obj = js.Dynamic.literal(badge = badge, device = device, launcher = launcher, priority = priority)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Badge]
  }
}

