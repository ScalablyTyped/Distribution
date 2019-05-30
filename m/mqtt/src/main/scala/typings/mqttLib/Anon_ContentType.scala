package typings
package mqttLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var correlationData: js.UndefOr[nodeLib.Buffer] = js.undefined
  var messageExpiryInterval: js.UndefOr[scala.Double] = js.undefined
  var payloadFormatIndicator: js.UndefOr[scala.Double] = js.undefined
  var responseTopic: js.UndefOr[java.lang.String] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
  var willDelayInterval: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ContentType {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    correlationData: nodeLib.Buffer = null,
    messageExpiryInterval: scala.Int | scala.Double = null,
    payloadFormatIndicator: scala.Int | scala.Double = null,
    responseTopic: java.lang.String = null,
    userProperties: js.Object = null,
    willDelayInterval: scala.Int | scala.Double = null
  ): Anon_ContentType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (correlationData != null) __obj.updateDynamic("correlationData")(correlationData)
    if (messageExpiryInterval != null) __obj.updateDynamic("messageExpiryInterval")(messageExpiryInterval.asInstanceOf[js.Any])
    if (payloadFormatIndicator != null) __obj.updateDynamic("payloadFormatIndicator")(payloadFormatIndicator.asInstanceOf[js.Any])
    if (responseTopic != null) __obj.updateDynamic("responseTopic")(responseTopic)
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties)
    if (willDelayInterval != null) __obj.updateDynamic("willDelayInterval")(willDelayInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContentType]
  }
}

