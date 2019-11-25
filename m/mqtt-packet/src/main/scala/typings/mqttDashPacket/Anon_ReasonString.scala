package typings.mqttDashPacket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReasonString extends js.Object {
  var reasonString: js.UndefOr[String] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
}

object Anon_ReasonString {
  @scala.inline
  def apply(reasonString: String = null, userProperties: js.Object = null): Anon_ReasonString = {
    val __obj = js.Dynamic.literal()
    if (reasonString != null) __obj.updateDynamic("reasonString")(reasonString.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReasonString]
  }
}

