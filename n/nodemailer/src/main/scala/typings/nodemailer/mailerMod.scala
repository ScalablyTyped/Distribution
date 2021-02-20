package typings.nodemailer

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.node.streamMod.Readable
import typings.node.urlMod.Url
import typings.nodemailer.anon.Comment
import typings.nodemailer.anon.Prepared
import typings.nodemailer.anon.Value
import typings.nodemailer.mod.SentMessageInfo
import typings.nodemailer.mod.Transport
import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.nodemailerStrings.`7bit`
import typings.nodemailer.nodemailerStrings.`inline`
import typings.nodemailer.nodemailerStrings.`quoted-printable`
import typings.nodemailer.nodemailerStrings.attachment
import typings.nodemailer.nodemailerStrings.base64
import typings.nodemailer.nodemailerStrings.end
import typings.nodemailer.nodemailerStrings.error
import typings.nodemailer.nodemailerStrings.high
import typings.nodemailer.nodemailerStrings.idle
import typings.nodemailer.nodemailerStrings.low
import typings.nodemailer.nodemailerStrings.normal
import typings.nodemailer.nodemailerStrings.oauth2_provision_cb
import typings.nodemailer.nodemailerStrings.proxy_handler_http
import typings.nodemailer.nodemailerStrings.proxy_handler_https
import typings.nodemailer.nodemailerStrings.proxy_handler_socks
import typings.nodemailer.nodemailerStrings.proxy_handler_socks4
import typings.nodemailer.nodemailerStrings.proxy_handler_socks4a
import typings.nodemailer.nodemailerStrings.proxy_handler_socks5
import typings.nodemailer.nodemailerStrings.token
import typings.nodemailer.sharedMod.Logger
import typings.nodemailer.xoauth2Mod.Token
import typings.std.Date
import typings.std.Error
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailerMod {
  
  /** Creates an object for exposing the Mail API */
  @JSImport("nodemailer/lib/mailer", JSImport.Namespace)
  @js.native
  class ^ protected () extends Mail {
    def this(transporter: Transport) = this()
    def this(transporter: Transport, options: TransportOptions) = this()
    def this(transporter: Transport, options: js.UndefOr[scala.Nothing], defaults: TransportOptions) = this()
    def this(transporter: Transport, options: TransportOptions, defaults: TransportOptions) = this()
  }
  
  @js.native
  trait Address extends StObject {
    
    var address: String = js.native
    
    var name: String = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: String, name: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AmpAttachment extends AttachmentLike {
    
    /** optional content type for the attachment, if not set will be derived from the filename property */
    var contentType: js.UndefOr[String] = js.native
    
    /** defines optional content encoding, eg. ‘base64’ or ‘hex’. This only applies if the content is a string. By default an unicode string is assumed. */
    var encoding: js.UndefOr[String] = js.native
    
    /** is an alternative for content to load the AMP4EMAIL data from an URL */
    var href: js.UndefOr[String] = js.native
    
    /** an optional value that overrides entire node content in the mime message. If used then all other options set for this node are ignored. */
    var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
  }
  object AmpAttachment {
    
    @scala.inline
    def apply(): AmpAttachment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmpAttachment]
    }
    
    @scala.inline
    implicit class AmpAttachmentMutableBuilder[Self <: AmpAttachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setRaw(value: String | Buffer | Readable | AttachmentLike): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait Attachment extends AttachmentLike {
    
    /** optional content id for using inline images in HTML message source. Using cid sets the default contentDisposition to 'inline' and moves the attachment into a multipart/related mime node, so use it only if you actually want to use this attachment as an embedded image */
    var cid: js.UndefOr[String] = js.native
    
    /** optional content disposition type for the attachment, defaults to ‘attachment’ */
    var contentDisposition: js.UndefOr[attachment | `inline`] = js.native
    
    /** optional transfer encoding for the attachment, if not set it will be derived from the contentType property. Example values: quoted-printable, base64. If it is unset then base64 encoding is used for the attachment. If it is set to false then previous default applies (base64 for most, 7bit for text). */
    var contentTransferEncoding: js.UndefOr[`7bit` | base64 | `quoted-printable` | `false`] = js.native
    
    /** optional content type for the attachment, if not set will be derived from the filename property */
    var contentType: js.UndefOr[String] = js.native
    
    /** If set and content is string, then encodes the content to a Buffer using the specified encoding. Example values: base64, hex, binary etc. Useful if you want to use binary attachments in a JSON formatted e-mail object */
    var encoding: js.UndefOr[String] = js.native
    
    /** filename to be reported as the name of the attached file, use of unicode is allowed. If you do not want to use a filename, set this value as false, otherwise a filename is generated automatically */
    var filename: js.UndefOr[String | `false`] = js.native
    
    /** is an object of additional headers */
    var headers: js.UndefOr[Headers] = js.native
    
    /** an optional value that overrides entire node content in the mime message. If used then all other options set for this node are ignored. */
    var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
  }
  object Attachment {
    
    @scala.inline
    def apply(): Attachment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attachment]
    }
    
    @scala.inline
    implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      @scala.inline
      def setContentDisposition(value: attachment | `inline`): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      @scala.inline
      def setContentTransferEncoding(value: `7bit` | base64 | `quoted-printable` | `false`): Self = StObject.set(x, "contentTransferEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTransferEncodingUndefined: Self = StObject.set(x, "contentTransferEncoding", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFilename(value: String | `false`): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: Value*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setRaw(value: String | Buffer | Readable | AttachmentLike): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait AttachmentLike extends StObject {
    
    /** String, Buffer or a Stream contents for the attachmentent */
    var content: js.UndefOr[String | Buffer | Readable] = js.native
    
    /** path to a file or an URL (data uris are allowed as well) if you want to stream the file instead of including it (better for larger attachments) */
    var path: js.UndefOr[String | Url] = js.native
  }
  object AttachmentLike {
    
    @scala.inline
    def apply(): AttachmentLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachmentLike]
    }
    
    @scala.inline
    implicit class AttachmentLikeMutableBuilder[Self <: AttachmentLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String | Buffer | Readable): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setPath(value: String | Url): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait Connection extends StObject {
    
    var connection: Socket = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(connection: Socket): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Envelope extends StObject {
    
    /** addresses from this value get added to RCPT TO list */
    var bcc: js.UndefOr[String] = js.native
    
    /** addresses from this value get added to RCPT TO list */
    var cc: js.UndefOr[String] = js.native
    
    /** the first address gets used as MAIL FROM address in SMTP */
    var from: js.UndefOr[String] = js.native
    
    /** addresses from this value get added to RCPT TO list */
    var to: js.UndefOr[String] = js.native
  }
  object Envelope {
    
    @scala.inline
    def apply(): Envelope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Envelope]
    }
    
    @scala.inline
    implicit class EnvelopeMutableBuilder[Self <: Envelope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBcc(value: String): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      @scala.inline
      def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type Headers = (StringDictionary[String | js.Array[String] | Prepared]) | js.Array[Value]
  
  @js.native
  trait IcalAttachment extends AttachmentLike {
    
    /** defines optional content encoding, eg. ‘base64’ or ‘hex’. This only applies if the content is a string. By default an unicode string is assumed. */
    var encoding: js.UndefOr[String] = js.native
    
    /** optional filename, defaults to ‘invite.ics’ */
    var filename: js.UndefOr[String | `false`] = js.native
    
    /** is an alternative for content to load the calendar data from an URL */
    var href: js.UndefOr[String] = js.native
    
    /** optional method, case insensitive, defaults to ‘publish’. Other possible values would be ‘request’, ‘reply’, ‘cancel’ or any other valid calendar method listed in RFC5546. This should match the METHOD: value in calendar event file. */
    var method: js.UndefOr[String] = js.native
  }
  object IcalAttachment {
    
    @scala.inline
    def apply(): IcalAttachment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IcalAttachment]
    }
    
    @scala.inline
    implicit class IcalAttachmentMutableBuilder[Self <: IcalAttachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFilename(value: String | `false`): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  type ListHeader = String | Comment
  
  type ListHeaders = StringDictionary[ListHeader | (js.Array[js.Array[ListHeader] | ListHeader])]
  
  /** Creates an object for exposing the Mail API */
  @js.native
  trait Mail extends EventEmitter {
    
    /** Usage: typeof transporter.MailMessage */
    var MailMessage: typings.nodemailer.mailMessageMod.^ = js.native
    
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    
    /** Closes all connections in the pool. If there is a message being sent, the connection is closed later */
    def close(): Unit = js.native
    
    var dkim: typings.nodemailer.dkimMod.^ = js.native
    
    @JSName("emit")
    def emit_error(event: error, error: Error): Boolean = js.native
    @JSName("emit")
    def emit_idle(event: idle): Boolean = js.native
    @JSName("emit")
    def emit_token(event: token, token: Token): Boolean = js.native
    
    def get(key: String): js.Any = js.native
    
    def getVersionString(): String = js.native
    
    @JSName("get")
    def get_oauth2provisioncb(key: oauth2_provision_cb): js.Function3[
        /* user */ String, 
        /* renew */ Boolean, 
        /* callback */ js.Function3[/* err */ Error | Null, /* accessToken */ String, /* expires */ Double, Unit], 
        Unit
      ] = js.native
    @JSName("get")
    def get_proxyhandlerhttp(key: proxy_handler_http): js.Function3[
        /* proxy */ Url, 
        /* options */ TransportOptions, 
        /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ typings.nodemailer.anon.Connection, Unit], 
        Unit
      ] = js.native
    @JSName("get")
    def get_proxyhandlerhttps(key: proxy_handler_https): js.Function3[
        /* proxy */ Url, 
        /* options */ TransportOptions, 
        /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ typings.nodemailer.anon.Connection, Unit], 
        Unit
      ] = js.native
    @JSName("get")
    def get_proxyhandlersocks(key: proxy_handler_socks): js.Function3[
        /* proxy */ Url, 
        /* options */ TransportOptions, 
        /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ typings.nodemailer.anon.Connection, Unit], 
        Unit
      ] = js.native
    @JSName("get")
    def get_proxyhandlersocks4(key: proxy_handler_socks4): js.Function3[
        /* proxy */ Url, 
        /* options */ TransportOptions, 
        /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ typings.nodemailer.anon.Connection, Unit], 
        Unit
      ] = js.native
    @JSName("get")
    def get_proxyhandlersocks4a(key: proxy_handler_socks4a): js.Function3[
        /* proxy */ Url, 
        /* options */ TransportOptions, 
        /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ typings.nodemailer.anon.Connection, Unit], 
        Unit
      ] = js.native
    @JSName("get")
    def get_proxyhandlersocks5(key: proxy_handler_socks5): js.Function3[
        /* proxy */ Url, 
        /* options */ TransportOptions, 
        /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ typings.nodemailer.anon.Connection, Unit], 
        Unit
      ] = js.native
    
    /** Returns true if there are free slots in the queue */
    def isIdle(): Boolean = js.native
    
    @JSName("listeners")
    def listeners_end(event: end): js.Array[js.Function1[/* token */ Token, Unit]] = js.native
    @JSName("listeners")
    def listeners_error(event: error): js.Array[js.Function1[/* err */ Error, Unit]] = js.native
    @JSName("listeners")
    def listeners_idle(event: idle): js.Array[js.Function0[Unit]] = js.native
    
    var logger: Logger = js.native
    
    var meta: Map[String, _] = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    
    var options: Options = js.native
    
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
    
    def sendMail(mailOptions: Options): js.Promise[SentMessageInfo] = js.native
    /** Sends an email using the preselected transport object */
    def sendMail(
      mailOptions: Options,
      callback: js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]
    ): Unit = js.native
    
    def set(key: String, value: js.Any): Map[String, _] = js.native
    @JSName("set")
    def set_oauth2provisioncb(
      key: oauth2_provision_cb,
      value: js.Function3[
          /* user */ String, 
          /* renew */ Boolean, 
          /* callback */ js.Function3[
            /* err */ Error | Null, 
            /* accessToken */ js.UndefOr[String], 
            /* expires */ js.UndefOr[Double], 
            Unit
          ], 
          Unit
        ]
    ): Map[String, _] = js.native
    @JSName("set")
    def set_proxyhandlerhttp(
      key: proxy_handler_http,
      value: js.Function3[
          /* proxy */ Url, 
          /* options */ TransportOptions, 
          /* callback */ js.Function2[
            /* err */ Error | Null, 
            /* socketOptions */ js.UndefOr[typings.nodemailer.anon.Connection], 
            Unit
          ], 
          Unit
        ]
    ): Map[String, _] = js.native
    @JSName("set")
    def set_proxyhandlerhttps(
      key: proxy_handler_https,
      value: js.Function3[
          /* proxy */ Url, 
          /* options */ TransportOptions, 
          /* callback */ js.Function2[
            /* err */ Error | Null, 
            /* socketOptions */ js.UndefOr[typings.nodemailer.anon.Connection], 
            Unit
          ], 
          Unit
        ]
    ): Map[String, _] = js.native
    @JSName("set")
    def set_proxyhandlersocks(
      key: proxy_handler_socks,
      value: js.Function3[
          /* proxy */ Url, 
          /* options */ TransportOptions, 
          /* callback */ js.Function2[
            /* err */ Error | Null, 
            /* socketOptions */ js.UndefOr[typings.nodemailer.anon.Connection], 
            Unit
          ], 
          Unit
        ]
    ): Map[String, _] = js.native
    @JSName("set")
    def set_proxyhandlersocks4(
      key: proxy_handler_socks4,
      value: js.Function3[
          /* proxy */ Url, 
          /* options */ TransportOptions, 
          /* callback */ js.Function2[
            /* err */ Error | Null, 
            /* socketOptions */ js.UndefOr[typings.nodemailer.anon.Connection], 
            Unit
          ], 
          Unit
        ]
    ): Map[String, _] = js.native
    @JSName("set")
    def set_proxyhandlersocks4a(
      key: proxy_handler_socks4a,
      value: js.Function3[
          /* proxy */ Url, 
          /* options */ TransportOptions, 
          /* callback */ js.Function2[
            /* err */ Error | Null, 
            /* socketOptions */ js.UndefOr[typings.nodemailer.anon.Connection], 
            Unit
          ], 
          Unit
        ]
    ): Map[String, _] = js.native
    @JSName("set")
    def set_proxyhandlersocks5(
      key: proxy_handler_socks5,
      value: js.Function3[
          /* proxy */ Url, 
          /* options */ TransportOptions, 
          /* callback */ js.Function2[
            /* err */ Error | Null, 
            /* socketOptions */ js.UndefOr[typings.nodemailer.anon.Connection], 
            Unit
          ], 
          Unit
        ]
    ): Map[String, _] = js.native
    
    /** Sets up proxy handler for a Nodemailer object */
    def setupProxy(proxyUrl: String): Unit = js.native
    
    var transporter: Transport = js.native
    
    def use(step: String, plugin: PluginFunction): this.type = js.native
    
    def verify(): js.Promise[`true`] = js.native
    /** Verifies SMTP configuration */
    @JSName("verify")
    def verify_true(callback: js.Function2[/* err */ Error | Null, `true`, Unit]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /** An array of alternative text contents (in addition to text and html parts) */
    var alternatives: js.UndefOr[js.Array[Attachment]] = js.native
    
    /** AMP4EMAIL specific HTML version of the message, same usage as with text and html. Make sure it is a full and valid AMP4EMAIL document, otherwise the displaying email client falls back to html and ignores the amp part */
    var amp: js.UndefOr[String | Buffer | Readable | AmpAttachment] = js.native
    
    /** An array of attachment objects */
    var attachments: js.UndefOr[js.Array[Attachment]] = js.native
    
    /** Comma separated list or an array of recipients e-mail addresses that will appear on the Bcc: field */
    var bcc: js.UndefOr[String | Address | (js.Array[String | Address])] = js.native
    
    /** Comma separated list or an array of recipients e-mail addresses that will appear on the Cc: field */
    var cc: js.UndefOr[String | Address | (js.Array[String | Address])] = js.native
    
    /** optional Date value, current UTC string will be used if not set */
    var date: js.UndefOr[Date | String] = js.native
    
    /** if set to true then fails with an error when a node tries to load content from a file */
    var disableFileAccess: js.UndefOr[Boolean] = js.native
    
    /** if set to true then fails with an error when a node tries to load content from URL */
    var disableUrlAccess: js.UndefOr[Boolean] = js.native
    
    /** is an object with DKIM options */
    var dkim: js.UndefOr[typings.nodemailer.dkimMod.Options] = js.native
    
    /** optional transfer encoding for the textual parts */
    var encoding: js.UndefOr[String] = js.native
    
    /** optional SMTP envelope, if auto generated envelope is not suitable */
    var envelope: js.UndefOr[Envelope | typings.nodemailer.mimeNodeMod.Envelope] = js.native
    
    /** The e-mail address of the sender. All e-mail addresses can be plain 'sender@server.com' or formatted 'Sender Name <sender@server.com>' */
    var from: js.UndefOr[String | Address] = js.native
    
    /** An object or array of additional header fields */
    var headers: js.UndefOr[Headers] = js.native
    
    /** The HTML version of the message */
    var html: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
    
    /** iCalendar event, same usage as with text and html. Event method attribute defaults to ‘PUBLISH’ or define it yourself: {method: 'REQUEST', content: iCalString}. This value is added as an additional alternative to html or text. Only utf-8 content is allowed */
    var icalEvent: js.UndefOr[String | Buffer | Readable | IcalAttachment] = js.native
    
    /** The message-id this message is replying */
    var inReplyTo: js.UndefOr[String | Address] = js.native
    
    /** An object where key names are converted into list headers. List key help becomes List-Help header etc. */
    var list: js.UndefOr[ListHeaders] = js.native
    
    /** optional Message-Id value, random value will be generated if not set */
    var messageId: js.UndefOr[String] = js.native
    
    /** method to normalize header keys for custom caseing */
    var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
    
    var priority: js.UndefOr[high | normal | low] = js.native
    
    /** if set then overwrites entire message output with this value. The value is not parsed, so you should still set address headers or the envelope value for the message to work */
    var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
    
    /** Message-id list (an array or space separated string) */
    var references: js.UndefOr[String | js.Array[String]] = js.native
    
    /** An e-mail address that will appear on the Reply-To: field */
    var replyTo: js.UndefOr[String | Address] = js.native
    
    /** An e-mail address that will appear on the Sender: field */
    var sender: js.UndefOr[String | Address] = js.native
    
    /** The subject of the e-mail */
    var subject: js.UndefOr[String] = js.native
    
    /** The plaintext version of the message */
    var text: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
    
    /** set explicitly which encoding to use for text parts (quoted-printable or base64). If not set then encoding is detected from text content (mostly ascii means quoted-printable, otherwise base64) */
    var textEncoding: js.UndefOr[TextEncoding] = js.native
    
    /** Comma separated list or an array of recipients e-mail addresses that will appear on the To: field */
    var to: js.UndefOr[String | Address | (js.Array[String | Address])] = js.native
    
    /** Apple Watch specific HTML version of the message, same usage as with text and html */
    var watchHtml: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternatives(value: js.Array[Attachment]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
      
      @scala.inline
      def setAlternativesVarargs(value: Attachment*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
      
      @scala.inline
      def setAmp(value: String | Buffer | Readable | AmpAttachment): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      
      @scala.inline
      def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      @scala.inline
      def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setBcc(value: String | Address | (js.Array[String | Address])): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      @scala.inline
      def setBccVarargs(value: (String | Address)*): Self = StObject.set(x, "bcc", js.Array(value :_*))
      
      @scala.inline
      def setCc(value: String | Address | (js.Array[String | Address])): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      @scala.inline
      def setCcVarargs(value: (String | Address)*): Self = StObject.set(x, "cc", js.Array(value :_*))
      
      @scala.inline
      def setDate(value: Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDisableFileAccess(value: Boolean): Self = StObject.set(x, "disableFileAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFileAccessUndefined: Self = StObject.set(x, "disableFileAccess", js.undefined)
      
      @scala.inline
      def setDisableUrlAccess(value: Boolean): Self = StObject.set(x, "disableUrlAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUrlAccessUndefined: Self = StObject.set(x, "disableUrlAccess", js.undefined)
      
      @scala.inline
      def setDkim(value: typings.nodemailer.dkimMod.Options): Self = StObject.set(x, "dkim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDkimUndefined: Self = StObject.set(x, "dkim", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnvelope(value: Envelope | typings.nodemailer.mimeNodeMod.Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
      
      @scala.inline
      def setFrom(value: String | Address): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: Value*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: String | Buffer | Readable | AttachmentLike): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setIcalEvent(value: String | Buffer | Readable | IcalAttachment): Self = StObject.set(x, "icalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcalEventUndefined: Self = StObject.set(x, "icalEvent", js.undefined)
      
      @scala.inline
      def setInReplyTo(value: String | Address): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
      
      @scala.inline
      def setList(value: ListHeaders): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      @scala.inline
      def setNormalizeHeaderKey(value: /* key */ String => String): Self = StObject.set(x, "normalizeHeaderKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNormalizeHeaderKeyUndefined: Self = StObject.set(x, "normalizeHeaderKey", js.undefined)
      
      @scala.inline
      def setPriority(value: high | normal | low): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setRaw(value: String | Buffer | Readable | AttachmentLike): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setReferences(value: String | js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      @scala.inline
      def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
      
      @scala.inline
      def setReplyTo(value: String | Address): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      @scala.inline
      def setSender(value: String | Address): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setText(value: String | Buffer | Readable | AttachmentLike): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextEncoding(value: TextEncoding): Self = StObject.set(x, "textEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextEncodingUndefined: Self = StObject.set(x, "textEncoding", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTo(value: String | Address | (js.Array[String | Address])): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setToVarargs(value: (String | Address)*): Self = StObject.set(x, "to", js.Array(value :_*))
      
      @scala.inline
      def setWatchHtml(value: String | Buffer | Readable | AttachmentLike): Self = StObject.set(x, "watchHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchHtmlUndefined: Self = StObject.set(x, "watchHtml", js.undefined)
    }
  }
  
  type PluginFunction = js.Function2[
    /* mail */ typings.nodemailer.mailMessageMod.^, 
    /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodemailer.nodemailerStrings.`quoted-printable`
    - typings.nodemailer.nodemailerStrings.base64
  */
  trait TextEncoding extends StObject
  object TextEncoding {
    
    @scala.inline
    def base64: typings.nodemailer.nodemailerStrings.base64 = "base64".asInstanceOf[typings.nodemailer.nodemailerStrings.base64]
    
    @scala.inline
    def `quoted-printable`: typings.nodemailer.nodemailerStrings.`quoted-printable` = "quoted-printable".asInstanceOf[typings.nodemailer.nodemailerStrings.`quoted-printable`]
  }
}
