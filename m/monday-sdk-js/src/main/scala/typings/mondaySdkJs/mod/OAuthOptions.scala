package typings.mondaySdkJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthOptions extends js.Object {
  
  /**
    * The OAuth client ID of the requesting application
    * Defaults to your client ID
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The URL of the monday OAuth endpoint
    */
  var mondayOauthUrl: js.UndefOr[String] = js.native
}
object OAuthOptions {
  
  @scala.inline
  def apply(): OAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthOptions]
  }
  
  @scala.inline
  implicit class OAuthOptionsOps[Self <: OAuthOptions] (val x: Self) extends AnyVal {
    
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
    def setMondayOauthUrl(value: String): Self = this.set("mondayOauthUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMondayOauthUrl: Self = this.set("mondayOauthUrl", js.undefined)
  }
}
