package typings.next

import typings.next.anon.TrailingSlash
import typings.next.distServerWebNextUrlMod.NextURL
import typings.next.distServerWebSpecExtensionCookiesMod.NextCookies
import typings.std.Blob
import typings.std.BodyInit
import typings.std.FormData
import typings.std.Headers
import typings.std.ReadableStream
import typings.std.Response
import typings.std.ResponseType
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionResponseMod {
  
  @JSImport("next/dist/server/web/spec-extension/response", "NextResponse")
  @js.native
  open class NextResponse ()
    extends StObject
       with Response {
    def this(body: BodyInit) = this()
    def this(body: Null, init: ResponseInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    /* standard dom */
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val body: ReadableStream[js.typedarray.Uint8Array] | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    def cookies: NextCookies = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val headers: Headers = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val ok: Boolean = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val redirected: Boolean = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val status: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val statusText: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val `type`: ResponseType = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val url: String = js.native
  }
  /* static members */
  object NextResponse {
    
    @JSImport("next/dist/server/web/spec-extension/response", "NextResponse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def json(body: Any): NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(body.asInstanceOf[js.Any]).asInstanceOf[NextResponse]
    inline def json(body: Any, init: ResponseInit): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(body.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
    
    inline def next(): NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[NextResponse]
    inline def next(init: MiddlewareResponseInit): NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(init.asInstanceOf[js.Any]).asInstanceOf[NextResponse]
    
    inline def redirect(url: String): NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[NextResponse]
    inline def redirect(url: String, init: Double): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
    inline def redirect(url: String, init: ResponseInit): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
    inline def redirect(url: NextURL): NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[NextResponse]
    inline def redirect(url: NextURL, init: Double): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
    inline def redirect(url: NextURL, init: ResponseInit): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
    inline def redirect(url: URL): NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[NextResponse]
    inline def redirect(url: URL, init: Double): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
    inline def redirect(url: URL, init: ResponseInit): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
    
    inline def rewrite(destination: String): NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any]).asInstanceOf[NextResponse]
    inline def rewrite(destination: String, init: MiddlewareResponseInit): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
    inline def rewrite(destination: NextURL): NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any]).asInstanceOf[NextResponse]
    inline def rewrite(destination: NextURL, init: MiddlewareResponseInit): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
    inline def rewrite(destination: URL): NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any]).asInstanceOf[NextResponse]
    inline def rewrite(destination: URL, init: MiddlewareResponseInit): NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[NextResponse]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.ResponseInit * / any */ trait MiddlewareResponseInit extends StObject {
    
    /**
      * These fields will override the request from clients.
      */
    var request: js.UndefOr[ModifiedRequest] = js.undefined
  }
  object MiddlewareResponseInit {
    
    inline def apply(): MiddlewareResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareResponseInit]
    }
    
    extension [Self <: MiddlewareResponseInit](x: Self) {
      
      inline def setRequest(value: ModifiedRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait ModifiedRequest extends StObject {
    
    /**
      * If this is set, the request headers will be overridden with this value.
      */
    var headers: js.UndefOr[Headers] = js.undefined
  }
  object ModifiedRequest {
    
    inline def apply(): ModifiedRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifiedRequest]
    }
    
    extension [Self <: ModifiedRequest](x: Self) {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.ResponseInit * / any */ trait ResponseInit extends StObject {
    
    var nextConfig: js.UndefOr[TrailingSlash] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ResponseInit {
    
    inline def apply(): ResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInit]
    }
    
    extension [Self <: ResponseInit](x: Self) {
      
      inline def setNextConfig(value: TrailingSlash): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
      
      inline def setNextConfigUndefined: Self = StObject.set(x, "nextConfig", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
