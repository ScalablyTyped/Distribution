package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicClientApplication extends js.Object {
  
  /**
    * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and
    * access tokens are sent.
    */
  var redirectUris: js.UndefOr[js.Array[String]] = js.native
}
object PublicClientApplication {
  
  @scala.inline
  def apply(): PublicClientApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicClientApplication]
  }
  
  @scala.inline
  implicit class PublicClientApplicationOps[Self <: PublicClientApplication] (val x: Self) extends AnyVal {
    
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
    def setRedirectUrisVarargs(value: String*): Self = this.set("redirectUris", js.Array(value :_*))
    
    @scala.inline
    def setRedirectUris(value: js.Array[String]): Self = this.set("redirectUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUris: Self = this.set("redirectUris", js.undefined)
  }
}
