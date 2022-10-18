package typings.next

import typings.next.anon.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionFetchEventMod {
  
  @JSImport("next/dist/server/web/spec-extension/fetch-event", "NextFetchEvent")
  @js.native
  open class NextFetchEvent protected ()
    extends StObject
       with FetchEvent {
    def this(params: Request) = this()
    
    /**
      * @deprecated The `request` is now the first parameter and the API is now async.
      *
      * Read more: https://nextjs.org/docs/messages/middleware-new-signature
      */
    def request: Unit = js.native
    
    /**
      * @deprecated Using `respondWith` is no longer needed.
      *
      * Read more: https://nextjs.org/docs/messages/middleware-new-signature
      */
    def respondWith(): Unit = js.native
    
    var sourcePage: String = js.native
  }
  
  @JSImport("next/dist/server/web/spec-extension/fetch-event", "waitUntilSymbol")
  @js.native
  val waitUntilSymbol: js.Symbol = js.native
  
  @js.native
  trait FetchEvent extends StObject {
    
    def passThroughOnException(): Unit = js.native
    
    def respondWith(response: js.Promise[Response]): Unit = js.native
    def respondWith(response: Response): Unit = js.native
    
    def waitUntil(promise: js.Promise[Any]): Unit = js.native
  }
}
