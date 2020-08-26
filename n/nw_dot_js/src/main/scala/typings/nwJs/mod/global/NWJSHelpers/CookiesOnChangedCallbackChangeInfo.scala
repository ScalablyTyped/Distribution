package typings.nwJs.mod.global.NWJSHelpers

import typings.nwJs.nwJsStrings.evicted
import typings.nwJs.nwJsStrings.expired
import typings.nwJs.nwJsStrings.expired_overwrite
import typings.nwJs.nwJsStrings.explicit
import typings.nwJs.nwJsStrings.overwrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coockies.onChanged.addListener() callback details argument object
  */
@js.native
trait CookiesOnChangedCallbackChangeInfo extends js.Object {
  /**
    * The underlying reason behind the cookie's change.
    */
  var cause: String | evicted | expired | explicit | expired_overwrite | overwrite = js.native
  /**
    * Information about the cookie that was set or removed.
    */
  var cookie: Cookie = js.native
  /**
    * True if a cookie was removed.
    */
  var removed: Boolean = js.native
}

object CookiesOnChangedCallbackChangeInfo {
  @scala.inline
  def apply(
    cause: String | evicted | expired | explicit | expired_overwrite | overwrite,
    cookie: Cookie,
    removed: Boolean
  ): CookiesOnChangedCallbackChangeInfo = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesOnChangedCallbackChangeInfo]
  }
  @scala.inline
  implicit class CookiesOnChangedCallbackChangeInfoOps[Self <: CookiesOnChangedCallbackChangeInfo] (val x: Self) extends AnyVal {
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
    def setCause(value: String | evicted | expired | explicit | expired_overwrite | overwrite): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookie(value: Cookie): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}

