package typings.mqttPacket.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationData extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var correlationData: js.UndefOr[Buffer] = js.undefined
  var messageExpiryInterval: js.UndefOr[Double] = js.undefined
  var payloadFormatIndicator: js.UndefOr[Boolean] = js.undefined
  var responseTopic: js.UndefOr[String] = js.undefined
  var subscriptionIdentifier: js.UndefOr[Double] = js.undefined
  var topicAlias: js.UndefOr[Double] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
}

object CorrelationData {
  @scala.inline
  def apply(
    contentType: String = null,
    correlationData: Buffer = null,
    messageExpiryInterval: js.UndefOr[Double] = js.undefined,
    payloadFormatIndicator: js.UndefOr[Boolean] = js.undefined,
    responseTopic: String = null,
    subscriptionIdentifier: js.UndefOr[Double] = js.undefined,
    topicAlias: js.UndefOr[Double] = js.undefined,
    userProperties: js.Object = null
  ): CorrelationData = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (correlationData != null) __obj.updateDynamic("correlationData")(correlationData.asInstanceOf[js.Any])
    if (!js.isUndefined(messageExpiryInterval)) __obj.updateDynamic("messageExpiryInterval")(messageExpiryInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(payloadFormatIndicator)) __obj.updateDynamic("payloadFormatIndicator")(payloadFormatIndicator.get.asInstanceOf[js.Any])
    if (responseTopic != null) __obj.updateDynamic("responseTopic")(responseTopic.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriptionIdentifier)) __obj.updateDynamic("subscriptionIdentifier")(subscriptionIdentifier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topicAlias)) __obj.updateDynamic("topicAlias")(topicAlias.get.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationData]
  }
}

