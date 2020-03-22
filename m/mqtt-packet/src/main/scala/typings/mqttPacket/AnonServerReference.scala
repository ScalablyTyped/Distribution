package typings.mqttPacket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonServerReference extends js.Object {
  var reasonString: js.UndefOr[String] = js.undefined
  var serverReference: js.UndefOr[String] = js.undefined
  var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
}

object AnonServerReference {
  @scala.inline
  def apply(
    reasonString: String = null,
    serverReference: String = null,
    sessionExpiryInterval: Int | Double = null,
    userProperties: js.Object = null
  ): AnonServerReference = {
    val __obj = js.Dynamic.literal()
    if (reasonString != null) __obj.updateDynamic("reasonString")(reasonString.asInstanceOf[js.Any])
    if (serverReference != null) __obj.updateDynamic("serverReference")(serverReference.asInstanceOf[js.Any])
    if (sessionExpiryInterval != null) __obj.updateDynamic("sessionExpiryInterval")(sessionExpiryInterval.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonServerReference]
  }
}

