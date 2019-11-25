package typings.nodemailerDashSmtpDashPool.nodemailerDashSmtpDashPoolMod

import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmtpPoolOptions extends js.Object {
  /**
    *  defines authentication data (see authentication section below)
    */
  var auth: js.UndefOr[AuthOptions] = js.undefined
  /**
    * defines preferred authentication method, eg. 'PLAIN'
    */
  var authMethod: js.UndefOr[String] = js.undefined
  /**
    * how many milliseconds to wait for the connection to establish
    */
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  /**
    * if true, the connection emits all traffic between client and server as 'log' events
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * how many milliseconds to wait for the greeting after connection is established
    */
  var greetingTimeout: js.UndefOr[Double] = js.undefined
  /**
    * is the hostname or IP address to connect to (defaults to 'localhost')
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    *  turns off STARTTLS support if true
    */
  var ignoreTLS: js.UndefOr[Boolean] = js.undefined
  /**
    * is the local interface to bind to for network connections
    */
  var localAddress: js.UndefOr[String] = js.undefined
  /**
    * (defaults to 5) is the count of maximum simultaneous connections to make against the SMTP server
    */
  var maxConnections: js.UndefOr[Double] = js.undefined
  /**
    * (defaults to 100) limits the message count to be sent using a single connection. After maxMessages messages the connection is dropped and a new one is created for the following messages
    */
  var maxMessages: js.UndefOr[Double] = js.undefined
  /**
    * optional hostname of the client, used for identifying to the server
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * is the port to connect to (defaults to 25 or 465)
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * defines if the connection should use SSL (if true) or not (if false)
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * how many milliseconds of inactivity to allow
    */
  var socketTimeout: js.UndefOr[Double] = js.undefined
  /**
    *  defines additional options to be passed to the socket constructor, eg. {rejectUnauthorized: true}
    */
  var tls: js.UndefOr[ConnectionOptions] = js.undefined
}

object SmtpPoolOptions {
  @scala.inline
  def apply(
    auth: AuthOptions = null,
    authMethod: String = null,
    connectionTimeout: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    greetingTimeout: Int | Double = null,
    host: String = null,
    ignoreTLS: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    maxConnections: Int | Double = null,
    maxMessages: Int | Double = null,
    name: String = null,
    port: Int | Double = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    socketTimeout: Int | Double = null,
    tls: ConnectionOptions = null
  ): SmtpPoolOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (greetingTimeout != null) __obj.updateDynamic("greetingTimeout")(greetingTimeout.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTLS)) __obj.updateDynamic("ignoreTLS")(ignoreTLS.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmtpPoolOptions]
  }
}

