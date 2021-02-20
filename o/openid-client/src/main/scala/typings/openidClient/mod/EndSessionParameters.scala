package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndSessionParameters
  extends /* key */ StringDictionary[js.Any] {
  
  var id_token_hint: js.UndefOr[TokenSet | String] = js.native
  
  var post_logout_redirect_uri: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object EndSessionParameters {
  
  @scala.inline
  def apply(): EndSessionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndSessionParameters]
  }
  
  @scala.inline
  implicit class EndSessionParametersMutableBuilder[Self <: EndSessionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId_token_hint(value: TokenSet | String): Self = StObject.set(x, "id_token_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token_hintUndefined: Self = StObject.set(x, "id_token_hint", js.undefined)
    
    @scala.inline
    def setPost_logout_redirect_uri(value: String): Self = StObject.set(x, "post_logout_redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost_logout_redirect_uriUndefined: Self = StObject.set(x, "post_logout_redirect_uri", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
