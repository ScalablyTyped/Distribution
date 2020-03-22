package typings.pagerJackrabbit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amqplib.amqplib.Options.Publish & {  key  :string,   reply ? :@pager/jackrabbit.@pager/jackrabbit.AckCallback} */
trait PublishOptions extends js.Object {
  var BCC: js.UndefOr[String | js.Array[String]] = js.undefined
  var CC: js.UndefOr[String | js.Array[String]] = js.undefined
  var appId: js.UndefOr[String] = js.undefined
  var contentEncoding: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var correlationId: js.UndefOr[String] = js.undefined
  var deliveryMode: js.UndefOr[Boolean | Double] = js.undefined
  var expiration: js.UndefOr[String | Double] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var key: String
  var mandatory: js.UndefOr[Boolean] = js.undefined
  var messageId: js.UndefOr[String] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var reply: js.UndefOr[AckCallback] = js.undefined
  var replyTo: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object PublishOptions {
  @scala.inline
  def apply(
    key: String,
    BCC: String | js.Array[String] = null,
    CC: String | js.Array[String] = null,
    appId: String = null,
    contentEncoding: String = null,
    contentType: String = null,
    correlationId: String = null,
    deliveryMode: Boolean | Double = null,
    expiration: String | Double = null,
    headers: js.Any = null,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    messageId: String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null,
    reply: /* data */ js.UndefOr[js.Any] => Unit = null,
    replyTo: String = null,
    timestamp: Int | Double = null,
    `type`: String = null,
    userId: String = null
  ): PublishOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (BCC != null) __obj.updateDynamic("BCC")(BCC.asInstanceOf[js.Any])
    if (CC != null) __obj.updateDynamic("CC")(CC.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (deliveryMode != null) __obj.updateDynamic("deliveryMode")(deliveryMode.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reply != null) __obj.updateDynamic("reply")(js.Any.fromFunction1(reply))
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishOptions]
  }
}

