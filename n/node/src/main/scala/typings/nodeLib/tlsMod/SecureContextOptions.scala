package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureContextOptions extends js.Object {
  var ca: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.undefined
  var cert: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var clientCertEngine: js.UndefOr[java.lang.String] = js.undefined
  var crl: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.undefined
  var dhparam: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var ecdhCurve: js.UndefOr[java.lang.String] = js.undefined
  var honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object])] = js.undefined
  /**
    * Optionally set the maximum TLS version to allow. One
    * of `TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.  **Default:** `'TLSv1.2'`.
    */
  var maxVersion: js.UndefOr[SecureVersion] = js.undefined
  /**
    * Optionally set the minimum TLS version to allow. One
    * of `TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.  It is not recommended to use
    * less than TLSv1.2, but it may be required for interoperability.
    * **Default:** `'TLSv1.2'`, unless changed using CLI options. Using
    * `--tls-v1.0` changes the default to `'TLSv1'`. Using `--tls-v1.1` changes
    * the default to `'TLSv1.1'`.
    */
  var minVersion: js.UndefOr[SecureVersion] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object])
  ] = js.undefined
  var secureOptions: js.UndefOr[scala.Double] = js.undefined
   // Value is a numeric bitmask of the `SSL_OP_*` options
  var secureProtocol: js.UndefOr[java.lang.String] = js.undefined
   // SSL Method, e.g. SSLv23_method
  var sessionIdContext: js.UndefOr[java.lang.String] = js.undefined
}

