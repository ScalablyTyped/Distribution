package typings.mongodb.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OIDCCallbackContext extends StObject {
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var timeoutContext: js.UndefOr[AbortSignal] = js.undefined
  
  var timeoutSeconds: js.UndefOr[scala.Double] = js.undefined
  
  var version: scala.Double
}
object OIDCCallbackContext {
  
  inline def apply(version: scala.Double): OIDCCallbackContext = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIDCCallbackContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OIDCCallbackContext] (val x: Self) extends AnyVal {
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setTimeoutContext(value: AbortSignal): Self = StObject.set(x, "timeoutContext", value.asInstanceOf[js.Any])
    
    inline def setTimeoutContextUndefined: Self = StObject.set(x, "timeoutContext", js.undefined)
    
    inline def setTimeoutSeconds(value: scala.Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    
    inline def setVersion(value: scala.Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
