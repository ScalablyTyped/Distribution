package typings.next

import typings.next.distServerWebSpecExtensionCookiesTypesMod.RequestCookie
import typings.std.Headers
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionCookiesRequestCookiesMod {
  
  @JSImport("next/dist/server/web/spec-extension/cookies/request-cookies", "RequestCookies")
  @js.native
  open class RequestCookies protected () extends StObject {
    def this(requestHeaders: Headers) = this()
    
    val _headers: Headers = js.native
    
    var _parsed: Map[String, RequestCookie] = js.native
    
    /**
      * Delete all the cookies in the cookies in the request.
      */
    def clear(): this.type = js.native
    
    /**
      * Delete the cookies matching the passed name or names in the request.
      */
    def delete(/** Name or names of the cookies to be deleted  */
    names: String): Boolean | js.Array[Boolean] = js.native
    def delete(/** Name or names of the cookies to be deleted  */
    names: js.Array[String]): Boolean | js.Array[Boolean] = js.native
    
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [name: string] | [RequestCookie] is not an array type */ args: js.Array[RequestCookie | (/* name */ String)]
    ): js.UndefOr[RequestCookie] = js.native
    
    def getAll(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [name: string] | [RequestCookie] | [] is not an array type */ args: js.Array[Any | RequestCookie | (/* name */ String)]
    ): js.Array[RequestCookie] = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, RequestCookie]]] = js.native
    
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [key: string, value: string] | [options: RequestCookie] is not an array type */ args: js.Array[/* options */ RequestCookie]
    ): this.type = js.native
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [key: string, value: string] | [options: RequestCookie] is not an array type */ args: js.Tuple2[/* key */ String, /* value */ String]
    ): this.type = js.native
    
    /**
      * The amount of cookies received from the client
      */
    def size: Double = js.native
  }
}
