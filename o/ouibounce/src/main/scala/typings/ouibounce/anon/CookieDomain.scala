package typings.ouibounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieDomain extends js.Object {
  var cookieDomain: js.UndefOr[String] = js.undefined
  var cookieExpire: js.UndefOr[Double] = js.undefined
  var cookieName: js.UndefOr[String] = js.undefined
  var sitewide: js.UndefOr[Boolean] = js.undefined
}

object CookieDomain {
  @scala.inline
  def apply(
    cookieDomain: String = null,
    cookieExpire: js.UndefOr[Double] = js.undefined,
    cookieName: String = null,
    sitewide: js.UndefOr[Boolean] = js.undefined
  ): CookieDomain = {
    val __obj = js.Dynamic.literal()
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieExpire)) __obj.updateDynamic("cookieExpire")(cookieExpire.get.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (!js.isUndefined(sitewide)) __obj.updateDynamic("sitewide")(sitewide.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieDomain]
  }
}

