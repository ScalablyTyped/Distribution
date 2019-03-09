package typings
package pendoDashIoDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Desktop extends js.Object {
  var desktop: scala.Boolean
  var mobile: scala.Boolean
  var `type`: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.desktop | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.mobile
}

object Anon_Desktop {
  @scala.inline
  def apply(
    desktop: scala.Boolean,
    mobile: scala.Boolean,
    `type`: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.desktop | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.mobile
  ): Anon_Desktop = {
    val __obj = js.Dynamic.literal(desktop = desktop, mobile = mobile)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Desktop]
  }
}

