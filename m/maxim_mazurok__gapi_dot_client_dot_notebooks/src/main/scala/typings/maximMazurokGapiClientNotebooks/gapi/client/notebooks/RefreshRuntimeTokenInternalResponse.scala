package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshRuntimeTokenInternalResponse extends StObject {
  
  /** The OAuth 2.0 access token. */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /** Output only. Token expiration time. */
  var expireTime: js.UndefOr[String] = js.undefined
}
object RefreshRuntimeTokenInternalResponse {
  
  inline def apply(): RefreshRuntimeTokenInternalResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshRuntimeTokenInternalResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshRuntimeTokenInternalResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
