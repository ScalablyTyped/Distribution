package typings.mqttDashPacket

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTypeCorrelationData extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var correlationData: js.UndefOr[Buffer] = js.undefined
  var messageExpiryInterval: js.UndefOr[Double] = js.undefined
  var payloadFormatIndicator: js.UndefOr[Boolean] = js.undefined
  var responseTopic: js.UndefOr[String] = js.undefined
  var subscriptionIdentifier: js.UndefOr[Double] = js.undefined
  var topicAlias: js.UndefOr[Double] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
}

object Anon_ContentTypeCorrelationData {
  @scala.inline
  def apply(
    contentType: String = null,
    correlationData: Buffer = null,
    messageExpiryInterval: Int | Double = null,
    payloadFormatIndicator: js.UndefOr[Boolean] = js.undefined,
    responseTopic: String = null,
    subscriptionIdentifier: Int | Double = null,
    topicAlias: Int | Double = null,
    userProperties: js.Object = null
  ): Anon_ContentTypeCorrelationData = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (correlationData != null) __obj.updateDynamic("correlationData")(correlationData)
    if (messageExpiryInterval != null) __obj.updateDynamic("messageExpiryInterval")(messageExpiryInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(payloadFormatIndicator)) __obj.updateDynamic("payloadFormatIndicator")(payloadFormatIndicator)
    if (responseTopic != null) __obj.updateDynamic("responseTopic")(responseTopic)
    if (subscriptionIdentifier != null) __obj.updateDynamic("subscriptionIdentifier")(subscriptionIdentifier.asInstanceOf[js.Any])
    if (topicAlias != null) __obj.updateDynamic("topicAlias")(topicAlias.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties)
    __obj.asInstanceOf[Anon_ContentTypeCorrelationData]
  }
}

