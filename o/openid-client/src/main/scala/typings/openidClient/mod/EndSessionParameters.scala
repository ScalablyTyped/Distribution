package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndSessionParameters
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var id_token_hint: js.UndefOr[TokenSet | String] = js.undefined
  
  var logout_hint: js.UndefOr[String] = js.undefined
  
  var post_logout_redirect_uri: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object EndSessionParameters {
  
  inline def apply(): EndSessionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndSessionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndSessionParameters] (val x: Self) extends AnyVal {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setId_token_hint(value: TokenSet | String): Self = StObject.set(x, "id_token_hint", value.asInstanceOf[js.Any])
    
    inline def setId_token_hintUndefined: Self = StObject.set(x, "id_token_hint", js.undefined)
    
    inline def setLogout_hint(value: String): Self = StObject.set(x, "logout_hint", value.asInstanceOf[js.Any])
    
    inline def setLogout_hintUndefined: Self = StObject.set(x, "logout_hint", js.undefined)
    
    inline def setPost_logout_redirect_uri(value: String): Self = StObject.set(x, "post_logout_redirect_uri", value.asInstanceOf[js.Any])
    
    inline def setPost_logout_redirect_uriUndefined: Self = StObject.set(x, "post_logout_redirect_uri", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
