package typings.nextAuth

import typings.cookie.mod.CookieSerializeOptions
import typings.nextAuth.anon.Encode
import typings.nextAuth.anon.Headers
import typings.nextAuth.coreTypesMod.CookieOption
import typings.nextAuth.coreTypesMod.CookiesOptions
import typings.nextAuth.coreTypesMod.SessionStrategy
import typings.nextAuth.utilsLoggerMod.LoggerInstance
import typings.std.Console
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibCookieMod {
  
  @JSImport("next-auth/core/lib/cookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next-auth/core/lib/cookie", "SessionStore")
  @js.native
  open class SessionStore protected () extends StObject {
    def this(option: CookieOption, req: Headers, logger: LoggerInstance) = this()
    def this(option: CookieOption, req: Headers, logger: Console) = this()
    
    /**
      * Given a cookie value, return new cookies, chunked, to fit the allowed cookie size.
      * If the cookie has changed from chunked to unchunked or vice versa,
      * it deletes the old cookies as well.
      */
    def chunk(value: String, options: Partial[CookieSerializeOptions]): js.Array[Cookie] = js.native
    
    /** Returns a list of cookies that should be cleaned. */
    def clean(): js.Array[Cookie] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def value: String = js.native
  }
  
  inline def defaultCookies(useSecureCookies: Boolean): CookiesOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultCookies")(useSecureCookies.asInstanceOf[js.Any]).asInstanceOf[CookiesOptions]
  
  trait Cookie
    extends StObject
       with CookieOption {
    
    var value: String
  }
  object Cookie {
    
    inline def apply(name: String, options: CookieSerializeOptions, value: String): Cookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    extension [Self <: Cookie](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type JWTString = String
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends 'jwt' ? next-auth.next-auth/core/lib/cookie.JWTString : string
    }}}
    */
  @js.native
  trait SessionToken[T /* <: SessionStrategy */] extends StObject
  
  type SetCookieOptions = Partial[CookieSerializeOptions] & Encode
}
