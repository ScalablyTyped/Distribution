package typings.mqtt.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentType extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var correlationData: js.UndefOr[Buffer] = js.undefined
  var messageExpiryInterval: js.UndefOr[Double] = js.undefined
  var payloadFormatIndicator: js.UndefOr[Double] = js.undefined
  var responseTopic: js.UndefOr[String] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
  var willDelayInterval: js.UndefOr[Double] = js.undefined
}

object ContentType {
  @scala.inline
  def apply(
    contentType: String = null,
    correlationData: Buffer = null,
    messageExpiryInterval: js.UndefOr[Double] = js.undefined,
    payloadFormatIndicator: js.UndefOr[Double] = js.undefined,
    responseTopic: String = null,
    userProperties: js.Object = null,
    willDelayInterval: js.UndefOr[Double] = js.undefined
  ): ContentType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (correlationData != null) __obj.updateDynamic("correlationData")(correlationData.asInstanceOf[js.Any])
    if (!js.isUndefined(messageExpiryInterval)) __obj.updateDynamic("messageExpiryInterval")(messageExpiryInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(payloadFormatIndicator)) __obj.updateDynamic("payloadFormatIndicator")(payloadFormatIndicator.get.asInstanceOf[js.Any])
    if (responseTopic != null) __obj.updateDynamic("responseTopic")(responseTopic.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(willDelayInterval)) __obj.updateDynamic("willDelayInterval")(willDelayInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
}

