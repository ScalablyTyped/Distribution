package typings.mqttDashPacket

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var correlationData: js.UndefOr[Buffer] = js.undefined
  var messageExpiryInterval: js.UndefOr[Double] = js.undefined
  var payloadFormatIndicator: js.UndefOr[Double] = js.undefined
  var responseTopic: js.UndefOr[String] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
  var willDelayInterval: js.UndefOr[Double] = js.undefined
}

object Anon_ContentType {
  @scala.inline
  def apply(
    contentType: String = null,
    correlationData: Buffer = null,
    messageExpiryInterval: Int | Double = null,
    payloadFormatIndicator: Int | Double = null,
    responseTopic: String = null,
    userProperties: js.Object = null,
    willDelayInterval: Int | Double = null
  ): Anon_ContentType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (correlationData != null) __obj.updateDynamic("correlationData")(correlationData.asInstanceOf[js.Any])
    if (messageExpiryInterval != null) __obj.updateDynamic("messageExpiryInterval")(messageExpiryInterval.asInstanceOf[js.Any])
    if (payloadFormatIndicator != null) __obj.updateDynamic("payloadFormatIndicator")(payloadFormatIndicator.asInstanceOf[js.Any])
    if (responseTopic != null) __obj.updateDynamic("responseTopic")(responseTopic.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties.asInstanceOf[js.Any])
    if (willDelayInterval != null) __obj.updateDynamic("willDelayInterval")(willDelayInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContentType]
  }
}

