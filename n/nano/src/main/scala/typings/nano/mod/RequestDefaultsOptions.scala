package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RequestDefaults options */
trait RequestDefaultsOptions extends StObject {
  
  var agent: js.UndefOr[Any] = js.undefined
  
  var auth: js.UndefOr[RequestDefaultOptionsAuth] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var jar: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object RequestDefaultsOptions {
  
  inline def apply(): RequestDefaultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestDefaultsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestDefaultsOptions] (val x: Self) extends AnyVal {
    
    inline def setAgent(value: Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAuth(value: RequestDefaultOptionsAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setJar(value: Boolean): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    
    inline def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
