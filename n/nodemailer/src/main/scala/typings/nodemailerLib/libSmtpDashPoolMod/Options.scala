package typings
package nodemailerLib.libSmtpDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- nodemailerLib.libSmtpDashConnectionMod.Options because var conflicts: auth. Inlined host, port, secure, ignoreTLS, requireTLS, opportunisticTLS, name, localAddress, connectionTimeout, greetingTimeout, socketTimeout, logger, transactionLog, debug, authMethod, tls, socket, connection */ trait Options
  extends MailOptions
     with nodemailerLib.nodemailerMod.TransportOptions {
  /** defines preferred authentication method, e.g. ‘PLAIN’ */
  var authMethod: js.UndefOr[java.lang.String] = js.undefined
  /** connected socket to use instead of creating and connecting a new one. If secure option is true, then socket is upgraded from plaintext to ciphertext */
  var connection: js.UndefOr[nodeLib.netMod.Socket] = js.undefined
  /** how many milliseconds to wait for the connection to establish */
  var connectionTimeout: js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.ms] = js.undefined
  /** if set to true, then logs SMTP traffic and message content, otherwise logs only transaction events */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var getSocket: js.UndefOr[
    js.Function2[
      /* options */ this.type, 
      /* callback */ js.Function2[/* err */ stdLib.Error | scala.Null, /* socketOptions */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /** how many milliseconds to wait for the greeting after connection is established */
  var greetingTimeout: js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.ms] = js.undefined
  /** the hostname or IP address to connect to (defaults to ‘localhost’) */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** turns off STARTTLS support if true */
  var ignoreTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** the local interface to bind to for network connections */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /** optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged */
  var logger: js.UndefOr[nodemailerLib.libSharedMod.Logger | scala.Boolean] = js.undefined
  /** the count of maximum simultaneous connections to make against the SMTP server (defaults to 5) */
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  /** limits the message count to be sent using a single connection (defaults to 100). After maxMessages is reached the connection is dropped and a new one is created for the following messages */
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
  /** optional hostname of the client, used for identifying to the server */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** tries to use STARTTLS and continues normally if it fails */
  var opportunisticTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** set to true to use pooled connections (defaults to false) instead of creating a new connection for every email */
  var pool: nodemailerLib.nodemailerLibNumbers.`true`
  /** the port to connect to (defaults to 25 or 465) */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** defines the time measuring period in milliseconds (defaults to 1000, ie. to 1 second) for rate limiting */
  var rateDelta: js.UndefOr[scala.Double] = js.undefined
  /** limits the message count to be sent in rateDelta time. Once rateLimit is reached, sending is paused until the end of the measuring period. This limit is shared between connections, so if one connection uses up the limit, then other connections are paused as well. If rateLimit is not set then sending rate is not limited */
  var rateLimit: js.UndefOr[scala.Double] = js.undefined
  /** forces the client to use STARTTLS. Returns an error if upgrading the connection is not possible or fails. */
  var requireTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** defines if the connection should use SSL (if true) or not (if false) */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var service: js.UndefOr[java.lang.String] = js.undefined
  /** initialized socket to use instead of creating a new one */
  var socket: js.UndefOr[nodeLib.netMod.Socket] = js.undefined
  /** how many milliseconds of inactivity to allow */
  var socketTimeout: js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.ms] = js.undefined
  /** defines additional options to be passed to the socket constructor, e.g. {rejectUnauthorized: true} */
  var tls: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  /** if set to true, then logs SMTP traffic without message content */
  var transactionLog: js.UndefOr[scala.Boolean] = js.undefined
   // TODO http.ClientRequest?
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    pool: nodemailerLib.nodemailerLibNumbers.`true`,
    alternatives: js.Array[nodemailerLib.libMailerMod.Attachment] = null,
    attachments: js.Array[nodemailerLib.libMailerMod.Attachment] = null,
    auth: nodemailerLib.libSmtpDashConnectionMod.AuthenticationType = null,
    authMethod: java.lang.String = null,
    bcc: java.lang.String | nodemailerLib.libMailerMod.Address | (js.Array[java.lang.String | nodemailerLib.libMailerMod.Address]) = null,
    cc: java.lang.String | nodemailerLib.libMailerMod.Address | (js.Array[java.lang.String | nodemailerLib.libMailerMod.Address]) = null,
    component: java.lang.String = null,
    connection: nodeLib.netMod.Socket = null,
    connectionTimeout: js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.ms] = js.undefined,
    date: stdLib.Date | java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    disableFileAccess: js.UndefOr[scala.Boolean] = js.undefined,
    disableUrlAccess: js.UndefOr[scala.Boolean] = js.undefined,
    dkim: nodemailerLib.libDkimMod.Options = null,
    dsn: nodemailerLib.libSmtpDashConnectionMod.DSNOptions = null,
    encoding: java.lang.String = null,
    envelope: nodemailerLib.libMailerMod.Envelope | nodemailerLib.libMimeDashNodeMod.Envelope = null,
    from: java.lang.String | nodemailerLib.libMailerMod.Address = null,
    getSocket: (Options, /* callback */ js.Function2[/* err */ stdLib.Error | scala.Null, /* socketOptions */ js.Any, scala.Unit]) => scala.Unit = null,
    greetingTimeout: js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.ms] = js.undefined,
    headers: nodemailerLib.libMailerMod.Headers = null,
    host: java.lang.String = null,
    html: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.AttachmentLike = null,
    icalEvent: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.IcalAttachment = null,
    ignoreTLS: js.UndefOr[scala.Boolean] = js.undefined,
    inReplyTo: java.lang.String | nodemailerLib.libMailerMod.Address = null,
    list: nodemailerLib.libMailerMod.ListHeaders = null,
    localAddress: java.lang.String = null,
    logger: nodemailerLib.libSharedMod.Logger | scala.Boolean = null,
    maxConnections: scala.Int | scala.Double = null,
    maxMessages: scala.Int | scala.Double = null,
    messageId: java.lang.String = null,
    name: java.lang.String = null,
    normalizeHeaderKey: /* key */ java.lang.String => java.lang.String = null,
    opportunisticTLS: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    priority: nodemailerLib.nodemailerLibStrings.high | nodemailerLib.nodemailerLibStrings.normal | nodemailerLib.nodemailerLibStrings.low = null,
    rateDelta: scala.Int | scala.Double = null,
    rateLimit: scala.Int | scala.Double = null,
    raw: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.AttachmentLike = null,
    references: java.lang.String | js.Array[java.lang.String] = null,
    replyTo: java.lang.String | nodemailerLib.libMailerMod.Address = null,
    requireTLS: js.UndefOr[scala.Boolean] = js.undefined,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    sender: java.lang.String | nodemailerLib.libMailerMod.Address = null,
    service: java.lang.String = null,
    socket: nodeLib.netMod.Socket = null,
    socketTimeout: js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.ms] = js.undefined,
    subject: java.lang.String = null,
    text: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.AttachmentLike = null,
    textEncoding: nodemailerLib.libMailerMod.TextEncoding = null,
    tls: nodeLib.tlsMod.ConnectionOptions = null,
    to: java.lang.String | nodemailerLib.libMailerMod.Address | (js.Array[java.lang.String | nodemailerLib.libMailerMod.Address]) = null,
    transactionLog: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    watchHtml: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable | nodemailerLib.libMailerMod.AttachmentLike = null
  ): Options = {
    val __obj = js.Dynamic.literal(pool = pool)
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout)
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
    if (!js.isUndefined(greetingTimeout)) __obj.updateDynamic("greetingTimeout")(greetingTimeout)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icalEvent != null) __obj.updateDynamic("icalEvent")(icalEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTLS)) __obj.updateDynamic("ignoreTLS")(ignoreTLS)
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(normalizeHeaderKey))
    if (!js.isUndefined(opportunisticTLS)) __obj.updateDynamic("opportunisticTLS")(opportunisticTLS)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (rateDelta != null) __obj.updateDynamic("rateDelta")(rateDelta.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (!js.isUndefined(requireTLS)) __obj.updateDynamic("requireTLS")(requireTLS)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (!js.isUndefined(socketTimeout)) __obj.updateDynamic("socketTimeout")(socketTimeout)
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

