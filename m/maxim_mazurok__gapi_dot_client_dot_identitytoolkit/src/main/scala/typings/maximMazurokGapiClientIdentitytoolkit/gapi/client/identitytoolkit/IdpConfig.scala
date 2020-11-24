package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdpConfig extends js.Object {
  
  /** OAuth2 client ID. */
  var clientId: js.UndefOr[String] = js.native
  
  /** Whether this IDP is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Percent of users who will be prompted/redirected federated login for this IDP. */
  var experimentPercent: js.UndefOr[Double] = js.native
  
  /** OAuth2 provider. */
  var provider: js.UndefOr[String] = js.native
  
  /** OAuth2 client secret. */
  var secret: js.UndefOr[String] = js.native
  
  /** Whitelisted client IDs for audience check. */
  var whitelistedAudiences: js.UndefOr[js.Array[String]] = js.native
}
object IdpConfig {
  
  @scala.inline
  def apply(): IdpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdpConfig]
  }
  
  @scala.inline
  implicit class IdpConfigOps[Self <: IdpConfig] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setExperimentPercent(value: Double): Self = this.set("experimentPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentPercent: Self = this.set("experimentPercent", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setWhitelistedAudiencesVarargs(value: String*): Self = this.set("whitelistedAudiences", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistedAudiences(value: js.Array[String]): Self = this.set("whitelistedAudiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelistedAudiences: Self = this.set("whitelistedAudiences", js.undefined)
  }
}
