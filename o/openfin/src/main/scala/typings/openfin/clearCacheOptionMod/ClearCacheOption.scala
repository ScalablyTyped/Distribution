package typings.openfin.clearCacheOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearCacheOption extends js.Object {
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
  implicit class ClearCacheOptionOps[Self <: ClearCacheOption] (val x: Self) extends AnyVal {
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
    def setAppcache(value: Boolean): Self = this.set("appcache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppcache: Self = this.set("appcache", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCookies(value: Boolean): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    @scala.inline
    def setLocalStorage(value: Boolean): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
  }
  
}

