package typings.node.tlsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureContextOptions extends js.Object {
  var ca: js.UndefOr[java.lang.String | Buffer | (js.Array[java.lang.String | Buffer])] = js.undefined
  var cert: js.UndefOr[java.lang.String | Buffer | (js.Array[java.lang.String | Buffer])] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var clientCertEngine: js.UndefOr[java.lang.String] = js.undefined
  var crl: js.UndefOr[java.lang.String | Buffer | (js.Array[java.lang.String | Buffer])] = js.undefined
  var dhparam: js.UndefOr[java.lang.String | Buffer] = js.undefined
  var ecdhCurve: js.UndefOr[java.lang.String] = js.undefined
  var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String | Buffer | (js.Array[Buffer | js.Object])] = js.undefined
  /**
    * Optionally set the maximum TLS version to allow. One
    * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.
    * **Default:** `'TLSv1.3'`, unless changed using CLI options. Using
    * `--tls-max-v1.2` sets the default to `'TLSv1.2'`. Using `--tls-max-v1.3` sets the default to
    * `'TLSv1.3'`. If multiple of the options are provided, the highest maximum is used.
    */
  var maxVersion: js.UndefOr[SecureVersion] = js.undefined
  /**
    * Optionally set the minimum TLS version to allow. One
    * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.  It is not recommended to use
    * less than TLSv1.2, but it may be required for interoperability.
    * **Default:** `'TLSv1.2'`, unless changed using CLI options. Using
    * `--tls-v1.0` sets the default to `'TLSv1'`. Using `--tls-v1.1` sets the default to
    * `'TLSv1.1'`. Using `--tls-min-v1.3` sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the lowest minimum is used.
    */
  var minVersion: js.UndefOr[SecureVersion] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[java.lang.String | Buffer | (js.Array[java.lang.String | Buffer | js.Object])] = js.undefined
  var secureOptions: js.UndefOr[Double] = js.undefined
   // Value is a numeric bitmask of the `SSL_OP_*` options
  var secureProtocol: js.UndefOr[java.lang.String] = js.undefined
   // SSL Method, e.g. SSLv23_method
  var sessionIdContext: js.UndefOr[java.lang.String] = js.undefined
}

object SecureContextOptions {
  @scala.inline
  def apply(
    ca: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    cert: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    crl: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    dhparam: java.lang.String | Buffer = null,
    ecdhCurve: java.lang.String = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    key: java.lang.String | Buffer | (js.Array[Buffer | js.Object]) = null,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    passphrase: java.lang.String = null,
    pfx: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer | js.Object]) = null,
    secureOptions: Int | Double = null,
    secureProtocol: java.lang.String = null,
    sessionIdContext: java.lang.String = null
  ): SecureContextOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureContextOptions]
  }
}

