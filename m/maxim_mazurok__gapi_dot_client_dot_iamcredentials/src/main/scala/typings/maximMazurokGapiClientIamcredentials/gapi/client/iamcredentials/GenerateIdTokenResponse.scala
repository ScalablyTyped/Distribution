package typings.maximMazurokGapiClientIamcredentials.gapi.client.iamcredentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateIdTokenResponse extends js.Object {
  
  /** The OpenId Connect ID token. */
  var token: js.UndefOr[String] = js.native
}
object GenerateIdTokenResponse {
  
  @scala.inline
  def apply(): GenerateIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateIdTokenResponse]
  }
  
  @scala.inline
  implicit class GenerateIdTokenResponseOps[Self <: GenerateIdTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
