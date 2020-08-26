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
@js.native
trait ISSLConfig extends js.Object {
  var NPNProtocols: js.UndefOr[(js.Array[Buffer | String | Uint8Array]) | Buffer | Uint8Array] = js.native
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  var checkServerIdentity: js.UndefOr[js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]] = js.native
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | js.Object])] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var secureOptions: js.UndefOr[Double] = js.native
}

object ISSLConfig {
  @scala.inline
  def apply(): ISSLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISSLConfig]
  }
  @scala.inline
  implicit class ISSLConfigOps[Self <: ISSLConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNPNProtocolsVarargs(value: (Buffer | String | Uint8Array)*): Self = this.set("NPNProtocols", js.Array(value :_*))
    @scala.inline
    def setNPNProtocols(value: (js.Array[Buffer | String | Uint8Array]) | Buffer | Uint8Array): Self = this.set("NPNProtocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNPNProtocols: Self = this.set("NPNProtocols", js.undefined)
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = this.set("ca", js.Array(value :_*))
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCertVarargs(value: (String | Buffer)*): Self = this.set("cert", js.Array(value :_*))
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setCheckServerIdentity(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error]): Self = this.set("checkServerIdentity", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCheckServerIdentity: Self = this.set("checkServerIdentity", js.undefined)
    @scala.inline
    def setKeyVarargs(value: (Buffer | js.Object)*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[Buffer | js.Object])): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setPfxVarargs(value: (String | Buffer | js.Object)*): Self = this.set("pfx", js.Array(value :_*))
    @scala.inline
    def setPfx(value: String | Buffer | (js.Array[String | Buffer | js.Object])): Self = this.set("pfx", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    @scala.inline
    def setSecureOptions(value: Double): Self = this.set("secureOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureOptions: Self = this.set("secureOptions", js.undefined)
  }
  
}

