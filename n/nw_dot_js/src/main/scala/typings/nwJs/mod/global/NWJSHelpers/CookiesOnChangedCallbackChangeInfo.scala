package typings.nwJs.mod.global.NWJSHelpers

import typings.nwJs.nwJsStrings.evicted
import typings.nwJs.nwJsStrings.expired
import typings.nwJs.nwJsStrings.expired_overwrite
import typings.nwJs.nwJsStrings.explicit
import typings.nwJs.nwJsStrings.overwrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coockies.onChanged.addListener() callback details argument object
  */
trait CookiesOnChangedCallbackChangeInfo extends StObject {
  
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
  
  inline def apply(
    cause: String | evicted | expired | explicit | expired_overwrite | overwrite,
    cookie: Cookie,
    removed: Boolean
  ): CookiesOnChangedCallbackChangeInfo = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesOnChangedCallbackChangeInfo]
  }
  
  extension [Self <: CookiesOnChangedCallbackChangeInfo](x: Self) {
    
    inline def setCause(value: String | evicted | expired | explicit | expired_overwrite | overwrite): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
  }
}
