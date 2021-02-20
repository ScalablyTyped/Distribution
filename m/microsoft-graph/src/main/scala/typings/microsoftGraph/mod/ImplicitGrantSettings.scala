package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImplicitGrantSettings extends StObject {
  
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
  implicit class ImplicitGrantSettingsMutableBuilder[Self <: ImplicitGrantSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableAccessTokenIssuance(value: NullableOption[Boolean]): Self = StObject.set(x, "enableAccessTokenIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAccessTokenIssuanceNull: Self = StObject.set(x, "enableAccessTokenIssuance", null)
    
    @scala.inline
    def setEnableAccessTokenIssuanceUndefined: Self = StObject.set(x, "enableAccessTokenIssuance", js.undefined)
    
    @scala.inline
    def setEnableIdTokenIssuance(value: NullableOption[Boolean]): Self = StObject.set(x, "enableIdTokenIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIdTokenIssuanceNull: Self = StObject.set(x, "enableIdTokenIssuance", null)
    
    @scala.inline
    def setEnableIdTokenIssuanceUndefined: Self = StObject.set(x, "enableIdTokenIssuance", js.undefined)
  }
}
