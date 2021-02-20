package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearCacheOptionMod {
  
  @js.native
  trait ClearCacheOption extends StObject {
    
    var appcache: js.UndefOr[Boolean] = js.native
    
    var cache: js.UndefOr[Boolean] = js.native
    
    var cookies: js.UndefOr[Boolean] = js.native
    
    var localStorage: js.UndefOr[Boolean] = js.native
  }
  object ClearCacheOption {
    
    @scala.inline
    def apply(): ClearCacheOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearCacheOption]
    }
    
    @scala.inline
    implicit class ClearCacheOptionMutableBuilder[Self <: ClearCacheOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppcache(value: Boolean): Self = StObject.set(x, "appcache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppcacheUndefined: Self = StObject.set(x, "appcache", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
    }
  }
}
