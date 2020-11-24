package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImplicitGrantSettings extends js.Object {
  
  // Specifies whether this web application can request an access token using the OAuth 2.0 implicit flow.
  var enableAccessTokenIssuance: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Specifies whether this web application can request an ID token using the OAuth 2.0 implicit flow.
  var enableIdTokenIssuance: js.UndefOr[NullableOption[Boolean]] = js.native
}
object ImplicitGrantSettings {
  
  @scala.inline
  def apply(): ImplicitGrantSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplicitGrantSettings]
  }
  
  @scala.inline
  implicit class ImplicitGrantSettingsOps[Self <: ImplicitGrantSettings] (val x: Self) extends AnyVal {
    
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
    def setEnableAccessTokenIssuance(value: NullableOption[Boolean]): Self = this.set("enableAccessTokenIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAccessTokenIssuance: Self = this.set("enableAccessTokenIssuance", js.undefined)
    
    @scala.inline
    def setEnableAccessTokenIssuanceNull: Self = this.set("enableAccessTokenIssuance", null)
    
    @scala.inline
    def setEnableIdTokenIssuance(value: NullableOption[Boolean]): Self = this.set("enableIdTokenIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableIdTokenIssuance: Self = this.set("enableIdTokenIssuance", js.undefined)
    
    @scala.inline
    def setEnableIdTokenIssuanceNull: Self = this.set("enableIdTokenIssuance", null)
  }
}
