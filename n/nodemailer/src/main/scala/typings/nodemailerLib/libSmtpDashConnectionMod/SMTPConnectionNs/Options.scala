package typings
package nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** defines authentication data */
  var auth: js.UndefOr[AuthenticationType] = js.undefined
  /** defines preferred authentication method, e.g. ‘PLAIN’ */
  var authMethod: js.UndefOr[java.lang.String] = js.undefined
  /** connected socket to use instead of creating and connecting a new one. If secure option is true, then socket is upgraded from plaintext to ciphertext */
  var connection: js.UndefOr[nodeLib.netMod.Socket] = js.undefined
  /** how many milliseconds to wait for the connection to establish */
  var connectionTimeout: js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.ms] = js.undefined
  /** if set to true, then logs SMTP traffic and message content, otherwise logs only transaction events */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
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
  /** optional hostname of the client, used for identifying to the server */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** tries to use STARTTLS and continues normally if it fails */
  var opportunisticTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** the port to connect to (defaults to 25 or 465) */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** forces the client to use STARTTLS. Returns an error if upgrading the connection is not possible or fails. */
  var requireTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** defines if the connection should use SSL (if true) or not (if false) */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** initialized socket to use instead of creating a new one */
  var socket: js.UndefOr[nodeLib.netMod.Socket] = js.undefined
  /** how many milliseconds of inactivity to allow */
  var socketTimeout: js.UndefOr[nodemailerLib.libSmtpDashConnectionMod.ms] = js.undefined
  /** defines additional options to be passed to the socket constructor, e.g. {rejectUnauthorized: true} */
  var tls: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  /** if set to true, then logs SMTP traffic without message content */
  var transactionLog: js.UndefOr[scala.Boolean] = js.undefined
}

