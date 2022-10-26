package typings.next

import typings.next.`distCompiled@edgeRuntimePrimitivesUrlMod`.URLPatternInput
import typings.next.anon.HeadersHeaders
import typings.next.anon.Request
import typings.next.distServerWebNextUrlMod.NextURL
import typings.next.distServerWebSpecExtensionResponseMod.MiddlewareResponseInit
import typings.next.distServerWebSpecExtensionResponseMod.ResponseInit
import typings.next.distServerWebSpecExtensionUserAgentMod.UserAgent_
import typings.std.BodyInit
import typings.std.RequestInfo
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("next/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/server", "NextFetchEvent")
  @js.native
  open class NextFetchEvent protected ()
    extends typings.next.distServerWebSpecExtensionFetchEventMod.NextFetchEvent {
    def this(params: Request) = this()
  }
  
  @JSImport("next/server", "NextRequest")
  @js.native
  open class NextRequest protected ()
    extends typings.next.distServerWebSpecExtensionRequestMod.NextRequest {
    def this(input: RequestInfo) = this()
    def this(input: URL) = this()
    def this(input: RequestInfo, init: typings.next.distServerWebSpecExtensionRequestMod.RequestInit) = this()
    def this(input: URL, init: typings.next.distServerWebSpecExtensionRequestMod.RequestInit) = this()
  }
  
  @JSImport("next/server", "NextResponse")
  @js.native
  open class NextResponse ()
    extends typings.next.distServerWebSpecExtensionResponseMod.NextResponse {
    def this(body: BodyInit) = this()
    def this(body: Null, init: ResponseInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  /* static members */
  object NextResponse {
    
    @JSImport("next/server", "NextResponse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def json(body: Any): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(body.asInstanceOf[js.Any]).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def json(body: Any, init: ResponseInit): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(body.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    
    inline def next(): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def next(init: MiddlewareResponseInit): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(init.asInstanceOf[js.Any]).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    
    inline def redirect(url: String): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: String, init: Double): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: String, init: ResponseInit): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: NextURL): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: NextURL, init: Double): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: NextURL, init: ResponseInit): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: URL): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: URL, init: Double): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: URL, init: ResponseInit): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    
    inline def rewrite(destination: String): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any]).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: String, init: MiddlewareResponseInit): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: NextURL): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any]).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: NextURL, init: MiddlewareResponseInit): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: URL): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any]).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: URL, init: MiddlewareResponseInit): typings.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.next.distServerWebSpecExtensionResponseMod.NextResponse]
  }
  
  @JSImport("next/server", "URLPattern")
  @js.native
  open class URLPattern () extends StObject {
    def this(init: URLPatternInput) = this()
    def this(init: Unit, baseURL: String) = this()
    def this(init: URLPatternInput, baseURL: String) = this()
  }
  
  object global {
    
    /**
      * This class creates stores that stay coherent through asynchronous operations.
      *
      * While you can create your own implementation on top of the `async_hooks` module,`AsyncLocalStorage` should be preferred as it is a performant and memory safe
      * implementation that involves significant optimizations that are non-obvious to
      * implement.
      *
      * The following example uses `AsyncLocalStorage` to build a simple logger
      * that assigns IDs to incoming HTTP requests and includes them in messages
      * logged within each request.
      *
      * ```js
      * import http from 'http';
      * import { AsyncLocalStorage } from 'async_hooks';
      *
      * const asyncLocalStorage = new AsyncLocalStorage();
      *
      * function logWithId(msg) {
      *   const id = asyncLocalStorage.getStore();
      *   console.log(`${id !== undefined ? id : '-'}:`, msg);
      * }
      *
      * let idSeq = 0;
      * http.createServer((req, res) => {
      *   asyncLocalStorage.run(idSeq++, () => {
      *     logWithId('start');
      *     // Imagine any chain of async operations here
      *     setImmediate(() => {
      *       logWithId('finish');
      *       res.end();
      *     });
      *   });
      * }).listen(8080);
      *
      * http.get('http://localhost:8080');
      * http.get('http://localhost:8080');
      * // Prints:
      * //   0: start
      * //   1: start
      * //   0: finish
      * //   1: finish
      * ```
      *
      * Each instance of `AsyncLocalStorage` maintains an independent storage context.
      * Multiple instances can safely exist simultaneously without risk of interfering
      * with each other's data.
      * @since v13.10.0, v12.17.0
      */
    /* was `typeof NodeAsyncLocalStorage` */
    @JSGlobal("AsyncLocalStorage")
    @js.native
    open class AsyncLocalStorage[T] ()
      extends typings.node.asyncHooksMod.AsyncLocalStorage[T]
  }
  
  inline def userAgent(param0: HeadersHeaders): UserAgent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgent")(param0.asInstanceOf[js.Any]).asInstanceOf[UserAgent_]
  
  inline def userAgentFromString(): UserAgent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentFromString")().asInstanceOf[UserAgent_]
  inline def userAgentFromString(input: String): UserAgent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentFromString")(input.asInstanceOf[js.Any]).asInstanceOf[UserAgent_]
}
