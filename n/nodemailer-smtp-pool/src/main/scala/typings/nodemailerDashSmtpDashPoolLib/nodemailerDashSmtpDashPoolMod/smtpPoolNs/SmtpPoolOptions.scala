package typings
package nodemailerDashSmtpDashPoolLib.nodemailerDashSmtpDashPoolMod.smtpPoolNs

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
  var authMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
    * how many milliseconds to wait for the connection to establish
    */
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * if true, the connection emits all traffic between client and server as 'log' events
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * how many milliseconds to wait for the greeting after connection is established
    */
  var greetingTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * is the hostname or IP address to connect to (defaults to 'localhost')
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  turns off STARTTLS support if true
    */
  var ignoreTLS: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * is the local interface to bind to for network connections
    */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (defaults to 5) is the count of maximum simultaneous connections to make against the SMTP server
    */
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  /**
    * (defaults to 100) limits the message count to be sent using a single connection. After maxMessages messages the connection is dropped and a new one is created for the following messages
    */
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
  /**
    * optional hostname of the client, used for identifying to the server
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * is the port to connect to (defaults to 25 or 465)
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * defines if the connection should use SSL (if true) or not (if false)
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * how many milliseconds of inactivity to allow
    */
  var socketTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    *  defines additional options to be passed to the socket constructor, eg. {rejectUnauthorized: true}
    */
  var tls: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
}

object SmtpPoolOptions {
  @scala.inline
  def apply(
    auth: AuthOptions = null,
    authMethod: java.lang.String = null,
    connectionTimeout: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    greetingTimeout: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    ignoreTLS: js.UndefOr[scala.Boolean] = js.undefined,
    localAddress: java.lang.String = null,
    maxConnections: scala.Int | scala.Double = null,
    maxMessages: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    socketTimeout: scala.Int | scala.Double = null,
    tls: nodeLib.tlsMod.ConnectionOptions = null
  ): SmtpPoolOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (greetingTimeout != null) __obj.updateDynamic("greetingTimeout")(greetingTimeout.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(ignoreTLS)) __obj.updateDynamic("ignoreTLS")(ignoreTLS)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls)
    __obj.asInstanceOf[SmtpPoolOptions]
  }
}

