package typings.mojangNet

import typings.mojangMinecraftServerAdmin.mod.SecretString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mojang-net", "HttpClient")
  @js.native
  /* protected */ open class HttpClient () extends StObject {
    
    /**
      * @remarks
      * Cancels all pending requests.
      * @param reason
      */
    def cancelAll(reason: String): Unit = js.native
    
    /**
      * @remarks
      * Performs a simple HTTP get request.
      * @param uri
      * URL to make an HTTP Request to.
      * @returns
      * An awaitable promise that contains the HTTP response.
      */
    def get(uri: String): js.Promise[HttpResponse] = js.native
    
    /**
      * @remarks
      * Performs an HTTP request.
      * @param config
      * Contains an HTTP Request object with configuration data on
      * the HTTP request.
      * @returns
      * An awaitable promise that contains the HTTP response.
      */
    def request(config: HttpRequest): js.Promise[HttpResponse] = js.native
  }
  
  @JSImport("mojang-net", "HttpHeader")
  @js.native
  open class HttpHeader protected () extends StObject {
    def this(key: String, value: String) = this()
    def this(key: String, value: SecretString) = this()
    
    /**
      * Key of the HTTP header.
      */
    var key: String = js.native
    
    /**
      * Value of the HTTP header.
      */
    var value: SecretString | String = js.native
  }
  
  @JSImport("mojang-net", "HttpRequest")
  @js.native
  open class HttpRequest protected () extends StObject {
    def this(uri: String) = this()
    
    def addHeader(key: String, value: String): HttpRequest = js.native
    /**
      * @remarks
      * Adds an additional header to the overall list of headers
      * used in the corresponding HTTP request.
      * @param key
      * @param value
      */
    def addHeader(key: String, value: SecretString): HttpRequest = js.native
    
    /**
      * Content of the body of the HTTP request.
      */
    var body: String = js.native
    
    /**
      * A collection of HTTP headers to add to the outbound request.
      */
    var headers: js.Array[HttpHeader] = js.native
    
    /**
      * HTTP method (e.g., GET or PUT or PATCH) to use for making
      * the request.
      */
    var method: HttpRequestMethod = js.native
    
    def setBody(body: String): HttpRequest = js.native
    
    /**
      * @remarks
      * Replaces and applies a set of HTTP Headers for the request.
      * @param headers
      */
    def setHeaders(headers: js.Array[HttpHeader]): HttpRequest = js.native
    
    def setMethod(method: HttpRequestMethod): HttpRequest = js.native
    
    def setTimeout(timeout: Double): HttpRequest = js.native
    
    /**
      * Amount of time, in seconds, before the request times out and
      * is abandoned.
      */
    var timeout: Double = js.native
    
    /**
      * The HTTP resource to access.
      */
    var uri: String = js.native
  }
  
  @js.native
  sealed trait HttpRequestMethod extends StObject
  @JSImport("mojang-net", "HttpRequestMethod")
  @js.native
  object HttpRequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpRequestMethod & Double] = js.native
    
    /**
      * Represents the method for an HTTP HEAD request. HEAD
      * requests are similar to a GET request, but are commonly used
      * to retrieve just the HTTP response headers from the
      * specified URI, and not the body contents.
      */
    @js.native
    sealed trait DELETE
      extends StObject
         with HttpRequestMethod
    /* 3 */ val DELETE: typings.mojangNet.mod.HttpRequestMethod.DELETE & Double = js.native
    
    /**
      * Represents the method for an HTTP PUT request. POST requests
      * are commonly used to create a new resource that is a
      * subordinate of the specified URI.
      */
    @js.native
    sealed trait GET
      extends StObject
         with HttpRequestMethod
    /* 2 */ val GET: typings.mojangNet.mod.HttpRequestMethod.GET & Double = js.native
    
    /**
      * Represents the method for an HTTP PUT request. GET requests
      * are commonly used to retrieve information about a resource
      * at the specified URI.
      */
    @js.native
    sealed trait HEAD
      extends StObject
         with HttpRequestMethod
    /* 4 */ val HEAD: typings.mojangNet.mod.HttpRequestMethod.HEAD & Double = js.native
    
    /**
      * Represents the method for an HTTP PUT request. GET requests
      * are commonly used to retrieve information about a resource
      * at the specified URI.
      */
    @js.native
    sealed trait POST
      extends StObject
         with HttpRequestMethod
    /* 0 */ val POST: typings.mojangNet.mod.HttpRequestMethod.POST & Double = js.native
    
    /**
      * Represents the method for an HTTP PUT request. PUT requests
      * are commonly used to update a single resource that already
      * exists in a resource collection.
      */
    @js.native
    sealed trait PUT
      extends StObject
         with HttpRequestMethod
    /* 1 */ val PUT: typings.mojangNet.mod.HttpRequestMethod.PUT & Double = js.native
  }
  
  @JSImport("mojang-net", "HttpResponse")
  @js.native
  /* protected */ open class HttpResponse () extends StObject {
    
    /**
      * Body content of the HTTP response.
      */
    val body: String = js.native
    
    /**
      * A collection of HTTP response headers returned from the
      * request.
      */
    val headers: js.Array[HttpHeader] = js.native
    
    /**
      * Information that was used to formulate the HTTP response
      * that this object represents.
      */
    val request: HttpRequest = js.native
    
    /**
      * HTTP response code for the request. For example, 404
      * represents resource not found, and 500 represents an
      * internal server error.
      */
    val status: Double = js.native
  }
  
  @JSImport("mojang-net", "http")
  @js.native
  val http: HttpClient = js.native
}
