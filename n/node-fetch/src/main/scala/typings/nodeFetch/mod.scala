package typings.nodeFetch

import org.scalablytyped.runtime.StringDictionary
import typings.formData.mod.^
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.Agent
import typings.node.urlMod.URLSearchParams
import typings.node.urlMod.URL_
import typings.nodeFetch.anon.Size
import typings.nodeFetch.externalsMod.AbortSignal
import typings.nodeFetch.nodeFetchStrings.native
import typings.nodeFetch.nodeFetchStrings.transparent
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Error
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(url: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
    inline def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
    
    @JSImport("node-fetch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def isRedirect(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("node-fetch", "Blob")
  @js.native
  class Blob () extends StObject {
    def this(blobParts: js.Array[BlobPart]) = this()
    def this(blobParts: js.Array[BlobPart], options: BlobOptions) = this()
    def this(blobParts: Unit, options: BlobOptions) = this()
    
    val size: Double = js.native
    
    def slice(): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Unit, end: Double): Blob = js.native
    
    val `type`: String = js.native
  }
  
  @JSImport("node-fetch", "Body")
  @js.native
  class Body () extends StObject {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: Size) = this()
    def this(body: Unit, opts: Size) = this()
    
    def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    def blob(): js.Promise[Blob] = js.native
    
    var body: ReadableStream = js.native
    
    var bodyUsed: Boolean = js.native
    
    def buffer(): js.Promise[Buffer] = js.native
    
    def json(): js.Promise[js.Any] = js.native
    
    var size: Double = js.native
    
    def text(): js.Promise[String] = js.native
    
    def textConverted(): js.Promise[String] = js.native
    
    var timeout: Double = js.native
  }
  
  @JSImport("node-fetch", "FetchError")
  @js.native
  class FetchError protected ()
    extends StObject
       with Error {
    def this(message: String, `type`: String) = this()
    def this(message: String, `type`: String, systemError: SystemError) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var errno: js.UndefOr[String] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_FetchError: typings.nodeFetch.nodeFetchStrings.FetchError = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("node-fetch", "Headers")
  @js.native
  class Headers ()
    extends StObject
       with Iterable[js.Tuple2[String, String]] {
    def this(init: HeadersInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    // Iterable methods
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callback: js.Function2[/* value */ String, /* name */ String, Unit]): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def raw(): StringDictionary[js.Array[String]] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def values(): IterableIterator[js.Array[String]] = js.native
  }
  
  @JSImport("node-fetch", "Request")
  @js.native
  class Request protected ()
    extends Body
       with _RequestInfo {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    
    // node-fetch extensions to the whatwg/fetch spec
    var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.native
    
    var compress: Boolean = js.native
    
    var context: RequestContext = js.native
    
    var counter: Double = js.native
    
    var follow: Double = js.native
    
    var headers: Headers = js.native
    
    var hostname: String = js.native
    
    var method: String = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: String = js.native
    
    var redirect: RequestRedirect = js.native
    
    var referrer: String = js.native
    
    var url: String = js.native
  }
  
  @JSImport("node-fetch", "Response")
  @js.native
  class Response () extends Body {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    var headers: Headers = js.native
    
    var ok: Boolean = js.native
    
    var redirected: Boolean = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
    
    var `type`: ResponseType = js.native
    
    var url: String = js.native
  }
  /* static members */
  object Response {
    
    @JSImport("node-fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[Response]
    
    inline def redirect(url: String, status: Double): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Response]
  }
  
  trait BlobOptions extends StObject {
    
    var endings: js.UndefOr[transparent | native] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BlobOptions {
    
    inline def apply(): BlobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlobOptions]
    }
    
    extension [Self <: BlobOptions](x: Self) {
      
      inline def setEndings(value: transparent | native): Self = StObject.set(x, "endings", value.asInstanceOf[js.Any])
      
      inline def setEndingsUndefined: Self = StObject.set(x, "endings", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type BlobPart = ArrayBuffer | ArrayBufferView | Blob | String
  
  type BodyInit = ArrayBuffer | ArrayBufferView | ReadableStream | String | URLSearchParams | ^
  
  type HeaderInit = HeadersInit
  
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings.default
    - typings.nodeFetch.nodeFetchStrings.`force-cache`
    - typings.nodeFetch.nodeFetchStrings.`no-cache`
    - typings.nodeFetch.nodeFetchStrings.`no-store`
    - typings.nodeFetch.nodeFetchStrings.`only-if-cached`
    - typings.nodeFetch.nodeFetchStrings.reload
  */
  trait RequestCache extends StObject
  object RequestCache {
    
    inline def default: typings.nodeFetch.nodeFetchStrings.default = "default".asInstanceOf[typings.nodeFetch.nodeFetchStrings.default]
    
    inline def `force-cache`: typings.nodeFetch.nodeFetchStrings.`force-cache` = "force-cache".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`force-cache`]
    
    inline def `no-cache`: typings.nodeFetch.nodeFetchStrings.`no-cache` = "no-cache".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`no-cache`]
    
    inline def `no-store`: typings.nodeFetch.nodeFetchStrings.`no-store` = "no-store".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`no-store`]
    
    inline def `only-if-cached`: typings.nodeFetch.nodeFetchStrings.`only-if-cached` = "only-if-cached".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`only-if-cached`]
    
    inline def reload: typings.nodeFetch.nodeFetchStrings.reload = "reload".asInstanceOf[typings.nodeFetch.nodeFetchStrings.reload]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings.audio
    - typings.nodeFetch.nodeFetchStrings.beacon
    - typings.nodeFetch.nodeFetchStrings.cspreport
    - typings.nodeFetch.nodeFetchStrings.download
    - typings.nodeFetch.nodeFetchStrings.embed
    - typings.nodeFetch.nodeFetchStrings.eventsource
    - typings.nodeFetch.nodeFetchStrings.favicon
    - typings.nodeFetch.nodeFetchStrings.fetch
    - typings.nodeFetch.nodeFetchStrings.font
    - typings.nodeFetch.nodeFetchStrings.form
    - typings.nodeFetch.nodeFetchStrings.frame
    - typings.nodeFetch.nodeFetchStrings.hyperlink
    - typings.nodeFetch.nodeFetchStrings.iframe
    - typings.nodeFetch.nodeFetchStrings.image
    - typings.nodeFetch.nodeFetchStrings.imageset
    - typings.nodeFetch.nodeFetchStrings.`import`
    - typings.nodeFetch.nodeFetchStrings.internal
    - typings.nodeFetch.nodeFetchStrings.location
    - typings.nodeFetch.nodeFetchStrings.manifest
    - typings.nodeFetch.nodeFetchStrings.`object`
    - typings.nodeFetch.nodeFetchStrings.ping
    - typings.nodeFetch.nodeFetchStrings.plugin
    - typings.nodeFetch.nodeFetchStrings.prefetch
    - typings.nodeFetch.nodeFetchStrings.script
    - typings.nodeFetch.nodeFetchStrings.serviceworker
    - typings.nodeFetch.nodeFetchStrings.sharedworker
    - typings.nodeFetch.nodeFetchStrings.style
    - typings.nodeFetch.nodeFetchStrings.subresource
    - typings.nodeFetch.nodeFetchStrings.track
    - typings.nodeFetch.nodeFetchStrings.video
    - typings.nodeFetch.nodeFetchStrings.worker
    - typings.nodeFetch.nodeFetchStrings.xmlhttprequest
    - typings.nodeFetch.nodeFetchStrings.xslt
  */
  trait RequestContext extends StObject
  object RequestContext {
    
    inline def audio: typings.nodeFetch.nodeFetchStrings.audio = "audio".asInstanceOf[typings.nodeFetch.nodeFetchStrings.audio]
    
    inline def beacon: typings.nodeFetch.nodeFetchStrings.beacon = "beacon".asInstanceOf[typings.nodeFetch.nodeFetchStrings.beacon]
    
    inline def cspreport: typings.nodeFetch.nodeFetchStrings.cspreport = "cspreport".asInstanceOf[typings.nodeFetch.nodeFetchStrings.cspreport]
    
    inline def download: typings.nodeFetch.nodeFetchStrings.download = "download".asInstanceOf[typings.nodeFetch.nodeFetchStrings.download]
    
    inline def embed: typings.nodeFetch.nodeFetchStrings.embed = "embed".asInstanceOf[typings.nodeFetch.nodeFetchStrings.embed]
    
    inline def eventsource: typings.nodeFetch.nodeFetchStrings.eventsource = "eventsource".asInstanceOf[typings.nodeFetch.nodeFetchStrings.eventsource]
    
    inline def favicon: typings.nodeFetch.nodeFetchStrings.favicon = "favicon".asInstanceOf[typings.nodeFetch.nodeFetchStrings.favicon]
    
    inline def fetch: typings.nodeFetch.nodeFetchStrings.fetch = "fetch".asInstanceOf[typings.nodeFetch.nodeFetchStrings.fetch]
    
    inline def font: typings.nodeFetch.nodeFetchStrings.font = "font".asInstanceOf[typings.nodeFetch.nodeFetchStrings.font]
    
    inline def form: typings.nodeFetch.nodeFetchStrings.form = "form".asInstanceOf[typings.nodeFetch.nodeFetchStrings.form]
    
    inline def frame: typings.nodeFetch.nodeFetchStrings.frame = "frame".asInstanceOf[typings.nodeFetch.nodeFetchStrings.frame]
    
    inline def hyperlink: typings.nodeFetch.nodeFetchStrings.hyperlink = "hyperlink".asInstanceOf[typings.nodeFetch.nodeFetchStrings.hyperlink]
    
    inline def iframe: typings.nodeFetch.nodeFetchStrings.iframe = "iframe".asInstanceOf[typings.nodeFetch.nodeFetchStrings.iframe]
    
    inline def image: typings.nodeFetch.nodeFetchStrings.image = "image".asInstanceOf[typings.nodeFetch.nodeFetchStrings.image]
    
    inline def imageset: typings.nodeFetch.nodeFetchStrings.imageset = "imageset".asInstanceOf[typings.nodeFetch.nodeFetchStrings.imageset]
    
    inline def `import`: typings.nodeFetch.nodeFetchStrings.`import` = "import".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`import`]
    
    inline def internal: typings.nodeFetch.nodeFetchStrings.internal = "internal".asInstanceOf[typings.nodeFetch.nodeFetchStrings.internal]
    
    inline def location: typings.nodeFetch.nodeFetchStrings.location = "location".asInstanceOf[typings.nodeFetch.nodeFetchStrings.location]
    
    inline def manifest: typings.nodeFetch.nodeFetchStrings.manifest = "manifest".asInstanceOf[typings.nodeFetch.nodeFetchStrings.manifest]
    
    inline def `object`: typings.nodeFetch.nodeFetchStrings.`object` = "object".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`object`]
    
    inline def ping: typings.nodeFetch.nodeFetchStrings.ping = "ping".asInstanceOf[typings.nodeFetch.nodeFetchStrings.ping]
    
    inline def plugin: typings.nodeFetch.nodeFetchStrings.plugin = "plugin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.plugin]
    
    inline def prefetch: typings.nodeFetch.nodeFetchStrings.prefetch = "prefetch".asInstanceOf[typings.nodeFetch.nodeFetchStrings.prefetch]
    
    inline def script: typings.nodeFetch.nodeFetchStrings.script = "script".asInstanceOf[typings.nodeFetch.nodeFetchStrings.script]
    
    inline def serviceworker: typings.nodeFetch.nodeFetchStrings.serviceworker = "serviceworker".asInstanceOf[typings.nodeFetch.nodeFetchStrings.serviceworker]
    
    inline def sharedworker: typings.nodeFetch.nodeFetchStrings.sharedworker = "sharedworker".asInstanceOf[typings.nodeFetch.nodeFetchStrings.sharedworker]
    
    inline def style: typings.nodeFetch.nodeFetchStrings.style = "style".asInstanceOf[typings.nodeFetch.nodeFetchStrings.style]
    
    inline def subresource: typings.nodeFetch.nodeFetchStrings.subresource = "subresource".asInstanceOf[typings.nodeFetch.nodeFetchStrings.subresource]
    
    inline def track: typings.nodeFetch.nodeFetchStrings.track = "track".asInstanceOf[typings.nodeFetch.nodeFetchStrings.track]
    
    inline def video: typings.nodeFetch.nodeFetchStrings.video = "video".asInstanceOf[typings.nodeFetch.nodeFetchStrings.video]
    
    inline def worker: typings.nodeFetch.nodeFetchStrings.worker = "worker".asInstanceOf[typings.nodeFetch.nodeFetchStrings.worker]
    
    inline def xmlhttprequest: typings.nodeFetch.nodeFetchStrings.xmlhttprequest = "xmlhttprequest".asInstanceOf[typings.nodeFetch.nodeFetchStrings.xmlhttprequest]
    
    inline def xslt: typings.nodeFetch.nodeFetchStrings.xslt = "xslt".asInstanceOf[typings.nodeFetch.nodeFetchStrings.xslt]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings.omit
    - typings.nodeFetch.nodeFetchStrings.include
    - typings.nodeFetch.nodeFetchStrings.`same-origin`
  */
  trait RequestCredentials extends StObject
  object RequestCredentials {
    
    inline def include: typings.nodeFetch.nodeFetchStrings.include = "include".asInstanceOf[typings.nodeFetch.nodeFetchStrings.include]
    
    inline def omit: typings.nodeFetch.nodeFetchStrings.omit = "omit".asInstanceOf[typings.nodeFetch.nodeFetchStrings.omit]
    
    inline def `same-origin`: typings.nodeFetch.nodeFetchStrings.`same-origin` = "same-origin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.nodeFetch.mod.URLLike
    - typings.nodeFetch.mod.Request
  */
  type RequestInfo = _RequestInfo | String
  
  trait RequestInit extends StObject {
    
    // node-fetch extensions
    var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.undefined
    
    // whatwg/fetch standard options
    var body: js.UndefOr[BodyInit] = js.undefined
    
    // =null http.Agent instance, allows custom proxy, certificate etc.
    var compress: js.UndefOr[Boolean] = js.undefined
    
    // =true support gzip/deflate content encoding. false to disable
    var follow: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    // =20 maximum redirect count. 0 to not follow redirect
    var size: js.UndefOr[Double] = js.undefined
    
    // =0 maximum response body size in bytes. 0 to disable
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    extension [Self <: RequestInit](x: Self) {
      
      inline def setAgent(value: Agent | (js.Function1[/* parsedUrl */ URL_, Agent])): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* parsedUrl */ URL_ => Agent): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings.cors
    - typings.nodeFetch.nodeFetchStrings.`no-cors`
    - typings.nodeFetch.nodeFetchStrings.`same-origin`
  */
  trait RequestMode extends StObject
  object RequestMode {
    
    inline def cors: typings.nodeFetch.nodeFetchStrings.cors = "cors".asInstanceOf[typings.nodeFetch.nodeFetchStrings.cors]
    
    inline def `no-cors`: typings.nodeFetch.nodeFetchStrings.`no-cors` = "no-cors".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`no-cors`]
    
    inline def `same-origin`: typings.nodeFetch.nodeFetchStrings.`same-origin` = "same-origin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings.error
    - typings.nodeFetch.nodeFetchStrings.follow
    - typings.nodeFetch.nodeFetchStrings.manual
  */
  trait RequestRedirect extends StObject
  object RequestRedirect {
    
    inline def error: typings.nodeFetch.nodeFetchStrings.error = "error".asInstanceOf[typings.nodeFetch.nodeFetchStrings.error]
    
    inline def follow: typings.nodeFetch.nodeFetchStrings.follow = "follow".asInstanceOf[typings.nodeFetch.nodeFetchStrings.follow]
    
    inline def manual: typings.nodeFetch.nodeFetchStrings.manual = "manual".asInstanceOf[typings.nodeFetch.nodeFetchStrings.manual]
  }
  
  trait ResponseInit extends StObject {
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ResponseInit {
    
    inline def apply(): ResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInit]
    }
    
    extension [Self <: ResponseInit](x: Self) {
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings.basic
    - typings.nodeFetch.nodeFetchStrings.cors
    - typings.nodeFetch.nodeFetchStrings.default
    - typings.nodeFetch.nodeFetchStrings.error
    - typings.nodeFetch.nodeFetchStrings.opaque
    - typings.nodeFetch.nodeFetchStrings.opaqueredirect
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    inline def default: typings.nodeFetch.nodeFetchStrings.default = "default".asInstanceOf[typings.nodeFetch.nodeFetchStrings.default]
    
    inline def basic: typings.nodeFetch.nodeFetchStrings.basic = "basic".asInstanceOf[typings.nodeFetch.nodeFetchStrings.basic]
    
    inline def cors: typings.nodeFetch.nodeFetchStrings.cors = "cors".asInstanceOf[typings.nodeFetch.nodeFetchStrings.cors]
    
    inline def error: typings.nodeFetch.nodeFetchStrings.error = "error".asInstanceOf[typings.nodeFetch.nodeFetchStrings.error]
    
    inline def opaque: typings.nodeFetch.nodeFetchStrings.opaque = "opaque".asInstanceOf[typings.nodeFetch.nodeFetchStrings.opaque]
    
    inline def opaqueredirect: typings.nodeFetch.nodeFetchStrings.opaqueredirect = "opaqueredirect".asInstanceOf[typings.nodeFetch.nodeFetchStrings.opaqueredirect]
  }
  
  trait SystemError
    extends StObject
       with Error {
    
    var code: js.UndefOr[String] = js.undefined
  }
  object SystemError {
    
    inline def apply(message: String, name: String): SystemError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemError]
    }
    
    extension [Self <: SystemError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    }
  }
  
  trait URLLike
    extends StObject
       with _RequestInfo {
    
    var href: String
  }
  object URLLike {
    
    inline def apply(href: String): URLLike = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLLike]
    }
    
    extension [Self <: URLLike](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  trait _RequestInfo extends StObject
}
