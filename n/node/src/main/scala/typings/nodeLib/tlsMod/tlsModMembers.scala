package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", JSImport.Namespace)
@js.native
object tlsModMembers extends js.Object {
  val CLIENT_RENEG_LIMIT: scala.Double = js.native
  val CLIENT_RENEG_WINDOW: scala.Double = js.native
  val DEFAULT_ECDH_CURVE: java.lang.String = js.native
  /*
       * Verifies the certificate `cert` is issued to host `host`.
       * @host The hostname to verify the certificate against
       * @cert PeerCertificate representing the peer's certificate
       *
       * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
       */
  def checkServerIdentity(host: java.lang.String, cert: PeerCertificate): js.UndefOr[nodeLib.Error] = js.native
  def connect(options: ConnectionOptions): TLSSocket = js.native
  def connect(options: ConnectionOptions, secureConnectionListener: js.Function0[scala.Unit]): TLSSocket = js.native
  def connect(port: scala.Double): TLSSocket = js.native
  def connect(port: scala.Double, host: java.lang.String): TLSSocket = js.native
  def connect(port: scala.Double, host: java.lang.String, options: ConnectionOptions): TLSSocket = js.native
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): TLSSocket = js.native
  def connect(port: scala.Double, options: ConnectionOptions): TLSSocket = js.native
  def connect(port: scala.Double, options: ConnectionOptions, secureConnectListener: js.Function0[scala.Unit]): TLSSocket = js.native
  def createSecureContext(details: SecureContextOptions): SecureContext = js.native
  def createSecurePair(): SecurePair = js.native
  def createSecurePair(credentials: nodeLib.cryptoMod.Credentials): SecurePair = js.native
  def createSecurePair(credentials: nodeLib.cryptoMod.Credentials, isServer: scala.Boolean): SecurePair = js.native
  def createSecurePair(credentials: nodeLib.cryptoMod.Credentials, isServer: scala.Boolean, requestCert: scala.Boolean): SecurePair = js.native
  def createSecurePair(
    credentials: nodeLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): SecurePair = js.native
  def createServer(options: TlsOptions): Server = js.native
  def createServer(options: TlsOptions, secureConnectionListener: js.Function1[/* socket */ TLSSocket, scala.Unit]): Server = js.native
  def getCiphers(): js.Array[java.lang.String] = js.native
}

