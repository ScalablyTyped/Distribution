package typings.nwDotJs.NWJS_Helpers

import typings.nwDotJs.nwDotJsStrings.evicted
import typings.nwDotJs.nwDotJsStrings.expired
import typings.nwDotJs.nwDotJsStrings.expired_overwrite
import typings.nwDotJs.nwDotJsStrings.explicit
import typings.nwDotJs.nwDotJsStrings.overwrite
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
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie, removed = removed)
  
    __obj.asInstanceOf[CookiesOnChangedCallbackChangeInfo]
  }
}

