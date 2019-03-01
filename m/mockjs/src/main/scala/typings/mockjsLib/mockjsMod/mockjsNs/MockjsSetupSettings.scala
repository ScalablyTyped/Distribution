package typings
package mockjsLib.mockjsMod.mockjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockjsSetupSettings extends js.Object {
  var timeout: js.UndefOr[scala.Double | S] = js.undefined
}

object MockjsSetupSettings {
  @scala.inline
  def apply(timeout: scala.Double | S = null): MockjsSetupSettings = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockjsSetupSettings]
  }
}

