package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdPServerResponse extends StObject {
  
  var accessToken: String
  
  var expiresInSeconds: js.UndefOr[scala.Double] = js.undefined
  
  var refreshToken: js.UndefOr[String] = js.undefined
}
object IdPServerResponse {
  
  inline def apply(accessToken: String): IdPServerResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdPServerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdPServerResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setExpiresInSeconds(value: scala.Double): Self = StObject.set(x, "expiresInSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpiresInSecondsUndefined: Self = StObject.set(x, "expiresInSeconds", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
