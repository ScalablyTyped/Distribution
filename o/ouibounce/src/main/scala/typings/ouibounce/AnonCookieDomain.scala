package typings.ouibounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCookieDomain extends js.Object {
  var cookieDomain: js.UndefOr[String] = js.undefined
  var cookieExpire: js.UndefOr[Double] = js.undefined
  var cookieName: js.UndefOr[String] = js.undefined
  var sitewide: js.UndefOr[Boolean] = js.undefined
}

object AnonCookieDomain {
  @scala.inline
  def apply(
    cookieDomain: String = null,
    cookieExpire: Int | Double = null,
    cookieName: String = null,
    sitewide: js.UndefOr[Boolean] = js.undefined
  ): AnonCookieDomain = {
    val __obj = js.Dynamic.literal()
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (cookieExpire != null) __obj.updateDynamic("cookieExpire")(cookieExpire.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (!js.isUndefined(sitewide)) __obj.updateDynamic("sitewide")(sitewide.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCookieDomain]
  }
}

