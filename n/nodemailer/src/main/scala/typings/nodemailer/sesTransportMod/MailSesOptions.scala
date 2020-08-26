package typings.nodemailer.sesTransportMod

import typings.nodemailer.anon.Data
import typings.nodemailer.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailSesOptions extends js.Object {
  /**
    * The name of the configuration set to use when you send an email using SendRawEmail.
    */
  var ConfigurationSetName: js.UndefOr[String] = js.native
  /**
    * A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
    */
  var Destinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to specify a particular "From" address in the header of the raw email. Instead of using this parameter, you can use the X-header X-SES-FROM-ARN in the raw message of the email. If you use both the FromArn parameter and the corresponding X-header, Amazon SES uses the value of the FromArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide.
    */
  var FromArn: js.UndefOr[String] = js.native
  /**
    * The raw email message itself. The message has to meet the following criteria:   The message has to contain a header and a body, separated by a blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types, see Unsupported Attachment Types in the Amazon SES Developer Guide.   The entire message must be base64-encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, we highly recommend that you encode that content. For more information, see Sending Raw Email in the Amazon SES Developer Guide.   Per RFC 5321, the maximum length of each line of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
    */
  var RawMessage: js.UndefOr[Data] = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. Instead of using this parameter, you can use the X-header X-SES-RETURN-PATH-ARN in the raw message of the email. If you use both the ReturnPathArn parameter and the corresponding X-header, Amazon SES uses the value of the ReturnPathArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide.
    */
  var ReturnPathArn: js.UndefOr[String] = js.native
  /**
    * The identity's email address. If you do not provide a value for this parameter, you must specify a "From" address in the raw text of the message. (You can also specify both.)  Amazon SES does not support the SMTPUTF8 extension, as described inRFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described in RFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=.  If you specify the Source parameter and have feedback forwarding enabled, then bounces and complaints will be sent to this email address. This takes precedence over any Return-Path header that you might include in the raw text of the message.
    */
  var Source: js.UndefOr[String] = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. Instead of using this parameter, you can use the X-header X-SES-SOURCE-ARN in the raw message of the email. If you use both the SourceArn parameter and the corresponding X-header, Amazon SES uses the value of the SourceArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide.
    */
  var SourceArn: js.UndefOr[String] = js.native
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendRawEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var Tags: js.UndefOr[js.Array[Name]] = js.native
}

object MailSesOptions {
  @scala.inline
  def apply(): MailSesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailSesOptions]
  }
  @scala.inline
  implicit class MailSesOptionsOps[Self <: MailSesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationSetName(value: String): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationSetName: Self = this.set("ConfigurationSetName", js.undefined)
    @scala.inline
    def setDestinationsVarargs(value: String*): Self = this.set("Destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: js.Array[String]): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("Destinations", js.undefined)
    @scala.inline
    def setFromArn(value: String): Self = this.set("FromArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromArn: Self = this.set("FromArn", js.undefined)
    @scala.inline
    def setRawMessage(value: Data): Self = this.set("RawMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawMessage: Self = this.set("RawMessage", js.undefined)
    @scala.inline
    def setReturnPathArn(value: String): Self = this.set("ReturnPathArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnPathArn: Self = this.set("ReturnPathArn", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setSourceArn(value: String): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Name*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Name]): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

