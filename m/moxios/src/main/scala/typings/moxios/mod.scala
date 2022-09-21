package typings.moxios

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moxios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("moxios", "delay")
  @js.native
  def delay: Double = js.native
  inline def delay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
  
  /**
    * Install the mock adapter for axios
    */
  inline def install(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[Unit]
  inline def install(instance: AxiosInstance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("moxios", "requests")
  @js.native
  def requests: Tracker = js.native
  inline def requests_=(x: Tracker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requests")(x.asInstanceOf[js.Any])
  
  /**
    * Stub a timed response to a request matching a method and a URL or RegExp. If
    * timer fires, reject with a TimeoutException for simple assertions. The goal is
    * to show that a certain request was not made.
    *
    * @param method An axios command
    * @param urlOrRegExp A URL or RegExp to test against
    * @param response The response to use when a match is made
    */
  inline def stubFailure(method: String, urlOrRegExp: String, response: Item): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stubFailure")(method.asInstanceOf[js.Any], urlOrRegExp.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def stubFailure(method: String, urlOrRegExp: js.RegExp, response: Item): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stubFailure")(method.asInstanceOf[js.Any], urlOrRegExp.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Stub a response to be used one or more times to respond to a request matching a
    * method and a URL or RegExp.
    *
    * @param method An axios command
    * @param urlOrRegExp A URL or RegExp to test against
    * @param response The response to use when a match is made
    */
  inline def stubOnce(method: String, urlOrRegExp: String, response: Item): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stubOnce")(method.asInstanceOf[js.Any], urlOrRegExp.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def stubOnce(method: String, urlOrRegExp: js.RegExp, response: Item): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stubOnce")(method.asInstanceOf[js.Any], urlOrRegExp.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Stub a response to be used to respond to a request matching a URL or RegExp
    *
    * @param method An axios command
    * @param urlOrRegExp A URL or RegExp to test against
    * @param response The response to use when a match is made
    */
  inline def stubRequest(method: String, urlOrRegExp: String, response: Item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubRequest")(method.asInstanceOf[js.Any], urlOrRegExp.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stubRequest(method: String, urlOrRegExp: js.RegExp, response: Item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubRequest")(method.asInstanceOf[js.Any], urlOrRegExp.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Stub a response to be used to respond to a request matching a URL or RegExp
    *
    * @param urlOrRegExp A URL or RegExp to test against
    * @param response The response to use when a match is made
    */
  inline def stubRequest(urlOrRegExp: String, response: Item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubRequest")(urlOrRegExp.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stubRequest(urlOrRegExp: js.RegExp, response: Item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stubRequest")(urlOrRegExp.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Stub a timeout to be used to respond to a request matching a URL or RegExp
    *
    * @param urlOrRegExp A URL or RegExp to test against
    */
  inline def stubTimeout(urlOrRegExp: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stubTimeout")(urlOrRegExp.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stubTimeout(urlOrRegExp: js.RegExp): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stubTimeout")(urlOrRegExp.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("moxios", "stubs")
  @js.native
  def stubs: Tracker = js.native
  inline def stubs_=(x: Tracker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stubs")(x.asInstanceOf[js.Any])
  
  @JSImport("moxios", "timeoutException")
  @js.native
  def timeoutException: js.Error = js.native
  inline def timeoutException_=(x: js.Error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeoutException")(x.asInstanceOf[js.Any])
  
  /**
    * Uninstall the mock adapter and reset state
    */
  inline def uninstall(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")().asInstanceOf[Unit]
  inline def uninstall(instance: AxiosInstance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Wait for request to be made before proceding.
    * This is naively using a `setTimeout`.
    * May need to beef this up a bit in the future.
    *
    * @param fn The function to execute once waiting is over
    * @param delay How much time in milliseconds to wait
    */
  inline def wait_(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def wait_(fn: js.Function0[Unit], delay: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Run a single test with mock adapter installed.
    * This will install the mock adapter, execute the function provided,
    * then uninstall the mock adapter once complete.
    *
    * @param fn The function to be executed
    */
  inline def withMock(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withMock")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Item extends StObject {
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var response: js.UndefOr[Any] = js.undefined
    
    var responseText: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
  }
  object Item {
    
    inline def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    var config: AxiosRequestConfig[Any]
    
    var headers: Any
    
    /**
      * Respond to this request with a specified result
      *
      * @param res The data representing the result of the request
      * @return A Promise that resolves once the response is ready
      */
    def respondWith(res: Item): js.Promise[Response]
    
    /**
      * Respond to this request with a timeout result
      *
      * @return A Promise that rejects with a timeout result
      */
    def respondWithTimeout(): js.Promise[Response]
    
    var responseType: String
    
    var timeout: Double
    
    var url: String
    
    var withCredentials: Boolean
  }
  object Request {
    
    inline def apply(
      config: AxiosRequestConfig[Any],
      headers: Any,
      respondWith: Item => js.Promise[Response],
      respondWithTimeout: () => js.Promise[Response],
      responseType: String,
      timeout: Double,
      url: String,
      withCredentials: Boolean
    ): Request = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], respondWith = js.Any.fromFunction1(respondWith), respondWithTimeout = js.Any.fromFunction0(respondWithTimeout), responseType = responseType.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setConfig(value: AxiosRequestConfig[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRespondWith(value: Item => js.Promise[Response]): Self = StObject.set(x, "respondWith", js.Any.fromFunction1(value))
      
      inline def setRespondWithTimeout(value: () => js.Promise[Response]): Self = StObject.set(x, "respondWithTimeout", js.Any.fromFunction0(value))
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var config: AxiosRequestConfig[Any]
    
    var data: js.UndefOr[Any] = js.undefined
    
    var headers: Any
    
    var request: Request
    
    var status: js.UndefOr[Double] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
  }
  object Response {
    
    inline def apply(config: AxiosRequestConfig[Any], headers: Any, request: Request): Response = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setConfig(value: AxiosRequestConfig[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait Tracker extends StObject {
    
    /**
      * Get an item being tracked at a given index
      *
      * @param index The index for the item to retrieve
      */
    def at(index: Double): Request = js.native
    
    /**
      * The count of items being tracked
      */
    def count(): Double = js.native
    
    /**
      * Dump the items being tracked to the console.
      */
    def debug(): Unit = js.native
    
    /**
      * Get the first item being tracked
      */
    def first(): Request = js.native
    
    /**
      * Find and return element given the HTTP method and the URL.
      */
    def get(method: String): Request = js.native
    def get(method: String, url: String): Request = js.native
    
    /**
      * Get the most recent (last) item being tracked
      */
    def mostRecent(): Request = js.native
    
    /**
      * Stop an element from being tracked by removing it. Finds and returns the element,
      * given the HTTP method and the URL.
      */
    def remove(method: String, url: String): Request = js.native
    
    /**
      * Reset all the items being tracked
      */
    def reset(): Unit = js.native
    
    /**
      * Add an item to be tracked
      *
      * @param item An item to be tracked
      */
    def track(item: Item): Unit = js.native
  }
}
