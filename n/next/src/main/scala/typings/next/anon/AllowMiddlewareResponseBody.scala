package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowMiddlewareResponseBody extends StObject {
  
  var allowMiddlewareResponseBody: Boolean
  
  var dev: Boolean
  
  var hasFontLoaders: Boolean
  
  var sriEnabled: Boolean
}
object AllowMiddlewareResponseBody {
  
  inline def apply(allowMiddlewareResponseBody: Boolean, dev: Boolean, hasFontLoaders: Boolean, sriEnabled: Boolean): AllowMiddlewareResponseBody = {
    val __obj = js.Dynamic.literal(allowMiddlewareResponseBody = allowMiddlewareResponseBody.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], hasFontLoaders = hasFontLoaders.asInstanceOf[js.Any], sriEnabled = sriEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowMiddlewareResponseBody]
  }
  
  extension [Self <: AllowMiddlewareResponseBody](x: Self) {
    
    inline def setAllowMiddlewareResponseBody(value: Boolean): Self = StObject.set(x, "allowMiddlewareResponseBody", value.asInstanceOf[js.Any])
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setHasFontLoaders(value: Boolean): Self = StObject.set(x, "hasFontLoaders", value.asInstanceOf[js.Any])
    
    inline def setSriEnabled(value: Boolean): Self = StObject.set(x, "sriEnabled", value.asInstanceOf[js.Any])
  }
}
