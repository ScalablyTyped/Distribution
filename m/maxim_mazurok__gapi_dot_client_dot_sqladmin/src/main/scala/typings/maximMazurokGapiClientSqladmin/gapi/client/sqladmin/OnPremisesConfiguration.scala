package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPremisesConfiguration extends js.Object {
  
  /** PEM representation of the trusted CA's x509 certificate. */
  var caCertificate: js.UndefOr[String] = js.native
  
  /** PEM representation of the replica's x509 certificate. */
  var clientCertificate: js.UndefOr[String] = js.native
  
  /** PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate. */
  var clientKey: js.UndefOr[String] = js.native
  
  /** The dump file to create the Cloud SQL replica. */
  var dumpFilePath: js.UndefOr[String] = js.native
  
  /** The host and port of the on-premises instance in host:port format */
  var hostPort: js.UndefOr[String] = js.native
  
  /** This is always *sql#onPremisesConfiguration*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The password for connecting to on-premises instance. */
  var password: js.UndefOr[String] = js.native
  
  /** The username for connecting to on-premises instance. */
  var username: js.UndefOr[String] = js.native
}
object OnPremisesConfiguration {
  
  @scala.inline
  def apply(): OnPremisesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesConfiguration]
  }
  
  @scala.inline
  implicit class OnPremisesConfigurationOps[Self <: OnPremisesConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCaCertificate(value: String): Self = this.set("caCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCertificate: Self = this.set("caCertificate", js.undefined)
    
    @scala.inline
    def setClientCertificate(value: String): Self = this.set("clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificate: Self = this.set("clientCertificate", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientKey: Self = this.set("clientKey", js.undefined)
    
    @scala.inline
    def setDumpFilePath(value: String): Self = this.set("dumpFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpFilePath: Self = this.set("dumpFilePath", js.undefined)
    
    @scala.inline
    def setHostPort(value: String): Self = this.set("hostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPort: Self = this.set("hostPort", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
