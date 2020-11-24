package typings.nodePushnotifications.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends js.Object {
  
  var address: js.UndefOr[String] = js.native
  
  var autoAdjustCache: js.UndefOr[Boolean] = js.native
  
  var buffersNotifications: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of trusted certificates. Each element should contain either a filename to load, or a
    * Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs
    * will be used. - You may need to use this as some environments don't include the CA used by
    * Apple (entrust_2048).
    */
  var ca: js.UndefOr[js.Array[Buffer | String]] = js.native
  
  var cacheLength: js.UndefOr[Double] = js.native
  
  /**
    * The filename of the connection certificate to load from disk, or a Buffer/String containing the
    * certificate data.
    */
  var cert: js.UndefOr[String] = js.native
  
  var connectTimeout: js.UndefOr[Double] = js.native
  
  var connectionRetryLimit: js.UndefOr[Double] = js.native
  
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  var disableEPIPEFix: js.UndefOr[Boolean] = js.native
  
  var disableNagle: js.UndefOr[Boolean] = js.native
  
  var fastMode: js.UndefOr[Boolean] = js.native
  
  /** The filename of the connection key to load from disk, or a Buffer or String containing the key data. */
  var key: js.UndefOr[String] = js.native
  
  var maxConnections: js.UndefOr[Double] = js.native
  
  var minConnections: js.UndefOr[Double] = js.native
  
  /** The passphrase for the connection key, if required */
  var passphrase: js.UndefOr[String] = js.native
  
  /**
    * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing
    * the PFX data. If supplied will always be used instead of certificate and key above.
    */
  var pfx: js.UndefOr[Buffer | String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var production: js.UndefOr[Boolean] = js.native
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  /** APN Token */
  var token: js.UndefOr[Key] = js.native
  
  var voip: js.UndefOr[Boolean] = js.native
}
object Address {
  
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAutoAdjustCache(value: Boolean): Self = this.set("autoAdjustCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAdjustCache: Self = this.set("autoAdjustCache", js.undefined)
    
    @scala.inline
    def setBuffersNotifications(value: Boolean): Self = this.set("buffersNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffersNotifications: Self = this.set("buffersNotifications", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: (Buffer | String)*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: js.Array[Buffer | String]): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCacheLength(value: Double): Self = this.set("cacheLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheLength: Self = this.set("cacheLength", js.undefined)
    
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setConnectionRetryLimit(value: Double): Self = this.set("connectionRetryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionRetryLimit: Self = this.set("connectionRetryLimit", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setDisableEPIPEFix(value: Boolean): Self = this.set("disableEPIPEFix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEPIPEFix: Self = this.set("disableEPIPEFix", js.undefined)
    
    @scala.inline
    def setDisableNagle(value: Boolean): Self = this.set("disableNagle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNagle: Self = this.set("disableNagle", js.undefined)
    
    @scala.inline
    def setFastMode(value: Boolean): Self = this.set("fastMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastMode: Self = this.set("fastMode", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    
    @scala.inline
    def setMinConnections(value: Double): Self = this.set("minConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinConnections: Self = this.set("minConnections", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPfx(value: Buffer | String): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProduction(value: Boolean): Self = this.set("production", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduction: Self = this.set("production", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setToken(value: Key): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setVoip(value: Boolean): Self = this.set("voip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoip: Self = this.set("voip", js.undefined)
  }
}
