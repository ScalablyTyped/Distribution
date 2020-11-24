package typings.nodemailer.xoauth2Mod

import typings.nodemailer.anon.Key
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** An existing valid accessToken */
  var accessToken: js.UndefOr[String] = js.native
  
  /** Endpoint for token generation, defaults to 'https://accounts.google.com/o/oauth2/token' */
  var accessUrl: js.UndefOr[String] = js.native
  
  /** Client ID value */
  var clientId: js.UndefOr[String] = js.native
  
  /** Client secret value */
  var clientSecret: js.UndefOr[String] = js.native
  
  /** Optional Access Token expire time in ms */
  var expires: js.UndefOr[ms] = js.native
  
  /** Private key for JSW */
  var privateKey: js.UndefOr[String | Key] = js.native
  
  /** Function to run when a new access token is required */
  var provisionCallback: js.UndefOr[
    js.Function3[
      /* user */ String, 
      /* renew */ Boolean, 
      /* callback */ js.Function3[/* err */ Error | Null, /* accessToken */ String, /* expires */ Double, Unit], 
      Unit
    ]
  ] = js.native
  
  /** Refresh token for an user */
  var refreshToken: js.UndefOr[String] = js.native
  
  var serviceClient: js.UndefOr[String] = js.native
  
  /** Optional TTL for Access Token in seconds */
  var timeout: js.UndefOr[s] = js.native
  
  /** User e-mail address */
  var user: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setAccessUrl(value: String): Self = this.set("accessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessUrl: Self = this.set("accessUrl", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    
    @scala.inline
    def setExpires(value: ms): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String | Key): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setProvisionCallback(
      value: (/* user */ String, /* renew */ Boolean, /* callback */ js.Function3[/* err */ Error | Null, /* accessToken */ String, /* expires */ Double, Unit]) => Unit
    ): Self = this.set("provisionCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProvisionCallback: Self = this.set("provisionCallback", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setServiceClient(value: String): Self = this.set("serviceClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceClient: Self = this.set("serviceClient", js.undefined)
    
    @scala.inline
    def setTimeout(value: s): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
