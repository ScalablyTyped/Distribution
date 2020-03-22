package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TLSOptions extends js.Object {
  /**
    * Enable TLS connections
    * @default false
    */
  var tls: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether or not the driver should error when the server’s TLS certificate is invalid
    */
  var tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether or not the driver should error when there is a mismatch between the server’s hostname
    * and the hostname specified by the TLS certificate
    */
  var tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.undefined
  /**
    * path to file with either a single or bundle of certificate authorities
    * to be considered trusted when making a TLS connection
    */
  var tlsCAFile: js.UndefOr[String] = js.undefined
  /**
    * path to the client certificate file or the client private key file;
    * in the case that they both are needed, the files should be concatenated
    */
  var tlsCertificateKeyFile: js.UndefOr[String] = js.undefined
  /**
    * The password to decrypt the client private key to be used for TLS connections
    */
  var tlsCertificateKeyFilePassword: js.UndefOr[String] = js.undefined
  /**
    * Relax TLS constraints, disabling validation
    * @default false
    */
  var tlsInsecure: js.UndefOr[Boolean] = js.undefined
}

object TLSOptions {
  @scala.inline
  def apply(
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.undefined,
    tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.undefined,
    tlsCAFile: String = null,
    tlsCertificateKeyFile: String = null,
    tlsCertificateKeyFilePassword: String = null,
    tlsInsecure: js.UndefOr[Boolean] = js.undefined
  ): TLSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsAllowInvalidCertificates)) __obj.updateDynamic("tlsAllowInvalidCertificates")(tlsAllowInvalidCertificates.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsAllowInvalidHostnames)) __obj.updateDynamic("tlsAllowInvalidHostnames")(tlsAllowInvalidHostnames.asInstanceOf[js.Any])
    if (tlsCAFile != null) __obj.updateDynamic("tlsCAFile")(tlsCAFile.asInstanceOf[js.Any])
    if (tlsCertificateKeyFile != null) __obj.updateDynamic("tlsCertificateKeyFile")(tlsCertificateKeyFile.asInstanceOf[js.Any])
    if (tlsCertificateKeyFilePassword != null) __obj.updateDynamic("tlsCertificateKeyFilePassword")(tlsCertificateKeyFilePassword.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsInsecure)) __obj.updateDynamic("tlsInsecure")(tlsInsecure.asInstanceOf[js.Any])
    __obj.asInstanceOf[TLSOptions]
  }
}

