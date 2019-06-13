package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitedUserMessageInfo extends js.Object {
  /** Additional recipients the invitation message should be sent to. Currently only 1 additional recipient is supported. */
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  /** Customized message body you want to send if you don't want the default message. */
  var customizedMessageBody: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The language you want to send the default message in. If the customizedMessageBody is specified, this property is ignored, and the message is sent using the customizedMessageBody.
    * The language format should be in ISO 639. The default is en-US.
    */
  var messageLanguage: js.UndefOr[java.lang.String] = js.undefined
}

object InvitedUserMessageInfo {
  @scala.inline
  def apply(
    ccRecipients: js.Array[Recipient] = null,
    customizedMessageBody: java.lang.String = null,
    messageLanguage: java.lang.String = null
  ): InvitedUserMessageInfo = {
    val __obj = js.Dynamic.literal()
    if (ccRecipients != null) __obj.updateDynamic("ccRecipients")(ccRecipients)
    if (customizedMessageBody != null) __obj.updateDynamic("customizedMessageBody")(customizedMessageBody)
    if (messageLanguage != null) __obj.updateDynamic("messageLanguage")(messageLanguage)
    __obj.asInstanceOf[InvitedUserMessageInfo]
  }
}

