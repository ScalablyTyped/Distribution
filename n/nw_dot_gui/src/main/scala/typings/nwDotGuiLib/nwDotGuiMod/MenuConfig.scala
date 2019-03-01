package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuConfig extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MenuConfig {
  @scala.inline
  def apply(`type`: java.lang.String = null): MenuConfig = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MenuConfig]
  }
}

