package typings.oauth2Server.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticateOptions extends js.Object {
  
  /**
    * Set the X-Accepted-OAuth-Scopes HTTP header on response objects.
    */
  var addAcceptedScopesHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the X-OAuth-Scopes HTTP header on response objects.
    */
  var addAuthorizedScopesHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow clients to pass bearer tokens in the query string of a request.
    */
  var allowBearerTokensInQueryString: js.UndefOr[Boolean] = js.native
  
  /**
    * The scope(s) to authenticate.
    */
  var scope: js.UndefOr[String | js.Array[String]] = js.native
}
object AuthenticateOptions {
  
  @scala.inline
  def apply(): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateOptions]
  }
  
  @scala.inline
  implicit class AuthenticateOptionsOps[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
    
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
    def setAddAcceptedScopesHeader(value: Boolean): Self = this.set("addAcceptedScopesHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddAcceptedScopesHeader: Self = this.set("addAcceptedScopesHeader", js.undefined)
    
    @scala.inline
    def setAddAuthorizedScopesHeader(value: Boolean): Self = this.set("addAuthorizedScopesHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddAuthorizedScopesHeader: Self = this.set("addAuthorizedScopesHeader", js.undefined)
    
    @scala.inline
    def setAllowBearerTokensInQueryString(value: Boolean): Self = this.set("allowBearerTokensInQueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowBearerTokensInQueryString: Self = this.set("allowBearerTokensInQueryString", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
