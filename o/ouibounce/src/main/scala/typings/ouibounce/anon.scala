package typings.ouibounce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CookieDomain extends StObject {
    
    var cookieDomain: js.UndefOr[String] = js.native
    
    var cookieExpire: js.UndefOr[Double] = js.native
    
    var cookieName: js.UndefOr[String] = js.native
    
    var sitewide: js.UndefOr[Boolean] = js.native
  }
  object CookieDomain {
    
    @scala.inline
    def apply(): CookieDomain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieDomain]
    }
    
    @scala.inline
    implicit class CookieDomainMutableBuilder[Self <: CookieDomain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      @scala.inline
      def setCookieExpire(value: Double): Self = StObject.set(x, "cookieExpire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieExpireUndefined: Self = StObject.set(x, "cookieExpire", js.undefined)
      
      @scala.inline
      def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      @scala.inline
      def setSitewide(value: Boolean): Self = StObject.set(x, "sitewide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSitewideUndefined: Self = StObject.set(x, "sitewide", js.undefined)
    }
  }
}
