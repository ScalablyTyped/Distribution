package typings.nwJs.mod.global.NWJSHelpers

import typings.nwJs.nwJsStrings.lax
import typings.nwJs.nwJsStrings.no_restriction
import typings.nwJs.nwJsStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about an HTTP cookie.
  */
trait Cookie extends StObject {
  
  /**
    * The domain of the cookie (e.g. "www.google.com", "example.com").
    */
  var domain: String
  
  /**
    * (Optional) The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.
    */
  var expirationDate: js.UndefOr[Double] = js.undefined
  
  /**
    * True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie).
    */
  var hostOnly: Boolean
  
  /**
    * True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts).
    */
  var httpOnly: Boolean
  
  /**
    * The name of the cookie.
    */
  var name: String
  
  /**
    * The path of the cookie.
    */
  var path: String
  
  /**
    * The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests).
    */
  var sameSite: String | no_restriction | lax | strict
  
  /**
    * True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS).
    */
  var secure: Boolean
  
  /**
    * True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date.
    */
  var session: Boolean
  
  /**
    * The ID of the cookie store containing this cookie.
    */
  var storeId: String
  
  /**
    * The value of the cookie.
    */
  var value: String
}
object Cookie {
  
  inline def apply(
    domain: String,
    hostOnly: Boolean,
    httpOnly: Boolean,
    name: String,
    path: String,
    sameSite: String | no_restriction | lax | strict,
    secure: Boolean,
    session: Boolean,
    storeId: String,
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostOnly = hostOnly.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSameSite(value: String | no_restriction | lax | strict): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
