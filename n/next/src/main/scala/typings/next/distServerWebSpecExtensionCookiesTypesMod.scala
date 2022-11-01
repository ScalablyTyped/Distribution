package typings.next

import typings.next.nextStrings.lax
import typings.next.nextStrings.none
import typings.next.nextStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionCookiesTypesMod {
  
  /* Inlined parent std.Partial<std.Pick<next.next/dist/server/web/spec-extension/cookies/types.CookieSerializeOptions, 'domain' | 'path' | 'expires' | 'secure' | 'sameSite'>> */
  trait CookieListItem extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[js.Date] = js.undefined
    
    /** A string with the name of a cookie. */
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** A string containing the value of the cookie. */
    var value: String
  }
  object CookieListItem {
    
    inline def apply(name: String, value: String): CookieListItem = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieListItem]
    }
    
    extension [Self <: CookieListItem](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CookieSerializeOptions extends StObject {
    
    /**
      * Specifies the value for the Domain Set-Cookie attribute. By default, no
      * domain is set, and most clients will consider the cookie to apply to only
      * the current domain.
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a function that will be used to encode a cookie's value. Since
      * value of a cookie has a limited character set (and must be a simple
      * string), this function can be used to encode a value into a string suited
      * for a cookie's value.
      *
      * The default function is the global `encodeURIComponent`, which will
      * encode a JavaScript string into UTF-8 byte sequences and then URL-encode
      * any that fall outside of the cookie range.
      */
    var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.undefined
    
    /**
      * Specifies the `Date` object to be the value for the `Expires`
      * `Set-Cookie` attribute. By default, no expiration is set, and most
      * clients will consider this a "non-persistent cookie" and will delete it
      * on a condition like exiting a web browser application.
      *
      * *Note* the cookie storage model specification states that if both
      * `expires` and `maxAge` are set, then `maxAge` takes precedence, but it is
      * possible not all clients by obey this, so if both are set, they should
      * point to the same date and time.
      */
    var expires: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Specifies the boolean value for the `HttpOnly` `Set-Cookie` attribute.
      * When truthy, the `HttpOnly` attribute is set, otherwise it is not. By
      * default, the `HttpOnly` attribute is not set.
      *
      * *Note* be careful when setting this to true, as compliant clients will
      * not allow client-side JavaScript to see the cookie in `document.cookie`.
      */
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the number (in seconds) to be the value for the `Max-Age`
      * `Set-Cookie` attribute. The given number will be converted to an integer
      * by rounding down. By default, no maximum age is set.
      *
      * *Note* the cookie storage model specification states that if both
      * `expires` and `maxAge` are set, then `maxAge` takes precedence, but it is
      * possible not all clients by obey this, so if both are set, they should
      * point to the same date and time.
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the value for the `Path` `Set-Cookie` attribute. By default,
      * the path is considered the "default path".
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the boolean or string to be the value for the `SameSite`
      * `Set-Cookie` attribute.
      *
      * - `true` will set the `SameSite` attribute to `Strict` for strict same
      * site enforcement.
      * - `false` will not set the `SameSite` attribute.
      * - `'lax'` will set the `SameSite` attribute to Lax for lax same site
      * enforcement.
      * - `'strict'` will set the `SameSite` attribute to Strict for strict same
      * site enforcement.
      *  - `'none'` will set the SameSite attribute to None for an explicit
      *  cross-site cookie.
      */
    var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
    
    /**
      * Specifies the boolean value for the `Secure` `Set-Cookie` attribute. When
      * truthy, the `Secure` attribute is set, otherwise it is not. By default,
      * the `Secure` attribute is not set.
      *
      * *Note* be careful when setting this to `true`, as compliant clients will
      * not send the cookie back to the server in the future if the browser does
      * not have an HTTPS connection.
      */
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieSerializeOptions {
    
    inline def apply(): CookieSerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieSerializeOptions]
    }
    
    extension [Self <: CookieSerializeOptions](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncode(value: /* val */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  /* Inlined std.Pick<next.next/dist/server/web/spec-extension/cookies/types.CookieListItem, 'name' | 'value'> */
  trait RequestCookie extends StObject {
    
    var name: String
    
    var value: String
  }
  object RequestCookie {
    
    inline def apply(name: String, value: String): RequestCookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestCookie]
    }
    
    extension [Self <: RequestCookie](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined next.next/dist/server/web/spec-extension/cookies/types.CookieListItem & std.Partial<std.Pick<next.next/dist/server/web/spec-extension/cookies/types.CookieSerializeOptions, 'httpOnly' | 'maxAge'>> */
  trait ResponseCookie extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[js.Date] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /** A string with the name of a cookie. */
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** A string containing the value of the cookie. */
    var value: String
  }
  object ResponseCookie {
    
    inline def apply(name: String, value: String): ResponseCookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseCookie]
    }
    
    extension [Self <: ResponseCookie](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
