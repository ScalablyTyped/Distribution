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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("node-fetch", JSImport.Default)
    @js.native
    def apply(url: RequestInfo): js.Promise[Response] = js.native
    @JSImport("node-fetch", JSImport.Default)
    @js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    
    @JSImport("node-fetch", "default.isRedirect")
    @js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
  @JSImport("node-fetch", "Blob")
  @js.native
  class Blob () extends StObject {
    def this(blobParts: js.Array[BlobPart]) = this()
    def this(blobParts: js.UndefOr[scala.Nothing], options: BlobOptions) = this()
    def this(blobParts: js.Array[BlobPart], options: BlobOptions) = this()
    
    val size: Double = js.native
    
    def slice(): Blob = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    
    val `type`: String = js.native
  }
  
  @JSImport("node-fetch", "Body")
  @js.native
  class Body () extends StObject {
    def this(body: js.Any) = this()
    def this(body: js.UndefOr[scala.Nothing], opts: Size) = this()
    def this(body: js.Any, opts: Size) = this()
    
    def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    def blob(): js.Promise[Blob] = js.native
    
    var body: ReadableStream = js.native
    
    var bodyUsed: Boolean = js.native
    
    def buffer(): js.Promise[Buffer] = js.native
    
    def json(): js.Promise[_] = js.native
    
    var size: Double = js.native
    
    def text(): js.Promise[String] = js.native
    
    def textConverted(): js.Promise[String] = js.native
    
    var timeout: Double = js.native
  }
  
  @JSImport("node-fetch", "FetchError")
  @js.native
  class FetchError protected () extends Error {
    def this(message: String, `type`: String) = this()
    def this(message: String, `type`: String, systemError: SystemError) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var errno: js.UndefOr[String] = js.native
    
    @JSName("name")
    var name_FetchError: typings.nodeFetch.nodeFetchStrings.FetchError = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("node-fetch", "Headers")
  @js.native
  class Headers ()
    extends Iterable[js.Tuple2[String, String]] {
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
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
    
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
    
    @JSImport("node-fetch", "Response.error")
    @js.native
    def error(): Response = js.native
    
    @JSImport("node-fetch", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): Response = js.native
  }
  
  @js.native
  trait BlobOptions extends StObject {
    
    var endings: js.UndefOr[transparent | native] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object BlobOptions {
    
    @scala.inline
    def apply(): BlobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlobOptions]
    }
    
    @scala.inline
    implicit class BlobOptionsMutableBuilder[Self <: BlobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndings(value: transparent | native): Self = StObject.set(x, "endings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndingsUndefined: Self = StObject.set(x, "endings", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    @scala.inline
    def default: typings.nodeFetch.nodeFetchStrings.default = "default".asInstanceOf[typings.nodeFetch.nodeFetchStrings.default]
    
    @scala.inline
    def `force-cache`: typings.nodeFetch.nodeFetchStrings.`force-cache` = "force-cache".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`force-cache`]
    
    @scala.inline
    def `no-cache`: typings.nodeFetch.nodeFetchStrings.`no-cache` = "no-cache".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`no-cache`]
    
    @scala.inline
    def `no-store`: typings.nodeFetch.nodeFetchStrings.`no-store` = "no-store".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`no-store`]
    
    @scala.inline
    def `only-if-cached`: typings.nodeFetch.nodeFetchStrings.`only-if-cached` = "only-if-cached".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`only-if-cached`]
    
    @scala.inline
    def reload: typings.nodeFetch.nodeFetchStrings.reload = "reload".asInstanceOf[typings.nodeFetch.nodeFetchStrings.reload]
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
    
    @scala.inline
    def audio: typings.nodeFetch.nodeFetchStrings.audio = "audio".asInstanceOf[typings.nodeFetch.nodeFetchStrings.audio]
    
    @scala.inline
    def beacon: typings.nodeFetch.nodeFetchStrings.beacon = "beacon".asInstanceOf[typings.nodeFetch.nodeFetchStrings.beacon]
    
    @scala.inline
    def cspreport: typings.nodeFetch.nodeFetchStrings.cspreport = "cspreport".asInstanceOf[typings.nodeFetch.nodeFetchStrings.cspreport]
    
    @scala.inline
    def download: typings.nodeFetch.nodeFetchStrings.download = "download".asInstanceOf[typings.nodeFetch.nodeFetchStrings.download]
    
    @scala.inline
    def embed: typings.nodeFetch.nodeFetchStrings.embed = "embed".asInstanceOf[typings.nodeFetch.nodeFetchStrings.embed]
    
    @scala.inline
    def eventsource: typings.nodeFetch.nodeFetchStrings.eventsource = "eventsource".asInstanceOf[typings.nodeFetch.nodeFetchStrings.eventsource]
    
    @scala.inline
    def favicon: typings.nodeFetch.nodeFetchStrings.favicon = "favicon".asInstanceOf[typings.nodeFetch.nodeFetchStrings.favicon]
    
    @scala.inline
    def fetch: typings.nodeFetch.nodeFetchStrings.fetch = "fetch".asInstanceOf[typings.nodeFetch.nodeFetchStrings.fetch]
    
    @scala.inline
    def font: typings.nodeFetch.nodeFetchStrings.font = "font".asInstanceOf[typings.nodeFetch.nodeFetchStrings.font]
    
    @scala.inline
    def form: typings.nodeFetch.nodeFetchStrings.form = "form".asInstanceOf[typings.nodeFetch.nodeFetchStrings.form]
    
    @scala.inline
    def frame: typings.nodeFetch.nodeFetchStrings.frame = "frame".asInstanceOf[typings.nodeFetch.nodeFetchStrings.frame]
    
    @scala.inline
    def hyperlink: typings.nodeFetch.nodeFetchStrings.hyperlink = "hyperlink".asInstanceOf[typings.nodeFetch.nodeFetchStrings.hyperlink]
    
    @scala.inline
    def iframe: typings.nodeFetch.nodeFetchStrings.iframe = "iframe".asInstanceOf[typings.nodeFetch.nodeFetchStrings.iframe]
    
    @scala.inline
    def image: typings.nodeFetch.nodeFetchStrings.image = "image".asInstanceOf[typings.nodeFetch.nodeFetchStrings.image]
    
    @scala.inline
    def imageset: typings.nodeFetch.nodeFetchStrings.imageset = "imageset".asInstanceOf[typings.nodeFetch.nodeFetchStrings.imageset]
    
    @scala.inline
    def `import`: typings.nodeFetch.nodeFetchStrings.`import` = "import".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`import`]
    
    @scala.inline
    def internal: typings.nodeFetch.nodeFetchStrings.internal = "internal".asInstanceOf[typings.nodeFetch.nodeFetchStrings.internal]
    
    @scala.inline
    def location: typings.nodeFetch.nodeFetchStrings.location = "location".asInstanceOf[typings.nodeFetch.nodeFetchStrings.location]
    
    @scala.inline
    def manifest: typings.nodeFetch.nodeFetchStrings.manifest = "manifest".asInstanceOf[typings.nodeFetch.nodeFetchStrings.manifest]
    
    @scala.inline
    def `object`: typings.nodeFetch.nodeFetchStrings.`object` = "object".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`object`]
    
    @scala.inline
    def ping: typings.nodeFetch.nodeFetchStrings.ping = "ping".asInstanceOf[typings.nodeFetch.nodeFetchStrings.ping]
    
    @scala.inline
    def plugin: typings.nodeFetch.nodeFetchStrings.plugin = "plugin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.plugin]
    
    @scala.inline
    def prefetch: typings.nodeFetch.nodeFetchStrings.prefetch = "prefetch".asInstanceOf[typings.nodeFetch.nodeFetchStrings.prefetch]
    
    @scala.inline
    def script: typings.nodeFetch.nodeFetchStrings.script = "script".asInstanceOf[typings.nodeFetch.nodeFetchStrings.script]
    
    @scala.inline
    def serviceworker: typings.nodeFetch.nodeFetchStrings.serviceworker = "serviceworker".asInstanceOf[typings.nodeFetch.nodeFetchStrings.serviceworker]
    
    @scala.inline
    def sharedworker: typings.nodeFetch.nodeFetchStrings.sharedworker = "sharedworker".asInstanceOf[typings.nodeFetch.nodeFetchStrings.sharedworker]
    
    @scala.inline
    def style: typings.nodeFetch.nodeFetchStrings.style = "style".asInstanceOf[typings.nodeFetch.nodeFetchStrings.style]
    
    @scala.inline
    def subresource: typings.nodeFetch.nodeFetchStrings.subresource = "subresource".asInstanceOf[typings.nodeFetch.nodeFetchStrings.subresource]
    
    @scala.inline
    def track: typings.nodeFetch.nodeFetchStrings.track = "track".asInstanceOf[typings.nodeFetch.nodeFetchStrings.track]
    
    @scala.inline
    def video: typings.nodeFetch.nodeFetchStrings.video = "video".asInstanceOf[typings.nodeFetch.nodeFetchStrings.video]
    
    @scala.inline
    def worker: typings.nodeFetch.nodeFetchStrings.worker = "worker".asInstanceOf[typings.nodeFetch.nodeFetchStrings.worker]
    
    @scala.inline
    def xmlhttprequest: typings.nodeFetch.nodeFetchStrings.xmlhttprequest = "xmlhttprequest".asInstanceOf[typings.nodeFetch.nodeFetchStrings.xmlhttprequest]
    
    @scala.inline
    def xslt: typings.nodeFetch.nodeFetchStrings.xslt = "xslt".asInstanceOf[typings.nodeFetch.nodeFetchStrings.xslt]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings.omit
    - typings.nodeFetch.nodeFetchStrings.include
    - typings.nodeFetch.nodeFetchStrings.`same-origin`
  */
  trait RequestCredentials extends StObject
  object RequestCredentials {
    
    @scala.inline
    def include: typings.nodeFetch.nodeFetchStrings.include = "include".asInstanceOf[typings.nodeFetch.nodeFetchStrings.include]
    
    @scala.inline
    def omit: typings.nodeFetch.nodeFetchStrings.omit = "omit".asInstanceOf[typings.nodeFetch.nodeFetchStrings.omit]
    
    @scala.inline
    def `same-origin`: typings.nodeFetch.nodeFetchStrings.`same-origin` = "same-origin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.nodeFetch.mod.URLLike
    - typings.nodeFetch.mod.Request
  */
  type RequestInfo = _RequestInfo | String
  
  @js.native
  trait RequestInit extends StObject {
    
    // node-fetch extensions
    var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.native
    
    // whatwg/fetch standard options
    var body: js.UndefOr[BodyInit] = js.native
    
    // =null http.Agent instance, allows custom proxy, certificate etc.
    var compress: js.UndefOr[Boolean] = js.native
    
    // =true support gzip/deflate content encoding. false to disable
    var follow: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[HeadersInit] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var redirect: js.UndefOr[RequestRedirect] = js.native
    
    var signal: js.UndefOr[AbortSignal | Null] = js.native
    
    // =20 maximum redirect count. 0 to not follow redirect
    var size: js.UndefOr[Double] = js.native
    
    // =0 maximum response body size in bytes. 0 to disable
    var timeout: js.UndefOr[Double] = js.native
  }
  object RequestInit {
    
    @scala.inline
    def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    @scala.inline
    implicit class RequestInitMutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | (js.Function1[/* parsedUrl */ URL_, Agent])): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentFunction1(value: /* parsedUrl */ URL_ => Agent): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalNull: Self = StObject.set(x, "signal", null)
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings.cors
    - typings.nodeFetch.nodeFetchStrings.`no-cors`
    - typings.nodeFetch.nodeFetchStrings.`same-origin`
  */
  trait RequestMode extends StObject
  object RequestMode {
    
    @scala.inline
    def cors: typings.nodeFetch.nodeFetchStrings.cors = "cors".asInstanceOf[typings.nodeFetch.nodeFetchStrings.cors]
    
    @scala.inline
    def `no-cors`: typings.nodeFetch.nodeFetchStrings.`no-cors` = "no-cors".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`no-cors`]
    
    @scala.inline
    def `same-origin`: typings.nodeFetch.nodeFetchStrings.`same-origin` = "same-origin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings.error
    - typings.nodeFetch.nodeFetchStrings.follow
    - typings.nodeFetch.nodeFetchStrings.manual
  */
  trait RequestRedirect extends StObject
  object RequestRedirect {
    
    @scala.inline
    def error: typings.nodeFetch.nodeFetchStrings.error = "error".asInstanceOf[typings.nodeFetch.nodeFetchStrings.error]
    
    @scala.inline
    def follow: typings.nodeFetch.nodeFetchStrings.follow = "follow".asInstanceOf[typings.nodeFetch.nodeFetchStrings.follow]
    
    @scala.inline
    def manual: typings.nodeFetch.nodeFetchStrings.manual = "manual".asInstanceOf[typings.nodeFetch.nodeFetchStrings.manual]
  }
  
  @js.native
  trait ResponseInit extends StObject {
    
    var headers: js.UndefOr[HeadersInit] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var status: js.UndefOr[Double] = js.native
    
    var statusText: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object ResponseInit {
    
    @scala.inline
    def apply(): ResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInit]
    }
    
    @scala.inline
    implicit class ResponseInitMutableBuilder[Self <: ResponseInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    def default: typings.nodeFetch.nodeFetchStrings.default = "default".asInstanceOf[typings.nodeFetch.nodeFetchStrings.default]
    
    @scala.inline
    def basic: typings.nodeFetch.nodeFetchStrings.basic = "basic".asInstanceOf[typings.nodeFetch.nodeFetchStrings.basic]
    
    @scala.inline
    def cors: typings.nodeFetch.nodeFetchStrings.cors = "cors".asInstanceOf[typings.nodeFetch.nodeFetchStrings.cors]
    
    @scala.inline
    def error: typings.nodeFetch.nodeFetchStrings.error = "error".asInstanceOf[typings.nodeFetch.nodeFetchStrings.error]
    
    @scala.inline
    def opaque: typings.nodeFetch.nodeFetchStrings.opaque = "opaque".asInstanceOf[typings.nodeFetch.nodeFetchStrings.opaque]
    
    @scala.inline
    def opaqueredirect: typings.nodeFetch.nodeFetchStrings.opaqueredirect = "opaqueredirect".asInstanceOf[typings.nodeFetch.nodeFetchStrings.opaqueredirect]
  }
  
  @js.native
  trait SystemError extends Error {
    
    var code: js.UndefOr[String] = js.native
  }
  object SystemError {
    
    @scala.inline
    def apply(message: String, name: String): SystemError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemError]
    }
    
    @scala.inline
    implicit class SystemErrorMutableBuilder[Self <: SystemError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    }
  }
  
  @js.native
  trait URLLike extends _RequestInfo {
    
    var href: String = js.native
  }
  object URLLike {
    
    @scala.inline
    def apply(href: String): URLLike = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLLike]
    }
    
    @scala.inline
    implicit class URLLikeMutableBuilder[Self <: URLLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  trait _RequestInfo extends StObject
}
