package typings.nodemailer

import typings.node.eventsMod.EventEmitter
import typings.nodemailer.anon.Callback
import typings.nodemailer.anon.Data
import typings.nodemailer.anon.Name
import typings.nodemailer.anon.Pending
import typings.nodemailer.libMailerMod.Address
import typings.nodemailer.libMimeNodeMod.Envelope
import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.mod.Transport
import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.nodemailerStrings.idle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSesTransportMod {
  
  @JSImport("nodemailer/lib/ses-transport", JSImport.Namespace)
  @js.native
  open class ^ protected () extends SESTransport {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def send(
      mail: typings.nodemailer.libMailerMailMessageMod.^[SentMessageInfo],
      callback: js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  
  trait MailOptions
    extends StObject
       with typings.nodemailer.libMailerMod.Options {
    
    /** list of keys that SendRawEmail method can take */
    var ses: js.UndefOr[MailSesOptions] = js.undefined
  }
  object MailOptions {
    
    inline def apply(): MailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailOptions] (val x: Self) extends AnyVal {
      
      inline def setSes(value: MailSesOptions): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
      
      inline def setSesUndefined: Self = StObject.set(x, "ses", js.undefined)
    }
  }
  
  trait MailSesOptions extends StObject {
    
    /**
      * The name of the configuration set to use when you send an email using SendRawEmail.
      */
    var ConfigurationSetName: js.UndefOr[String] = js.undefined
    
    /**
      * A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
      */
    var Destinations: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to specify a particular "From" address in the header of the raw email. Instead of using this parameter, you can use the X-header X-SES-FROM-ARN in the raw message of the email. If you use both the FromArn parameter and the corresponding X-header, Amazon SES uses the value of the FromArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide.
      */
    var FromArn: js.UndefOr[String] = js.undefined
    
    /**
      * The raw email message itself. The message has to meet the following criteria:   The message has to contain a header and a body, separated by a blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types, see Unsupported Attachment Types in the Amazon SES Developer Guide.   The entire message must be base64-encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, we highly recommend that you encode that content. For more information, see Sending Raw Email in the Amazon SES Developer Guide.   Per RFC 5321, the maximum length of each line of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
      */
    var RawMessage: js.UndefOr[Data] = js.undefined
    
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. Instead of using this parameter, you can use the X-header X-SES-RETURN-PATH-ARN in the raw message of the email. If you use both the ReturnPathArn parameter and the corresponding X-header, Amazon SES uses the value of the ReturnPathArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide.
      */
    var ReturnPathArn: js.UndefOr[String] = js.undefined
    
    /**
      * The identity's email address. If you do not provide a value for this parameter, you must specify a "From" address in the raw text of the message. (You can also specify both.)  Amazon SES does not support the SMTPUTF8 extension, as described inRFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described in RFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=.  If you specify the Source parameter and have feedback forwarding enabled, then bounces and complaints will be sent to this email address. This takes precedence over any Return-Path header that you might include in the raw text of the message.
      */
    var Source: js.UndefOr[String] = js.undefined
    
    /**
      * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. Instead of using this parameter, you can use the X-header X-SES-SOURCE-ARN in the raw message of the email. If you use both the SourceArn parameter and the corresponding X-header, Amazon SES uses the value of the SourceArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide.
      */
    var SourceArn: js.UndefOr[String] = js.undefined
    
    /**
      * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendRawEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
      */
    var Tags: js.UndefOr[js.Array[Name]] = js.undefined
  }
  object MailSesOptions {
    
    inline def apply(): MailSesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailSesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailSesOptions] (val x: Self) extends AnyVal {
      
      inline def setConfigurationSetName(value: String): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
      
      inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
      
      inline def setDestinations(value: js.Array[String]): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
      
      inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
      
      inline def setDestinationsVarargs(value: String*): Self = StObject.set(x, "Destinations", js.Array(value*))
      
      inline def setFromArn(value: String): Self = StObject.set(x, "FromArn", value.asInstanceOf[js.Any])
      
      inline def setFromArnUndefined: Self = StObject.set(x, "FromArn", js.undefined)
      
      inline def setRawMessage(value: Data): Self = StObject.set(x, "RawMessage", value.asInstanceOf[js.Any])
      
      inline def setRawMessageUndefined: Self = StObject.set(x, "RawMessage", js.undefined)
      
      inline def setReturnPathArn(value: String): Self = StObject.set(x, "ReturnPathArn", value.asInstanceOf[js.Any])
      
      inline def setReturnPathArnUndefined: Self = StObject.set(x, "ReturnPathArn", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
      
      inline def setSourceArn(value: String): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
      
      inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
      
      inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
      
      inline def setTags(value: js.Array[Name]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: Name*): Self = StObject.set(x, "Tags", js.Array(value*))
    }
  }
  
  trait Options
    extends StObject
       with MailOptions
       with TransportOptions {
    
    /** is an option that expects an instantiated aws.SES object */
    var SES: Any
    
    // aws-sdk.SES object
    /** How many messages per second is allowed to be delivered to SES */
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    /** How many parallel connections to allow towards SES */
    var sendingRate: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(SES: Any): Options = {
      val __obj = js.Dynamic.literal(SES = SES.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setSES(value: Any): Self = StObject.set(x, "SES", value.asInstanceOf[js.Any])
      
      inline def setSendingRate(value: Double): Self = StObject.set(x, "sendingRate", value.asInstanceOf[js.Any])
      
      inline def setSendingRateUndefined: Self = StObject.set(x, "sendingRate", js.undefined)
    }
  }
  
  @js.native
  trait SESTransport
    extends EventEmitter
       with Transport[SentMessageInfo] {
    
    @JSName("addListener")
    def addListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    var connections: Double = js.native
    
    @JSName("emit")
    def emit_idle(event: idle): Boolean = js.native
    
    var idling: Boolean = js.native
    
    /** Returns true if there are free slots in the queue */
    def isIdle(): Boolean = js.native
    
    @JSName("listeners")
    def listeners_idle(event: idle): js.Array[js.Function0[Unit]] = js.native
    
    var logger: Logger = js.native
    
    @JSName("mailer")
    var mailer_SESTransport: typings.nodemailer.libMailerMod.^[SentMessageInfo] = js.native
    
    var maxConnections: Double = js.native
    
    @JSName("on")
    def on_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    var options: Options = js.native
    
    var pending: js.Array[Callback] = js.native
    
    @JSName("prependListener")
    def prependListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    var rateInterval: Double = js.native
    
    var rateMessages: js.Array[Pending] = js.native
    
    var sendingRate: Double = js.native
    
    var sendingRateTTL: Double | Null = js.native
    
    var ses: Any = js.native
    
    @JSName("verify")
    def verify_MSESTransport(): js.Promise[`true`] = js.native
    /** Verifies SES configuration */
    @JSName("verify")
    def verify_true(callback: js.Function2[/* err */ js.Error | Null, `true`, Unit]): Unit = js.native
  }
  
  trait SentMessageInfo extends StObject {
    
    var accepted: js.Array[String | Address]
    
    /** an envelope object {from:‘address’, to:[‘address’]} */
    var envelope: Envelope
    
    /** the Message-ID header value. This value is derived from the response of SES API, so it differs from the Message-ID values used in logging. */
    var messageId: String
    
    var pending: js.Array[String | Address]
    
    var rejected: js.Array[String | Address]
    
    var response: String
  }
  object SentMessageInfo {
    
    inline def apply(
      accepted: js.Array[String | Address],
      envelope: Envelope,
      messageId: String,
      pending: js.Array[String | Address],
      rejected: js.Array[String | Address],
      response: String
    ): SentMessageInfo = {
      val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
      
      inline def setAccepted(value: js.Array[String | Address]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      inline def setAcceptedVarargs(value: (String | Address)*): Self = StObject.set(x, "accepted", js.Array(value*))
      
      inline def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setPending(value: js.Array[String | Address]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingVarargs(value: (String | Address)*): Self = StObject.set(x, "pending", js.Array(value*))
      
      inline def setRejected(value: js.Array[String | Address]): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRejectedVarargs(value: (String | Address)*): Self = StObject.set(x, "rejected", js.Array(value*))
      
      inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
