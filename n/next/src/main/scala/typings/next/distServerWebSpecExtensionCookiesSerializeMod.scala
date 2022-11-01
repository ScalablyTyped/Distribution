package typings.next

import typings.next.distServerWebSpecExtensionCookiesTypesMod.RequestCookie
import typings.next.distServerWebSpecExtensionCookiesTypesMod.ResponseCookie
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionCookiesSerializeMod {
  
  @JSImport("next/dist/server/web/spec-extension/cookies/serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCookieString(cookie: String): Map[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCookieString")(cookie.asInstanceOf[js.Any]).asInstanceOf[Map[String, String]]
  
  inline def parseSetCookieString(setCookie: String): js.UndefOr[ResponseCookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSetCookieString")(setCookie.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ResponseCookie]]
  
  inline def serialize(c: RequestCookie): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(c.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(c: ResponseCookie): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(c.asInstanceOf[js.Any]).asInstanceOf[String]
}
