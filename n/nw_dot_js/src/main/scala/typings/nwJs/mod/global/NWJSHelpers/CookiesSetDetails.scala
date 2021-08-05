package typings.nwJs.mod.global.NWJSHelpers

import typings.nwJs.nwJsStrings.lax
import typings.nwJs.nwJsStrings.no_restriction
import typings.nwJs.nwJsStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coockies.set() details argument object
  */
trait CookiesSetDetails extends StObject {
  
  /**
    * The domain of the cookie. If omitted, the cookie becomes a host-only cookie.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie becomes a session cookie.
    */
  var expirationDate: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the cookie should be marked as HttpOnly. Defaults to false.
    */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the cookie. Empty by default if omitted.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The path of the cookie. Defaults to the path portion of the url parameter.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The cookie's same-site status: defaults to 'no_restriction'.
    */
  var sameSite: js.UndefOr[String | no_restriction | lax | strict] = js.undefined
  
  /**
    * Whether the cookie should be marked as Secure. Defaults to false.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current execution context's cookie store.
    */
  var storeId: js.UndefOr[String] = js.undefined
  
  /**
    * The request-URI to associate with the setting of the cookie.
    */
  var url: String
  
  /**
    * The value of the cookie. Empty by default if omitted.
    */
  var value: js.UndefOr[String] = js.undefined
}
object CookiesSetDetails {
  
  inline def apply(url: String): CookiesSetDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesSetDetails]
  }
  
  extension [Self <: CookiesSetDetails](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSameSite(value: String | no_restriction | lax | strict): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
