package typings.nodeXmppClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmppOptions extends js.Object {
  
   // Dictionary (optional) - TLS or SSL key and certificate credentials
  var actAs: js.UndefOr[String] = js.native
  
  var autostart: js.UndefOr[Boolean] = js.native
  
   // Preferred SASL mechanism to use
  var bosh: js.UndefOr[Bosh] = js.native
  
   // connect to the legacy SSL port, requires at least the host to be specified
  var credentials: js.UndefOr[js.Any] = js.native
  
   // if admin user act on behalf of another user (just user)
  var disallowTLS: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var jid: String = js.native
  
   // register account before authentication
  var legacySSL: js.UndefOr[Boolean] = js.native
  
  var password: String = js.native
  
  var port: js.UndefOr[Double] = js.native
  
   // prevent upgrading the connection to a secure one via TLS
  var preferred: js.UndefOr[String] = js.native
  
  var reconnect: js.UndefOr[Boolean] = js.native
  
   // if we start connecting to a given port
  var register: js.UndefOr[Boolean] = js.native
}
object XmppOptions {
  
  @scala.inline
  def apply(jid: String, password: String): XmppOptions = {
    val __obj = js.Dynamic.literal(jid = jid.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmppOptions]
  }
  
  @scala.inline
  implicit class XmppOptionsOps[Self <: XmppOptions] (val x: Self) extends AnyVal {
    
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
    def setJid(value: String): Self = this.set("jid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActAs(value: String): Self = this.set("actAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActAs: Self = this.set("actAs", js.undefined)
    
    @scala.inline
    def setAutostart(value: Boolean): Self = this.set("autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutostart: Self = this.set("autostart", js.undefined)
    
    @scala.inline
    def setBosh(value: Bosh): Self = this.set("bosh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBosh: Self = this.set("bosh", js.undefined)
    
    @scala.inline
    def setCredentials(value: js.Any): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setDisallowTLS(value: Boolean): Self = this.set("disallowTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisallowTLS: Self = this.set("disallowTLS", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setLegacySSL(value: Boolean): Self = this.set("legacySSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacySSL: Self = this.set("legacySSL", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPreferred(value: String): Self = this.set("preferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferred: Self = this.set("preferred", js.undefined)
    
    @scala.inline
    def setReconnect(value: Boolean): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    
    @scala.inline
    def setRegister(value: Boolean): Self = this.set("register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
  }
}
