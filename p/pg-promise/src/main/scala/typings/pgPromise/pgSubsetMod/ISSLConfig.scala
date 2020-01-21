package typings.pgPromise.pgSubsetMod

import typings.node.Buffer
import typings.node.tlsMod.PeerCertificate
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SSL configuration;
// For property types and documentation see:
// http://nodejs.org/api/tls.html#tls_tls_connect_options_callback
trait ISSLConfig extends js.Object {
  var NPNProtocols: js.UndefOr[(js.Array[Buffer | String | Uint8Array]) | Buffer | Uint8Array] = js.undefined
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  var checkServerIdentity: js.UndefOr[js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]] = js.undefined
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | js.Object])] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  var secureOptions: js.UndefOr[Double] = js.undefined
}

object ISSLConfig {
  @scala.inline
  def apply(
    NPNProtocols: (js.Array[Buffer | String | Uint8Array]) | Buffer | Uint8Array = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    checkServerIdentity: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error] = null,
    key: String | Buffer | (js.Array[Buffer | js.Object]) = null,
    passphrase: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | js.Object]) = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureOptions: Int | Double = null
  ): ISSLConfig = {
    val __obj = js.Dynamic.literal()
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISSLConfig]
  }
}

