package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

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
  var cause: java.lang.String | nwDotJsLib.nwDotJsLibStrings.evicted | nwDotJsLib.nwDotJsLibStrings.expired | nwDotJsLib.nwDotJsLibStrings.explicit | nwDotJsLib.nwDotJsLibStrings.expired_overwrite | nwDotJsLib.nwDotJsLibStrings.overwrite
  /**
    * Information about the cookie that was set or removed.
    */
  var cookie: Cookie
  /**
    * True if a cookie was removed.
    */
  var removed: scala.Boolean
}

object CookiesOnChangedCallbackChangeInfo {
  @scala.inline
  def apply(
    cause: java.lang.String | nwDotJsLib.nwDotJsLibStrings.evicted | nwDotJsLib.nwDotJsLibStrings.expired | nwDotJsLib.nwDotJsLibStrings.explicit | nwDotJsLib.nwDotJsLibStrings.expired_overwrite | nwDotJsLib.nwDotJsLibStrings.overwrite,
    cookie: Cookie,
    removed: scala.Boolean
  ): CookiesOnChangedCallbackChangeInfo = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie, removed = removed)
  
    __obj.asInstanceOf[CookiesOnChangedCallbackChangeInfo]
  }
}

