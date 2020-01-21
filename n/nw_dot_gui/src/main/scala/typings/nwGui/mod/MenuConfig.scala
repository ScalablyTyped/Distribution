package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuConfig extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object MenuConfig {
  @scala.inline
  def apply(`type`: String = null): MenuConfig = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuConfig]
  }
}

