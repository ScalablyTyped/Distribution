package typings.ouibounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieDomain extends js.Object {
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
  implicit class CookieDomainOps[Self <: CookieDomain] (val x: Self) extends AnyVal {
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
    def setSitewide(value: Boolean): Self = this.set("sitewide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSitewide: Self = this.set("sitewide", js.undefined)
  }
  
}

