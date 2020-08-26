package typings.openfin.windowOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentNavigation extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}

object ContentNavigation {
  @scala.inline
  def apply(): ContentNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentNavigation]
  }
  @scala.inline
  implicit class ContentNavigationOps[Self <: ContentNavigation] (val x: Self) extends AnyVal {
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
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
  
}

