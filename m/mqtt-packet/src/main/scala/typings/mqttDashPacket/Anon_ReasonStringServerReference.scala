package typings.mqttDashPacket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReasonStringServerReference extends js.Object {
  var reasonString: js.UndefOr[String] = js.undefined
  var serverReference: js.UndefOr[String] = js.undefined
  var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
}

object Anon_ReasonStringServerReference {
  @scala.inline
  def apply(
    reasonString: String = null,
    serverReference: String = null,
    sessionExpiryInterval: Int | Double = null,
    userProperties: js.Object = null
  ): Anon_ReasonStringServerReference = {
    val __obj = js.Dynamic.literal()
    if (reasonString != null) __obj.updateDynamic("reasonString")(reasonString)
    if (serverReference != null) __obj.updateDynamic("serverReference")(serverReference)
    if (sessionExpiryInterval != null) __obj.updateDynamic("sessionExpiryInterval")(sessionExpiryInterval.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties)
    __obj.asInstanceOf[Anon_ReasonStringServerReference]
  }
}

