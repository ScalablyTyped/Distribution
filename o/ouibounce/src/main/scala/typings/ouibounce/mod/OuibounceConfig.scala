package typings.ouibounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  @scala.inline
  def apply(
    aggressive: js.UndefOr[Boolean] = js.undefined,
    callback: () => Unit = null,
    cookieDomain: String = null,
    cookieExpire: Int | Double = null,
    cookieName: String = null,
    delay: Int | Double = null,
    sensitivity: Int | Double = null,
    sitewide: js.UndefOr[Boolean] = js.undefined,
    timer: Int | Double = null
  ): OuibounceConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggressive)) __obj.updateDynamic("aggressive")(aggressive.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (cookieExpire != null) __obj.updateDynamic("cookieExpire")(cookieExpire.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(sitewide)) __obj.updateDynamic("sitewide")(sitewide.asInstanceOf[js.Any])
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OuibounceConfig]
  }
}

