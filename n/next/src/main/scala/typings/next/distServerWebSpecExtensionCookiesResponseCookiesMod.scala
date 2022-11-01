package typings.next

import typings.next.anon.PartialResponseCookie
import typings.next.distServerWebSpecExtensionCookiesTypesMod.ResponseCookie
import typings.std.Headers
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionCookiesResponseCookiesMod {
  
  @JSImport("next/dist/server/web/spec-extension/cookies/response-cookies", "ResponseCookies")
  @js.native
  open class ResponseCookies protected () extends StObject {
    def this(responseHeaders: Headers) = this()
    
    val _headers: Headers = js.native
    
    var _parsed: Map[String, ResponseCookie] = js.native
    
    /**
      * {@link https://wicg.github.io/cookie-store/#CookieStore-delete CookieStore#delete} without the Promise.
      */
    def delete(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [key: string] | [options: ResponseCookie] is not an array type */ args: js.Array[(/* options */ ResponseCookie) | (/* key */ String)]
    ): this.type = js.native
    
    /**
      * {@link https://wicg.github.io/cookie-store/#CookieStore-get CookieStore#get} without the Promise.
      */
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [key: string] | [options: ResponseCookie] is not an array type */ args: js.Array[(/* options */ ResponseCookie) | (/* key */ String)]
    ): js.UndefOr[ResponseCookie] = js.native
    
    /**
      * {@link https://wicg.github.io/cookie-store/#CookieStore-getAll CookieStore#getAll} without the Promise.
      */
    def getAll(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [key: string] | [options: ResponseCookie] | [] is not an array type */ args: js.Array[Any | (/* options */ ResponseCookie) | (/* key */ String)]
    ): js.Array[ResponseCookie] = js.native
    
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [key: string, value: string, cookie: Partial<ResponseCookie> | undefined] | [options: ResponseCookie] is not an array type */ args: js.Array[/* options */ ResponseCookie]
    ): this.type = js.native
    /**
      * {@link https://wicg.github.io/cookie-store/#CookieStore-set CookieStore#set} without the Promise.
      */
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [key: string, value: string, cookie: Partial<ResponseCookie> | undefined] | [options: ResponseCookie] is not an array type */ args: js.Tuple3[/* key */ String, /* value */ String, /* cookie */ js.UndefOr[PartialResponseCookie]]
    ): this.type = js.native
  }
}
