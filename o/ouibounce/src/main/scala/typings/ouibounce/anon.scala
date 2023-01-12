package typings.ouibounce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CookieDomain extends StObject {
    
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    var cookieExpire: js.UndefOr[Double] = js.undefined
    
    var cookieName: js.UndefOr[String] = js.undefined
    
    var sitewide: js.UndefOr[Boolean] = js.undefined
  }
  object CookieDomain {
    
    inline def apply(): CookieDomain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieDomain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieDomain] (val x: Self) extends AnyVal {
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookieExpire(value: Double): Self = StObject.set(x, "cookieExpire", value.asInstanceOf[js.Any])
      
      inline def setCookieExpireUndefined: Self = StObject.set(x, "cookieExpire", js.undefined)
      
      inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setSitewide(value: Boolean): Self = StObject.set(x, "sitewide", value.asInstanceOf[js.Any])
      
      inline def setSitewideUndefined: Self = StObject.set(x, "sitewide", js.undefined)
    }
  }
}
