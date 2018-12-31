package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSLOptions extends js.Object {
  /**
    * Default: true; Server identity checking during SSL
    */
  var checkServerIdentity: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ecdhCurve: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If present, the connection pool will be initialized with minSize connections, and will never dip below minSize connections
    */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default:5; Number of connections for each server instance
    */
  var poolSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * String containing the server name requested via TLS SNI.
    */
  var servername: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use ssl connection (needs to have a mongod server with ssl support)
    */
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array of valid certificates either as Buffers or Strings
    */
  var sslCA: js.UndefOr[js.Array[nodeLib.Buffer | java.lang.String]] = js.undefined
  /**
    * SSL Certificate revocation list binary buffer
    */
  var sslCRL: js.UndefOr[js.Array[nodeLib.Buffer | java.lang.String]] = js.undefined
  /**
    * SSL Certificate binary buffer
    */
  var sslCert: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /**
    * SSL Key file binary buffer
    */
  var sslKey: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /**
    * SSL Certificate pass phrase
    */
  var sslPass: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /**
    * Default: true; Validate mongod server certificate against ca (mongod server >=2.4 with ssl support required)
    */
  var sslValidate: js.UndefOr[scala.Boolean] = js.undefined
}

