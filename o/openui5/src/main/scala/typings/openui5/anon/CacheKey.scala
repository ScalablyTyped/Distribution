package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheKey extends StObject {
  
  /**
    * request is per default async
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (optional) A valid cache key
    */
  var cacheKey: js.UndefOr[String] = js.undefined
  
  /**
    * (optional) map of custom headers which should be set with the request.
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /**
    * **Deprecated** for security reasons. Use strong server side authentication instead. Password for the
    * service.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * **Deprecated** for security reasons. Use strong server side authentication instead. UserID for the service.
    */
  var user: js.UndefOr[String] = js.undefined
}
object CacheKey {
  
  inline def apply(): CacheKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheKey] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
