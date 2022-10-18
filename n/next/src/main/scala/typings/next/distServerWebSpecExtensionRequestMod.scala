package typings.next

import typings.next.anon.City
import typings.next.anon.Country
import typings.next.anon.I18n
import typings.next.distServerWebNextUrlMod.NextURL
import typings.next.distServerWebSpecExtensionCookiesMod.NextCookies
import typings.std.AbortSignal
import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.ReadableStream
import typings.std.ReferrerPolicy
import typings.std.Request
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestDestination
import typings.std.RequestInfo
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionRequestMod {
  
  @JSImport("next/dist/server/web/spec-extension/request", "INTERNALS")
  @js.native
  val INTERNALS: js.Symbol = js.native
  
  @JSImport("next/dist/server/web/spec-extension/request", "NextRequest")
  @js.native
  open class NextRequest protected ()
    extends StObject
       with Request {
    def this(input: RequestInfo) = this()
    def this(input: URL) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    def this(input: URL, init: RequestInit) = this()
    
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
    
    /** Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching. */
    /* standard dom */
    /* CompleteClass */
    override val cache: RequestCache = js.native
    
    def cookies: NextCookies = js.native
    
    /** Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. */
    /* standard dom */
    /* CompleteClass */
    override val credentials: RequestCredentials = js.native
    
    /** Returns the kind of resource requested by request, e.g., "document" or "script". */
    /* standard dom */
    /* CompleteClass */
    override val destination: RequestDestination = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    def geo: js.UndefOr[City] = js.native
    
    /** Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header. */
    /* standard dom */
    /* CompleteClass */
    override val headers: Headers = js.native
    
    /** Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI] */
    /* standard dom */
    /* CompleteClass */
    override val integrity: String = js.native
    
    def ip: js.UndefOr[String] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    /** Returns a boolean indicating whether or not request can outlive the global in which it was created. */
    /* standard dom */
    /* CompleteClass */
    override val keepalive: Boolean = js.native
    
    /** Returns request's HTTP method, which is "GET" by default. */
    /* standard dom */
    /* CompleteClass */
    override val method: String = js.native
    
    /** Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs. */
    /* standard dom */
    /* CompleteClass */
    override val mode: RequestMode = js.native
    
    def nextUrl: NextURL = js.native
    
    /**
      * @deprecated
      * `page` has been deprecated in favour of `URLPattern`.
      * Read more: https://nextjs.org/docs/messages/middleware-request-page
      */
    def page: Unit = js.native
    
    /** Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default. */
    /* standard dom */
    /* CompleteClass */
    override val redirect: RequestRedirect = js.native
    
    /** Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made. */
    /* standard dom */
    /* CompleteClass */
    override val referrer: String = js.native
    
    /** Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer. */
    /* standard dom */
    /* CompleteClass */
    override val referrerPolicy: ReferrerPolicy = js.native
    
    /** Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler. */
    /* standard dom */
    /* CompleteClass */
    override val signal: AbortSignal = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /**
      * @deprecated
      * `ua` has been removed in favour of \`userAgent\` function.
      * Read more: https://nextjs.org/docs/messages/middleware-parse-user-agent
      */
    def ua: Unit = js.native
    
    /** Returns the URL of request as a string. */
    /* standard dom */
    /* CompleteClass */
    override val url: String = js.native
    @JSName("url")
    def url_MNextRequest: String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.RequestInit * / any */ trait RequestInit extends StObject {
    
    var geo: js.UndefOr[Country] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var nextConfig: js.UndefOr[I18n] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    extension [Self <: RequestInit](x: Self) {
      
      inline def setGeo(value: Country): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setNextConfig(value: I18n): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
      
      inline def setNextConfigUndefined: Self = StObject.set(x, "nextConfig", js.undefined)
    }
  }
}
