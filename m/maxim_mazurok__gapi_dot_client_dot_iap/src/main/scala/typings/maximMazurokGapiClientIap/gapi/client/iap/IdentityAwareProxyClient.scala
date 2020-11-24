package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityAwareProxyClient extends js.Object {
  
  /** Human-friendly name given to the OAuth client. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Unique identifier of the OAuth client. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Client secret of the OAuth client. */
  var secret: js.UndefOr[String] = js.native
}
object IdentityAwareProxyClient {
  
  @scala.inline
  def apply(): IdentityAwareProxyClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityAwareProxyClient]
  }
  
  @scala.inline
  implicit class IdentityAwareProxyClientOps[Self <: IdentityAwareProxyClient] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
}
