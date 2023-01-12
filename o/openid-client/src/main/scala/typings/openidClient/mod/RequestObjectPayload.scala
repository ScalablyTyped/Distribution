package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestObjectPayload
  extends StObject
     with AuthorizationParameters {
  
  var aud: js.UndefOr[String] = js.undefined
  
  var exp: js.UndefOr[Double] = js.undefined
  
  var iat: js.UndefOr[Double] = js.undefined
  
  var iss: js.UndefOr[String] = js.undefined
  
  var jti: js.UndefOr[String] = js.undefined
}
object RequestObjectPayload {
  
  inline def apply(): RequestObjectPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestObjectPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestObjectPayload] (val x: Self) extends AnyVal {
    
    inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
    
    inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
    
    inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
  }
}
