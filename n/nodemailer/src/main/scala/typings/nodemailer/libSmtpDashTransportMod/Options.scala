package typings.nodemailer.libSmtpDashTransportMod

import typings.node.Buffer
import typings.node.netMod.Socket
import typings.node.streamMod.Readable
import typings.node.tlsMod.ConnectionOptions
import typings.nodemailer.libMailerMod.Address
import typings.nodemailer.libMailerMod.AmpAttachment
import typings.nodemailer.libMailerMod.Attachment
import typings.nodemailer.libMailerMod.AttachmentLike
import typings.nodemailer.libMailerMod.Envelope
import typings.nodemailer.libMailerMod.Headers
import typings.nodemailer.libMailerMod.IcalAttachment
import typings.nodemailer.libMailerMod.ListHeaders
import typings.nodemailer.libMailerMod.TextEncoding
import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.libSmtpDashConnectionMod.CustomAuthenticationHandlers
import typings.nodemailer.libSmtpDashConnectionMod.DSNOptions
import typings.nodemailer.libSmtpDashConnectionMod.ms
import typings.nodemailer.nodemailerMod.TransportOptions
import typings.nodemailer.nodemailerStrings.high
import typings.nodemailer.nodemailerStrings.low
import typings.nodemailer.nodemailerStrings.normal
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.nodemailer.libSmtpDashConnectionMod.Options because var conflicts: auth. Inlined host, port, secure, ignoreTLS, requireTLS, opportunisticTLS, name, localAddress, connectionTimeout, greetingTimeout, socketTimeout, logger, transactionLog, debug, authMethod, tls, socket, connection, customAuth */ trait Options
  extends MailOptions
     with TransportOptions {
  /** defines preferred authentication method, e.g. ‘PLAIN’ */
  var authMethod: js.UndefOr[String] = js.undefined
  /** connected socket to use instead of creating and connecting a new one. If secure option is true, then socket is upgraded from plaintext to ciphertext */
  var connection: js.UndefOr[Socket] = js.undefined
  /** how many milliseconds to wait for the connection to establish */
  var connectionTimeout: js.UndefOr[ms] = js.undefined
  var customAuth: js.UndefOr[CustomAuthenticationHandlers] = js.undefined
  /** if set to true, then logs SMTP traffic and message content, otherwise logs only transaction events */
  var debug: js.UndefOr[Boolean] = js.undefined
  var getSocket: js.UndefOr[
    js.Function2[
      /* options */ this.type, 
      /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ js.Any, Unit], 
      Unit
    ]
  ] = js.undefined
  /** how many milliseconds to wait for the greeting after connection is established */
  var greetingTimeout: js.UndefOr[ms] = js.undefined
  /** the hostname or IP address to connect to (defaults to ‘localhost’) */
  var host: js.UndefOr[String] = js.undefined
  /** turns off STARTTLS support if true */
  var ignoreTLS: js.UndefOr[Boolean] = js.undefined
  /** the local interface to bind to for network connections */
  var localAddress: js.UndefOr[String] = js.undefined
  /** optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged */
  var logger: js.UndefOr[Logger | Boolean] = js.undefined
  /** optional hostname of the client, used for identifying to the server */
  var name: js.UndefOr[String] = js.undefined
  /** tries to use STARTTLS and continues normally if it fails */
  var opportunisticTLS: js.UndefOr[Boolean] = js.undefined
  /** the port to connect to (defaults to 25 or 465) */
  var port: js.UndefOr[Double] = js.undefined
  /** forces the client to use STARTTLS. Returns an error if upgrading the connection is not possible or fails. */
  var requireTLS: js.UndefOr[Boolean] = js.undefined
  /** defines if the connection should use SSL (if true) or not (if false) */
  var secure: js.UndefOr[Boolean] = js.undefined
  var service: js.UndefOr[String] = js.undefined
  /** initialized socket to use instead of creating a new one */
  var socket: js.UndefOr[Socket] = js.undefined
  /** how many milliseconds of inactivity to allow */
  var socketTimeout: js.UndefOr[ms] = js.undefined
  /** defines additional options to be passed to the socket constructor, e.g. {rejectUnauthorized: true} */
  var tls: js.UndefOr[ConnectionOptions] = js.undefined
  /** if set to true, then logs SMTP traffic without message content */
  var transactionLog: js.UndefOr[Boolean] = js.undefined
   // TODO http.ClientRequest?
  var url: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alternatives: js.Array[Attachment] = null,
    amp: String | Buffer | Readable | AmpAttachment = null,
    attachments: js.Array[Attachment] = null,
    auth: typings.nodemailer.libSmtpDashConnectionMod.AuthenticationType = null,
    authMethod: String = null,
    bcc: String | Address | (js.Array[String | Address]) = null,
    cc: String | Address | (js.Array[String | Address]) = null,
    component: String = null,
    connection: Socket = null,
    connectionTimeout: Int | Double = null,
    customAuth: CustomAuthenticationHandlers = null,
    date: Date | String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableFileAccess: js.UndefOr[Boolean] = js.undefined,
    disableUrlAccess: js.UndefOr[Boolean] = js.undefined,
    dkim: typings.nodemailer.libDkimMod.Options = null,
    dsn: DSNOptions = null,
    encoding: String = null,
    envelope: Envelope | typings.nodemailer.libMimeDashNodeMod.Envelope = null,
    from: String | Address = null,
    getSocket: (Options, /* callback */ js.Function2[/* err */ Error | Null, /* socketOptions */ js.Any, Unit]) => Unit = null,
    greetingTimeout: Int | Double = null,
    headers: Headers = null,
    host: String = null,
    html: String | Buffer | Readable | AttachmentLike = null,
    icalEvent: String | Buffer | Readable | IcalAttachment = null,
    ignoreTLS: js.UndefOr[Boolean] = js.undefined,
    inReplyTo: String | Address = null,
    list: ListHeaders = null,
    localAddress: String = null,
    logger: Logger | Boolean = null,
    messageId: String = null,
    name: String = null,
    normalizeHeaderKey: /* key */ String => String = null,
    opportunisticTLS: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    priority: high | normal | low = null,
    raw: String | Buffer | Readable | AttachmentLike = null,
    references: String | js.Array[String] = null,
    replyTo: String | Address = null,
    requireTLS: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    sender: String | Address = null,
    service: String = null,
    socket: Socket = null,
    socketTimeout: Int | Double = null,
    subject: String = null,
    text: String | Buffer | Readable | AttachmentLike = null,
    textEncoding: TextEncoding = null,
    tls: ConnectionOptions = null,
    to: String | Address | (js.Array[String | Address]) = null,
    transactionLog: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    watchHtml: String | Buffer | Readable | AttachmentLike = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives)
    if (amp != null) __obj.updateDynamic("amp")(amp.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (customAuth != null) __obj.updateDynamic("customAuth")(customAuth)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(disableFileAccess)) __obj.updateDynamic("disableFileAccess")(disableFileAccess)
    if (!js.isUndefined(disableUrlAccess)) __obj.updateDynamic("disableUrlAccess")(disableUrlAccess)
    if (dkim != null) __obj.updateDynamic("dkim")(dkim)
    if (dsn != null) __obj.updateDynamic("dsn")(dsn)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (envelope != null) __obj.updateDynamic("envelope")(envelope.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (getSocket != null) __obj.updateDynamic("getSocket")(js.Any.fromFunction2(getSocket))
    if (greetingTimeout != null) __obj.updateDynamic("greetingTimeout")(greetingTimeout.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icalEvent != null) __obj.updateDynamic("icalEvent")(icalEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTLS)) __obj.updateDynamic("ignoreTLS")(ignoreTLS)
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(normalizeHeaderKey))
    if (!js.isUndefined(opportunisticTLS)) __obj.updateDynamic("opportunisticTLS")(opportunisticTLS)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (!js.isUndefined(requireTLS)) __obj.updateDynamic("requireTLS")(requireTLS)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding)
    if (tls != null) __obj.updateDynamic("tls")(tls)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionLog)) __obj.updateDynamic("transactionLog")(transactionLog)
    if (url != null) __obj.updateDynamic("url")(url)
    if (watchHtml != null) __obj.updateDynamic("watchHtml")(watchHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

