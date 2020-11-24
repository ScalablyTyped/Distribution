package typings.ouibounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OuibounceConfig extends js.Object {
  
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
  var aggressive: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that will run once Ouibounce has been triggered.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Ouibounce sets a cookie by default to prevent the modal from
    * appearing more than once per user. You can add a cookie domain
    * using `cookieDomain` to specify the domain under which the cookie
    * should work. By default, no extra domain information will be added.
    * If you need a cookie to work also in your subdomain (like
    * blog.example.com and example.com), then set a `cookieDomain` such
    * as .example.com (notice the dot in front).
    */
  var cookieDomain: js.UndefOr[String] = js.native
  
  /**
    * Ouibounce sets a cookie by default to prevent the modal from
    * appearing more than once per user. You can add a cookie expiration
    * (in days) using `cookieExpire` to adjust the time period before
    * the modal will appear again for a user. By default, the cookie
    * will expire at the end of the session, which for most browsers is
    * when the browser is closed entirely.
    */
  var cookieExpire: js.UndefOr[Double] = js.native
  
  /**
    * The name for the cookie.
    */
  var cookieName: js.UndefOr[String] = js.native
  
  /**
    * By default, Ouibounce will show the modal immediately. You could
    * instead configure it to wait `x` milliseconds before showing the modal.
    * If the user's mouse re-enters the body before `delay` ms have passed,
    * the modal will not appear. This can be used to provide a "grace
    * period" for visitors instead of immediately presenting the modal
    * window.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Ouibounce fires when the mouse cursor moves close to (or passes)
    * the top of the viewport. You can define how far the mouse has to be
    * before Ouibounce fires. The higher value, the more sensitive,
    * and the more quickly the event will fire.
    *
    * *Defaults to 20.*
    */
  var sensitivity: js.UndefOr[Double] = js.native
  
  /**
    * Whether the cookie should be used sitewide.
    */
  var sitewide: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, Ouibounce won't fire in the first second to prevent
    * false positives, as it's unlikely the user will be able to exit
    * the page within less than a second. If you want to change the amount
    * of time that firing is surpressed for, you can pass in a number
    * of milliseconds to `timer`.
    */
  var timer: js.UndefOr[Double] = js.native
}
object OuibounceConfig {
  
  @scala.inline
  def apply(): OuibounceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OuibounceConfig]
  }
  
  @scala.inline
  implicit class OuibounceConfigOps[Self <: OuibounceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggressive(value: Boolean): Self = this.set("aggressive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggressive: Self = this.set("aggressive", js.undefined)
    
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCookieDomain(value: String): Self = this.set("cookieDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieDomain: Self = this.set("cookieDomain", js.undefined)
    
    @scala.inline
    def setCookieExpire(value: Double): Self = this.set("cookieExpire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieExpire: Self = this.set("cookieExpire", js.undefined)
    
    @scala.inline
    def setCookieName(value: String): Self = this.set("cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieName: Self = this.set("cookieName", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setSensitivity(value: Double): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
    
    @scala.inline
    def setSitewide(value: Boolean): Self = this.set("sitewide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSitewide: Self = this.set("sitewide", js.undefined)
    
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
  }
}
