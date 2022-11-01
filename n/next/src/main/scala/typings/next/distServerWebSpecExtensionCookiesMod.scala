package typings.next

import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionCookiesMod {
  
  @JSImport("next/dist/server/web/spec-extension/cookies", "RequestCookies")
  @js.native
  open class RequestCookies protected ()
    extends typings.next.distServerWebSpecExtensionCookiesRequestCookiesMod.RequestCookies {
    def this(requestHeaders: Headers) = this()
  }
  
  @JSImport("next/dist/server/web/spec-extension/cookies", "ResponseCookies")
  @js.native
  open class ResponseCookies protected ()
    extends typings.next.distServerWebSpecExtensionCookiesResponseCookiesMod.ResponseCookies {
    def this(responseHeaders: Headers) = this()
  }
}
