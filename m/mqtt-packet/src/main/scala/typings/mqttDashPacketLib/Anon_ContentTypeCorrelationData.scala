package typings
package mqttDashPacketLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTypeCorrelationData extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var correlationData: js.UndefOr[nodeLib.Buffer] = js.undefined
  var messageExpiryInterval: js.UndefOr[scala.Double] = js.undefined
  var payloadFormatIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var responseTopic: js.UndefOr[java.lang.String] = js.undefined
  var subscriptionIdentifier: js.UndefOr[scala.Double] = js.undefined
  var topicAlias: js.UndefOr[scala.Double] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
}

object Anon_ContentTypeCorrelationData {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    correlationData: nodeLib.Buffer = null,
    messageExpiryInterval: scala.Int | scala.Double = null,
    payloadFormatIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    responseTopic: java.lang.String = null,
    subscriptionIdentifier: scala.Int | scala.Double = null,
    topicAlias: scala.Int | scala.Double = null,
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

