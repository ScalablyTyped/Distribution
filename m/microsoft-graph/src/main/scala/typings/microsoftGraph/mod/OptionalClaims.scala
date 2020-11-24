package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalClaims extends js.Object {
  
  // The optional claims returned in the JWT access token.
  var accessToken: js.UndefOr[NullableOption[js.Array[OptionalClaim]]] = js.native
  
  // The optional claims returned in the JWT ID token.
  var idToken: js.UndefOr[NullableOption[js.Array[OptionalClaim]]] = js.native
  
  // The optional claims returned in the SAML token.
  var saml2Token: js.UndefOr[NullableOption[js.Array[OptionalClaim]]] = js.native
}
object OptionalClaims {
  
  @scala.inline
  def apply(): OptionalClaims = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalClaims]
  }
  
  @scala.inline
  implicit class OptionalClaimsOps[Self <: OptionalClaims] (val x: Self) extends AnyVal {
    
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
    def setAccessTokenVarargs(value: OptionalClaim*): Self = this.set("accessToken", js.Array(value :_*))
    
    @scala.inline
    def setAccessToken(value: NullableOption[js.Array[OptionalClaim]]): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setAccessTokenNull: Self = this.set("accessToken", null)
    
    @scala.inline
    def setIdTokenVarargs(value: OptionalClaim*): Self = this.set("idToken", js.Array(value :_*))
    
    @scala.inline
    def setIdToken(value: NullableOption[js.Array[OptionalClaim]]): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    
    @scala.inline
    def setIdTokenNull: Self = this.set("idToken", null)
    
    @scala.inline
    def setSaml2TokenVarargs(value: OptionalClaim*): Self = this.set("saml2Token", js.Array(value :_*))
    
    @scala.inline
    def setSaml2Token(value: NullableOption[js.Array[OptionalClaim]]): Self = this.set("saml2Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaml2Token: Self = this.set("saml2Token", js.undefined)
    
    @scala.inline
    def setSaml2TokenNull: Self = this.set("saml2Token", null)
  }
}
