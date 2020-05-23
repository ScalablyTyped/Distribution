package typings.mqttPacket.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerReference extends js.Object {
  var reasonString: js.UndefOr[String] = js.undefined
  var serverReference: js.UndefOr[String] = js.undefined
  var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
}

object ServerReference {
  @scala.inline
  def apply(
    reasonString: String = null,
    serverReference: String = null,
    sessionExpiryInterval: js.UndefOr[Double] = js.undefined,
    userProperties: js.Object = null
  ): ServerReference = {
    val __obj = js.Dynamic.literal()
    if (reasonString != null) __obj.updateDynamic("reasonString")(reasonString.asInstanceOf[js.Any])
    if (serverReference != null) __obj.updateDynamic("serverReference")(serverReference.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionExpiryInterval)) __obj.updateDynamic("sessionExpiryInterval")(sessionExpiryInterval.get.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerReference]
  }
}

