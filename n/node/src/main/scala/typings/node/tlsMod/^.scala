package typings.node.tlsMod

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CLIENT_RENEG_LIMIT: Double = js.native
  val CLIENT_RENEG_WINDOW: Double = js.native
  val DEFAULT_ECDH_CURVE: java.lang.String = js.native
  val rootCertificates: js.Array[java.lang.String] = js.native
  /*
    * Verifies the certificate `cert` is issued to host `host`.
    * @host The hostname to verify the certificate against
    * @cert PeerCertificate representing the peer's certificate
    *
    * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
    */
  def checkServerIdentity(host: java.lang.String, cert: PeerCertificate): js.UndefOr[Error] = js.native
  def connect(options: ConnectionOptions): TLSSocket = js.native
  def connect(options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
  def connect(port: Double): TLSSocket = js.native
  def connect(port: Double, host: java.lang.String): TLSSocket = js.native
  def connect(port: Double, host: java.lang.String, options: ConnectionOptions): TLSSocket = js.native
  def connect(
    port: Double,
    host: java.lang.String,
    options: ConnectionOptions,
    secureConnectListener: js.Function0[Unit]
  ): TLSSocket = js.native
  def connect(port: Double, options: ConnectionOptions): TLSSocket = js.native
  def connect(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
  def createSecureContext(details: SecureContextOptions): SecureContext = js.native
  /**
    * @deprecated
    */
  def createSecurePair(): SecurePair = js.native
  def createSecurePair(credentials: SecureContext): SecurePair = js.native
  def createSecurePair(credentials: SecureContext, isServer: Boolean): SecurePair = js.native
  def createSecurePair(credentials: SecureContext, isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def createSecurePair(credentials: SecureContext, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = js.native
  def createServer(): Server = js.native
  def createServer(options: TlsOptions): Server = js.native
  def createServer(options: TlsOptions, secureConnectionListener: js.Function1[/* socket */ TLSSocket, Unit]): Server = js.native
  def createServer(secureConnectionListener: js.Function1[/* socket */ TLSSocket, Unit]): Server = js.native
  def getCiphers(): js.Array[java.lang.String] = js.native
}

