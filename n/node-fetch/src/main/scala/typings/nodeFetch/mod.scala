package typings.nodeFetch

import typings.formdataPolyfill.esmDotminMod.FormData
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.nodeFetch.nodeFetchStrings.abort
import typings.std.Error
import typings.std.IterableIterator
import typings.std.Record
import typings.std.URL
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def default(url: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def default(url: URL): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def default(url: URL, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  @JSImport("node-fetch", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_AbortError: typings.nodeFetch.nodeFetchStrings.AbortError = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: typings.nodeFetch.nodeFetchStrings.AbortError = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("node-fetch", "Blob")
  @js.native
  val Blob: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.Blob */ Any = js.native
  
  @JSImport("node-fetch", "FetchError")
  @js.native
  open class FetchError protected ()
    extends StObject
       with Error {
    def this(message: String, `type`: String) = this()
    def this(message: String, `type`: String, systemError: Record[String, Any]) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var errno: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_FetchError: typings.nodeFetch.nodeFetchStrings.FetchError = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: typings.nodeFetch.nodeFetchStrings.FetchError = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("node-fetch", "File")
  @js.native
  val File: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.File */ Any = js.native
  
  @JSImport("node-fetch", "Headers")
  @js.native
  open class Headers () extends StObject {
    def this(init: HeadersInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    /**
    	 * Returns an iterator allowing to go through all key/value pairs contained in this object.
    	 */
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callbackfn: js.Function3[/* value */ String, /* key */ String, /* parent */ this.type, Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* key */ String, /* parent */ this.type, Unit],
      thisArg: Any
    ): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    /**
    	 * Returns an iterator allowing to go through all keys of the key/value pairs contained in this object.
    	 */
    def keys(): IterableIterator[String] = js.native
    
    /** Node-fetch extension */
    def raw(): Record[String, js.Array[String]] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    /**
    	 * Returns an iterator allowing to go through all values of the key/value pairs contained in this object.
    	 */
    def values(): IterableIterator[String] = js.native
  }
  
  @JSImport("node-fetch", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with BodyMixin {
    def this(input: RequestInfo) = this()
    def this(input: URL) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    def this(input: URL, init: RequestInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[typings.std.Blob] = js.native
    
    /* CompleteClass */
    override val body: ReadableStream | Null = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /** @deprecated Use `body.arrayBuffer()` instead. */
    /* CompleteClass */
    override def buffer(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    /**
    	 * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
    	 */
    val headers: Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    /**
    	 * Returns request's HTTP method, which is "GET" by default.
    	 */
    val method: String = js.native
    
    /**
    	 * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
    	 */
    val redirect: RequestRedirect = js.native
    
    /**
    	 * A string whose value is a same-origin URL, "about:client", or the empty string, to set request’s referrer.
    	 */
    val referrer: String = js.native
    
    /**
    	 * A referrer policy to set request’s referrerPolicy.
    	 */
    val referrerPolicy: ReferrerPolicy = js.native
    
    /**
    	 * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
    	 */
    val signal: AbortSignal = js.native
    
    /* CompleteClass */
    override val size: Double = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /**
    	 * Returns the URL of request as a string.
    	 */
    val url: String = js.native
  }
  
  @JSImport("node-fetch", "Response")
  @js.native
  open class Response ()
    extends StObject
       with BodyMixin {
    def this(body: BodyInit) = this()
    def this(body: Null, init: ResponseInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[typings.std.Blob] = js.native
    
    /* CompleteClass */
    override val body: ReadableStream | Null = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /** @deprecated Use `body.arrayBuffer()` instead. */
    /* CompleteClass */
    override def buffer(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    val headers: Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    val ok: Boolean = js.native
    
    val redirected: Boolean = js.native
    
    /* CompleteClass */
    override val size: Double = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    val `type`: ResponseType = js.native
    
    val url: String = js.native
  }
  /* static members */
  object Response {
    
    @JSImport("node-fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[Response]
    
    inline def json(data: Any): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any]).asInstanceOf[Response]
    inline def json(data: Any, init: ResponseInit): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Response]
    
    inline def redirect(url: String): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[Response]
    inline def redirect(url: String, status: Double): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Response]
  }
  
  inline def blobFrom(path: String): js.Promise[typings.std.Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blobFrom")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.Blob]]
  inline def blobFrom(path: String, `type`: String): js.Promise[typings.std.Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFrom")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.Blob]]
  
  inline def blobFromSync(path: String): typings.std.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("blobFromSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.std.Blob]
  inline def blobFromSync(path: String, `type`: String): typings.std.Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFromSync")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.std.Blob]
  
  inline def fileFrom(path: String): js.Promise[typings.std.File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFrom")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.File]]
  inline def fileFrom(path: String, `type`: String): js.Promise[typings.std.File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFrom")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.File]]
  
  inline def fileFromSync(path: String): typings.std.File = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFromSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.std.File]
  inline def fileFromSync(path: String, `type`: String): typings.std.File = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromSync")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.std.File]
  
  inline def isRedirect(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait AbortSignal extends StObject {
    
    val aborted: Boolean
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction0[/* this */ AbortSignal, Unit]): Unit
    
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction0[/* this */ AbortSignal, Unit]): Unit
  }
  object AbortSignal {
    
    inline def apply(
      aborted: Boolean,
      addEventListener: (abort, js.ThisFunction0[/* this */ AbortSignal, Unit]) => Unit,
      removeEventListener: (abort, js.ThisFunction0[/* this */ AbortSignal, Unit]) => Unit
    ): AbortSignal = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
      __obj.asInstanceOf[AbortSignal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbortSignal] (val x: Self) extends AnyVal {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setAddEventListener(value: (abort, js.ThisFunction0[/* this */ AbortSignal, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setRemoveEventListener(value: (abort, js.ThisFunction0[/* this */ AbortSignal, Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined parent std.Pick<node-fetch.node-fetch.BodyMixin, keyof node-fetch.node-fetch.BodyMixin> */
  trait Body extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    @JSName("arrayBuffer")
    var arrayBuffer_Original: js.Function0[js.Promise[js.typedarray.ArrayBuffer]]
    
    def blob(): js.Promise[typings.std.Blob]
    @JSName("blob")
    var blob_Original: js.Function0[js.Promise[typings.std.Blob]]
    
    var body: js.UndefOr[ReadableStream | Null] = js.undefined
    
    var bodyUsed: Boolean
    
    def buffer(): js.Promise[Buffer]
    @JSName("buffer")
    var buffer_Original: js.Function0[js.Promise[Buffer]]
    
    def formData(): js.Promise[FormData]
    @JSName("formData")
    var formData_Original: js.Function0[js.Promise[FormData]]
    
    def json(): js.Promise[Any]
    @JSName("json")
    var json_Original: js.Function0[js.Promise[Any]]
    
    var size: Double
    
    def text(): js.Promise[String]
    @JSName("text")
    var text_Original: js.Function0[js.Promise[String]]
  }
  object Body {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[typings.std.Blob],
      bodyUsed: Boolean,
      buffer: () => js.Promise[Buffer],
      formData: () => js.Promise[FormData],
      json: () => js.Promise[Any],
      size: Double,
      text: () => js.Promise[String]
    ): Body = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = js.Any.fromFunction0(buffer), formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), size = size.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBlob(value: () => js.Promise[typings.std.Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: () => js.Promise[Buffer]): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
      
      inline def setFormData(value: () => js.Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
      
      inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  type BodyInit = typings.std.Blob | Buffer | URLSearchParams | FormData | ReadableStream | String
  
  trait BodyMixin extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    
    def blob(): js.Promise[typings.std.Blob]
    
    val body: ReadableStream | Null
    
    val bodyUsed: Boolean
    
    /** @deprecated Use `body.arrayBuffer()` instead. */
    def buffer(): js.Promise[Buffer]
    
    def formData(): js.Promise[FormData]
    
    def json(): js.Promise[Any]
    
    val size: Double
    
    def text(): js.Promise[String]
  }
  object BodyMixin {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[typings.std.Blob],
      bodyUsed: Boolean,
      buffer: () => js.Promise[Buffer],
      formData: () => js.Promise[FormData],
      json: () => js.Promise[Any],
      size: Double,
      text: () => js.Promise[String]
    ): BodyMixin = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = js.Any.fromFunction0(buffer), formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), size = size.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), body = null)
      __obj.asInstanceOf[BodyMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BodyMixin] (val x: Self) extends AnyVal {
      
      inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBlob(value: () => js.Promise[typings.std.Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: () => js.Promise[Buffer]): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
      
      inline def setFormData(value: () => js.Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
      
      inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  type HeadersInit = Headers | (Record[String, String]) | (js.Iterable[js.Iterable[String] | (js.Tuple2[String, String])])
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeFetch.nodeFetchStrings._empty
    - typings.nodeFetch.nodeFetchStrings.`no-referrer`
    - typings.nodeFetch.nodeFetchStrings.`no-referrer-when-downgrade`
    - typings.nodeFetch.nodeFetchStrings.`same-origin`
    - typings.nodeFetch.nodeFetchStrings.origin
    - typings.nodeFetch.nodeFetchStrings.`strict-origin`
    - typings.nodeFetch.nodeFetchStrings.`origin-when-cross-origin`
    - typings.nodeFetch.nodeFetchStrings.`strict-origin-when-cross-origin`
    - typings.nodeFetch.nodeFetchStrings.`unsafe-url`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    inline def _empty: typings.nodeFetch.nodeFetchStrings._empty = "".asInstanceOf[typings.nodeFetch.nodeFetchStrings._empty]
    
    inline def `no-referrer`: typings.nodeFetch.nodeFetchStrings.`no-referrer` = "no-referrer".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typings.nodeFetch.nodeFetchStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typings.nodeFetch.nodeFetchStrings.origin = "origin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.origin]
    
    inline def `origin-when-cross-origin`: typings.nodeFetch.nodeFetchStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typings.nodeFetch.nodeFetchStrings.`same-origin` = "same-origin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`same-origin`]
    
    inline def `strict-origin`: typings.nodeFetch.nodeFetchStrings.`strict-origin` = "strict-origin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typings.nodeFetch.nodeFetchStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typings.nodeFetch.nodeFetchStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typings.nodeFetch.nodeFetchStrings.`unsafe-url`]
  }
  
  type RequestInfo = String | Request
  
  trait RequestInit extends StObject {
    
    // Node-fetch extensions to the whatwg/fetch spec
    var agent: js.UndefOr[
        Agent | Boolean | (js.Function1[/* parsedUrl */ URL, js.UndefOr[Agent | Boolean]])
      ] = js.undefined
    
    /**
    	 * A BodyInit object or null to set request's body.
    	 */
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var counter: js.UndefOr[Double] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    /**
    	 * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
    	 */
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var insecureHTTPParser: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * A string to set request's method.
    	 */
    var method: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
    	 * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
    	 */
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    /**
    	 * A string whose value is a same-origin URL, "about:client", or the empty string, to set request’s referrer.
    	 */
    var referrer: js.UndefOr[String] = js.undefined
    
    /**
    	 * A referrer policy to set request’s referrerPolicy.
    	 */
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    /**
    	 * An AbortSignal to set request's signal.
    	 */
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent | Boolean | (js.Function1[/* parsedUrl */ URL, js.UndefOr[Agent | Boolean]])): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* parsedUrl */ URL => js.UndefOr[Agent | Boolean]): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setInsecureHTTPParser(value: Boolean): Self = StObject.set(x, "insecureHTTPParser", value.asInstanceOf[js.Any])
      
      inline def setInsecureHTTPParserUndefined: Self = StObject.set(x, "insecureHTTPParser", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
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
    
    var status: js.UndefOr[Double] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
  }
  object ResponseInit {
    
    inline def apply(): ResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseInit] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
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
}
