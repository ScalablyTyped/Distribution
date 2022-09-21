package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Cookies
////////////////////
/**
  * Use the chrome.cookies API to query and modify cookies, and to be notified when they change.
  * Availability: Since Chrome 6.
  * Permissions:  "cookies", host permissions
  */
object cookies {
  
  trait Cookie extends StObject {
    
    /** The domain of the cookie (e.g. "www.google.com", "example.com"). */
    var domain: String
    
    /** Optional. The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.  */
    var expirationDate: js.UndefOr[Double] = js.undefined
    
    /** True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie). */
    var hostOnly: Boolean
    
    /** True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts). */
    var httpOnly: Boolean
    
    /** The name of the cookie. */
    var name: String
    
    /** The path of the cookie. */
    var path: String
    
    /**
      * The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests).
      * @since Chrome 51.
      */
    var sameSite: typings.chrome.chrome.cookies.SameSiteStatus
    
    /** True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS). */
    var secure: Boolean
    
    /** True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date. */
    var session: Boolean
    
    /** The ID of the cookie store containing this cookie, as provided in getAllCookieStores(). */
    var storeId: String
    
    /** The value of the cookie. */
    var value: String
  }
  object Cookie {
    
    inline def apply(
      domain: String,
      hostOnly: Boolean,
      httpOnly: Boolean,
      name: String,
      path: String,
      sameSite: typings.chrome.chrome.cookies.SameSiteStatus,
      secure: Boolean,
      session: Boolean,
      storeId: String,
      value: String
    ): Cookie = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostOnly = hostOnly.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    extension [Self <: Cookie](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSameSite(value: typings.chrome.chrome.cookies.SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CookieChangeInfo extends StObject {
    
    /**
      * Since Chrome 12.
      * The underlying reason behind the cookie's change.
      */
    var cause: String
    
    /** Information about the cookie that was set or removed. */
    var cookie: typings.chrome.chrome.cookies.Cookie
    
    /** True if a cookie was removed. */
    var removed: Boolean
  }
  object CookieChangeInfo {
    
    inline def apply(cause: String, cookie: typings.chrome.chrome.cookies.Cookie, removed: Boolean): CookieChangeInfo = {
      val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieChangeInfo]
    }
    
    extension [Self <: CookieChangeInfo](x: Self) {
      
      inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCookie(value: typings.chrome.chrome.cookies.Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  type CookieChangedEvent = Event[
    js.Function1[/* changeInfo */ typings.chrome.chrome.cookies.CookieChangeInfo, Unit]
  ]
  
  trait CookieStore extends StObject {
    
    /** The unique identifier for the cookie store. */
    var id: String
    
    /** Identifiers of all the browser tabs that share this cookie store. */
    var tabIds: js.Array[Double]
  }
  object CookieStore {
    
    inline def apply(id: String, tabIds: js.Array[Double]): CookieStore = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tabIds = tabIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieStore]
    }
    
    extension [Self <: CookieStore](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTabIds(value: js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
      
      inline def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value*))
    }
  }
  
  trait Details extends StObject {
    
    var name: String
    
    var storeId: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object Details {
    
    inline def apply(name: String, url: String): Details = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Details]
    }
    
    extension [Self <: Details](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAllDetails extends StObject {
    
    /** Optional. Restricts the retrieved cookies to those whose domains match or are subdomains of this one.  */
    var domain: js.UndefOr[String] = js.undefined
    
    /** Optional. Filters the cookies by name.  */
    var name: js.UndefOr[String] = js.undefined
    
    /** Optional. Restricts the retrieved cookies to those whose path exactly matches this string.  */
    var path: js.UndefOr[String] = js.undefined
    
    /** Optional. Filters the cookies by their Secure property.  */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. Filters out session vs. persistent cookies.  */
    var session: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be used.  */
    var storeId: js.UndefOr[String] = js.undefined
    
    /** Optional. Restricts the retrieved cookies to those that would match the given URL.  */
    var url: js.UndefOr[String] = js.undefined
  }
  object GetAllDetails {
    
    inline def apply(): GetAllDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAllDetails]
    }
    
    extension [Self <: GetAllDetails](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.naverWhale.naverWhaleStrings.unspecified
    - typings.naverWhale.naverWhaleStrings.no_restriction
    - typings.naverWhale.naverWhaleStrings.lax
    - typings.naverWhale.naverWhaleStrings.strict
  */
  trait SameSiteStatus extends StObject
  object SameSiteStatus {
    
    inline def lax: typings.naverWhale.naverWhaleStrings.lax = "lax".asInstanceOf[typings.naverWhale.naverWhaleStrings.lax]
    
    inline def no_restriction: typings.naverWhale.naverWhaleStrings.no_restriction = "no_restriction".asInstanceOf[typings.naverWhale.naverWhaleStrings.no_restriction]
    
    inline def strict: typings.naverWhale.naverWhaleStrings.strict = "strict".asInstanceOf[typings.naverWhale.naverWhaleStrings.strict]
    
    inline def unspecified: typings.naverWhale.naverWhaleStrings.unspecified = "unspecified".asInstanceOf[typings.naverWhale.naverWhaleStrings.unspecified]
  }
  
  trait SetDetails extends StObject {
    
    /** Optional. The domain of the cookie. If omitted, the cookie becomes a host-only cookie.  */
    var domain: js.UndefOr[String] = js.undefined
    
    /** Optional. The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie becomes a session cookie.  */
    var expirationDate: js.UndefOr[Double] = js.undefined
    
    /** Optional. Whether the cookie should be marked as HttpOnly. Defaults to false.  */
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The name of the cookie. Empty by default if omitted.  */
    var name: js.UndefOr[String] = js.undefined
    
    /** Optional. The path of the cookie. Defaults to the path portion of the url parameter.  */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. The cookie's same-site status. Defaults to "unspecified", i.e., if omitted, the cookie is set without specifying a SameSite attribute.
      * @since Chrome 51.
      */
    var sameSite: js.UndefOr[typings.chrome.chrome.cookies.SameSiteStatus] = js.undefined
    
    /** Optional. Whether the cookie should be marked as Secure. Defaults to false.  */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current execution context's cookie store.  */
    var storeId: js.UndefOr[String] = js.undefined
    
    /** The request-URI to associate with the setting of the cookie. This value can affect the default domain and path values of the created cookie. If host permissions for this URL are not specified in the manifest file, the API call will fail. */
    var url: String
    
    /** Optional. The value of the cookie. Empty by default if omitted.  */
    var value: js.UndefOr[String] = js.undefined
  }
  object SetDetails {
    
    inline def apply(url: String): SetDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDetails]
    }
    
    extension [Self <: SetDetails](x: Self) {
      
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
      
      inline def setSameSite(value: typings.chrome.chrome.cookies.SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
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
}
