package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearCacheOptionMod {
  
  trait ClearCacheOption extends StObject {
    
    var appcache: js.UndefOr[Boolean] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var cookies: js.UndefOr[Boolean] = js.undefined
    
    var localStorage: js.UndefOr[Boolean] = js.undefined
  }
  object ClearCacheOption {
    
    inline def apply(): ClearCacheOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearCacheOption]
    }
    
    extension [Self <: ClearCacheOption](x: Self) {
      
      inline def setAppcache(value: Boolean): Self = StObject.set(x, "appcache", value.asInstanceOf[js.Any])
      
      inline def setAppcacheUndefined: Self = StObject.set(x, "appcache", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
    }
  }
}
