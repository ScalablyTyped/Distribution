package typings.nwJs.mod._Global_.NWJSHelpers

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
trait CookiesOnChangedCallbackChangeInfo extends js.Object {
  /**
    * The underlying reason behind the cookie's change.
    */
  var cause: String | evicted | expired | explicit | expired_overwrite | overwrite
  /**
    * Information about the cookie that was set or removed.
    */
  var cookie: Cookie
  /**
    * True if a cookie was removed.
    */
  var removed: Boolean
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
}

