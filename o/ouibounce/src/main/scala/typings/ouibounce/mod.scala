package typings.ouibounce

import typings.ouibounce.anon.CookieDomain
import typings.ouibounce.ouibounceBooleans.`false`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Ouibounce = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Ouibounce]
  inline def apply(el: Null, custom_config: OuibounceConfig): Ouibounce = (^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any], custom_config.asInstanceOf[js.Any])).asInstanceOf[Ouibounce]
  inline def apply(el: `false`): Ouibounce = ^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any]).asInstanceOf[Ouibounce]
  inline def apply(el: `false`, custom_config: OuibounceConfig): Ouibounce = (^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any], custom_config.asInstanceOf[js.Any])).asInstanceOf[Ouibounce]
  inline def apply(el: Element): Ouibounce = ^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any]).asInstanceOf[Ouibounce]
  inline def apply(el: Element, custom_config: OuibounceConfig): Ouibounce = (^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any], custom_config.asInstanceOf[js.Any])).asInstanceOf[Ouibounce]
  
  @JSImport("ouibounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Ouibounce extends StObject {
    
    /**
      * Disables the ouibounce event.
      */
    def disable(): Unit = js.native
    def disable(custom_options: CookieDomain): Unit = js.native
    
    /**
      * Fires the ouibounce event immediately.
      */
    def fire(): Unit = js.native
  }
  
  trait OuibounceConfig extends StObject {
    
    /**
      * By default, Ouibounce will only fire once for each visitor.
      * When Ouibounce fires, a cookie is created to ensure *a non obtrusive*
      * experience.
      *
      *  There are cases, however, when you may want to be more aggressive
      * (as in, you want the modal to be elegible to fire anytime the page
      * is loaded/ reloaded). An example use-case might be on your paid
      * landing pages. If you enable `aggressive`, the modal will fire any
      * time the page is reloaded, for the same user.
      */
    var aggressive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that will run once Ouibounce has been triggered.
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Ouibounce sets a cookie by default to prevent the modal from
      * appearing more than once per user. You can add a cookie domain
      * using `cookieDomain` to specify the domain under which the cookie
      * should work. By default, no extra domain information will be added.
      * If you need a cookie to work also in your subdomain (like
      * blog.example.com and example.com), then set a `cookieDomain` such
      * as .example.com (notice the dot in front).
      */
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    /**
      * Ouibounce sets a cookie by default to prevent the modal from
      * appearing more than once per user. You can add a cookie expiration
      * (in days) using `cookieExpire` to adjust the time period before
      * the modal will appear again for a user. By default, the cookie
      * will expire at the end of the session, which for most browsers is
      * when the browser is closed entirely.
      */
    var cookieExpire: js.UndefOr[Double] = js.undefined
    
    /**
      * The name for the cookie.
      */
    var cookieName: js.UndefOr[String] = js.undefined
    
    /**
      * By default, Ouibounce will show the modal immediately. You could
      * instead configure it to wait `x` milliseconds before showing the modal.
      * If the user's mouse re-enters the body before `delay` ms have passed,
      * the modal will not appear. This can be used to provide a "grace
      * period" for visitors instead of immediately presenting the modal
      * window.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Ouibounce fires when the mouse cursor moves close to (or passes)
      * the top of the viewport. You can define how far the mouse has to be
      * before Ouibounce fires. The higher value, the more sensitive,
      * and the more quickly the event will fire.
      *
      * *Defaults to 20.*
      */
    var sensitivity: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the cookie should be used sitewide.
      */
    var sitewide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Ouibounce won't fire in the first second to prevent
      * false positives, as it's unlikely the user will be able to exit
      * the page within less than a second. If you want to change the amount
      * of time that firing is surpressed for, you can pass in a number
      * of milliseconds to `timer`.
      */
    var timer: js.UndefOr[Double] = js.undefined
  }
  object OuibounceConfig {
    
    inline def apply(): OuibounceConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OuibounceConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OuibounceConfig] (val x: Self) extends AnyVal {
      
      inline def setAggressive(value: Boolean): Self = StObject.set(x, "aggressive", value.asInstanceOf[js.Any])
      
      inline def setAggressiveUndefined: Self = StObject.set(x, "aggressive", js.undefined)
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookieExpire(value: Double): Self = StObject.set(x, "cookieExpire", value.asInstanceOf[js.Any])
      
      inline def setCookieExpireUndefined: Self = StObject.set(x, "cookieExpire", js.undefined)
      
      inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
      
      inline def setSitewide(value: Boolean): Self = StObject.set(x, "sitewide", value.asInstanceOf[js.Any])
      
      inline def setSitewideUndefined: Self = StObject.set(x, "sitewide", js.undefined)
      
      inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    }
  }
}
