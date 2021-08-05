package typings.nise

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.nise.anon.Abort
import typings.nise.anon.PartialFakeServerOptions
import typings.std.Document
import typings.std.Event
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nise", "fakeServer")
  @js.native
  val fakeServer: FakeServerStatic = js.native
  
  @JSImport("nise", "fakeServerWithClock")
  @js.native
  val fakeServerWithClock: FakeServerStatic = js.native
  
  object fakeXhr extends Shortcut {
    
    @JSImport("nise", "fakeXhr")
    @js.native
    val ^ : FakeXHR_ = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("nise", "fakeXhr.FakeXMLHttpRequest")
    @js.native
    class FakeXMLHttpRequestCls ()
      extends StObject
         with FakeXMLHttpRequest
    
    type _To = FakeXHR_
    
    /* This means you don't have to write `^`, but can instead just say `fakeXhr.foo` */
    override def _to: FakeXHR_ = ^
  }
  
  trait FakeServerOptions extends StObject {
    
    /**
      * When set to true, causes the server to automatically respond to incoming requests after a timeout.
      * The default timeout is 10ms but you can control it through the autoRespondAfter property.
      * Note that this feature is intended to help during mockup development, and is not suitable for use in tests.
      */
    var autoRespond: Boolean
    
    /**
      * When autoRespond is true, respond to requests after this number of milliseconds. Default is 10.
      */
    var autoRespondAfter: Double
    
    /**
      * If set to true, server will find _method parameter in POST body and recognize that as the actual method.
      * Supports a pattern common to Ruby on Rails applications. For custom HTTP method faking, override server.getHTTPMethod(request).
      */
    var fakeHTTPMethods: Boolean
    
    /**
      * If set, the server will respond to every request immediately and synchronously.
      * This is ideal for faking the server from within a test without having to call server.respond() after each request made in that test.
      * As this is synchronous and immediate, this is not suitable for simulating actual network latency in tests or mockups.
      * To simulate network latency with automatic responses, see server.autoRespond and server.autoRespondAfter.
      */
    var respondImmediately: Boolean
  }
  object FakeServerOptions {
    
    inline def apply(
      autoRespond: Boolean,
      autoRespondAfter: Double,
      fakeHTTPMethods: Boolean,
      respondImmediately: Boolean
    ): FakeServerOptions = {
      val __obj = js.Dynamic.literal(autoRespond = autoRespond.asInstanceOf[js.Any], autoRespondAfter = autoRespondAfter.asInstanceOf[js.Any], fakeHTTPMethods = fakeHTTPMethods.asInstanceOf[js.Any], respondImmediately = respondImmediately.asInstanceOf[js.Any])
      __obj.asInstanceOf[FakeServerOptions]
    }
    
    extension [Self <: FakeServerOptions](x: Self) {
      
      inline def setAutoRespond(value: Boolean): Self = StObject.set(x, "autoRespond", value.asInstanceOf[js.Any])
      
      inline def setAutoRespondAfter(value: Double): Self = StObject.set(x, "autoRespondAfter", value.asInstanceOf[js.Any])
      
      inline def setFakeHTTPMethods(value: Boolean): Self = StObject.set(x, "fakeHTTPMethods", value.asInstanceOf[js.Any])
      
      inline def setRespondImmediately(value: Boolean): Self = StObject.set(x, "respondImmediately", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FakeServerStatic extends StObject {
    
    def create(): FakeServer_ = js.native
    def create(options: PartialFakeServerOptions): FakeServer_ = js.native
  }
  
  @js.native
  trait FakeServer_
    extends StObject
       with FakeServerOptions {
    
    var firstRequest: js.UndefOr[FakeXMLHttpRequest] = js.native
    
    /**
      * Used internally to determine the HTTP method used with the provided request.
      * By default this method simply returns request.method.
      * When server.fakeHTTPMethods is true, the method will return the value of the _method parameter if the method is “POST”.
      * This method can be overridden to provide custom behavior.
      * @param request
      */
    def getHTTPMethod(request: FakeXMLHttpRequest): String = js.native
    
    def getRequest(): js.UndefOr[FakeXMLHttpRequest] = js.native
    
    var lastRequest: js.UndefOr[FakeXMLHttpRequest] = js.native
    
    /**
      * You can inspect the server.requests to verify request ordering, find unmatched requests or check that no requests has been done.
      * server.requests is an array of all the FakeXMLHttpRequest objects that have been created.
      */
    var requests: js.Array[FakeXMLHttpRequest] = js.native
    
    def reset(): Unit = js.native
    
    def resetBehavior(): Unit = js.native
    
    def resetHistory(): Unit = js.native
    
    /**
      * Causes all queued asynchronous requests to receive a response.
      * If none of the responses added through respondWith match, the default response is [404, {}, ""].
      * Synchronous requests are responded to immediately, so make sure to call respondWith upfront.
      * If called with arguments, respondWith will be called with those arguments before responding to requests.
      */
    def respond(): Unit = js.native
    
    def respondWith(args: js.Any*): Unit = js.native
    /**
      * Causes the server to respond to any request not matched by another response with the provided data. The default catch-all response is [404, {}, ""].
      * A String representing the response body
      * An Array with status, headers and response body, e.g. [200, { "Content-Type": "text/html", "Content-Length": 2 }, "OK"]
      * A Function.
      * Default status is 200 and default headers are none.
      * When the response is a Function, it will be passed the request object. You must manually call respond on it to complete the request.
      * @param body A String representing the response body
      */
    def respondWith(body: String): Unit = js.native
    /**
      * Causes the server to respond to any request not matched by another response with the provided data. The default catch-all response is [404, {}, ""].
      * Default status is 200 and default headers are none.
      * When the response is a Function, it will be passed the request object. You must manually call respond on it to complete the request.
      * @param fn A Function.
      */
    def respondWith(fn: js.Function1[/* xhr */ FakeXMLHttpRequest, Unit]): Unit = js.native
    /**
      * Responds to all method requests to the given URL with the given response.
      * method is an HTTP verb.
      */
    def respondWith(method: String, url: String, body: String): Unit = js.native
    /**
      * Responds to all method requests to the given URL with the given response.
      * method is an HTTP verb.
      */
    def respondWith(method: String, url: String, fn: js.Function1[/* xhr */ FakeXMLHttpRequest, Unit]): Unit = js.native
    /**
      * Responds to all method requests to the given URL with the given response.
      * method is an HTTP verb.
      */
    def respondWith(method: String, url: String, response: js.Array[js.Any]): Unit = js.native
    /**
      * Responds to all method requests to URLs matching the regular expression.
      */
    def respondWith(method: String, url: RegExp, body: String): Unit = js.native
    /**
      * Responds to all method requests to URLs matching the regular expression.
      */
    def respondWith(method: String, url: RegExp, fn: js.Function1[/* xhr */ FakeXMLHttpRequest, Unit]): Unit = js.native
    /**
      * Responds to all method requests to URLs matching the regular expression.
      */
    def respondWith(method: String, url: RegExp, response: js.Array[js.Any]): Unit = js.native
    /**
      * Causes the server to respond to any request not matched by another response with the provided data. The default catch-all response is [404, {}, ""].
      * Default status is 200 and default headers are none.
      * When the response is a Function, it will be passed the request object. You must manually call respond on it to complete the request.
      * @param response An Array with status, headers and response body, e.g. [200, { "Content-Type": "text/html", "Content-Length": 2 }, "OK"]
      */
    def respondWith(response: js.Array[js.Any]): Unit = js.native
    /**
      * Responds to all requests to given URL, e.g. /posts/1.
      */
    def respondWith(url: String, body: String): Unit = js.native
    /**
      * Responds to all requests to given URL, e.g. /posts/1.
      */
    def respondWith(url: String, fn: js.Function1[/* xhr */ FakeXMLHttpRequest, Unit]): Unit = js.native
    /**
      * Responds to all requests to given URL, e.g. /posts/1.
      */
    def respondWith(url: String, response: js.Array[js.Any]): Unit = js.native
    /**
      * URL may be a regular expression, e.g. /\\/post\\//\\d+
      * If the response is a Function, it will be passed any capture groups from the regular expression along with the XMLHttpRequest object:
      */
    def respondWith(url: RegExp, body: String): Unit = js.native
    /**
      * URL may be a regular expression, e.g. /\\/post\\//\\d+
      * If the response is a Function, it will be passed any capture groups from the regular expression along with the XMLHttpRequest object:
      */
    def respondWith(url: RegExp, fn: js.Function1[/* xhr */ FakeXMLHttpRequest, Unit]): Unit = js.native
    /**
      * URL may be a regular expression, e.g. /\\/post\\//\\d+
      * If the response is a Function, it will be passed any capture groups from the regular expression along with the XMLHttpRequest object:
      */
    def respondWith(url: RegExp, response: js.Array[js.Any]): Unit = js.native
    
    def restore(): Unit = js.native
    
    var secondRequest: js.UndefOr[FakeXMLHttpRequest] = js.native
    
    var thirdRequest: js.UndefOr[FakeXMLHttpRequest] = js.native
  }
  
  trait FakeUploadProgress extends StObject {
    
    def addEventListener(event: String, listener: js.Function1[/* e */ Event, js.Any]): Unit
    
    def dispatchEvent(event: Event): Unit
    
    var eventListeners: Abort
    
    def removeEventListener(event: String, listener: js.Function1[/* e */ Event, js.Any]): Unit
  }
  object FakeUploadProgress {
    
    inline def apply(
      addEventListener: (String, js.Function1[/* e */ Event, js.Any]) => Unit,
      dispatchEvent: Event => Unit,
      eventListeners: Abort,
      removeEventListener: (String, js.Function1[/* e */ Event, js.Any]) => Unit
    ): FakeUploadProgress = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
      __obj.asInstanceOf[FakeUploadProgress]
    }
    
    extension [Self <: FakeUploadProgress](x: Self) {
      
      inline def setAddEventListener(value: (String, js.Function1[/* e */ Event, js.Any]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setDispatchEvent(value: Event => Unit): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setEventListeners(value: Abort): Self = StObject.set(x, "eventListeners", value.asInstanceOf[js.Any])
      
      inline def setRemoveEventListener(value: (String, js.Function1[/* e */ Event, js.Any]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    }
  }
  
  trait FakeXHR_ extends StObject {
    
    var FakeXMLHttpRequest: FakeXMLHttpRequestStatic
    
    def useFakeXMLHttpRequest(): FakeXMLHttpRequestStatic
  }
  object FakeXHR_ {
    
    inline def apply(
      FakeXMLHttpRequest: FakeXMLHttpRequestStatic,
      useFakeXMLHttpRequest: () => FakeXMLHttpRequestStatic
    ): FakeXHR_ = {
      val __obj = js.Dynamic.literal(FakeXMLHttpRequest = FakeXMLHttpRequest.asInstanceOf[js.Any], useFakeXMLHttpRequest = js.Any.fromFunction0(useFakeXMLHttpRequest))
      __obj.asInstanceOf[FakeXHR_]
    }
    
    extension [Self <: FakeXHR_](x: Self) {
      
      inline def setFakeXMLHttpRequest(value: FakeXMLHttpRequestStatic): Self = StObject.set(x, "FakeXMLHttpRequest", value.asInstanceOf[js.Any])
      
      inline def setUseFakeXMLHttpRequest(value: () => FakeXMLHttpRequestStatic): Self = StObject.set(x, "useFakeXMLHttpRequest", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FakeXMLHttpRequest extends StObject {
    
    /**
      * Whether or not the request is asynchronous.
      */
    var async: Boolean = js.native
    
    def autoRespond(ms: Double): Unit = js.native
    
    /**
      * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
      */
    def error(): Unit = js.native
    
    /**
      * All response headers as an object.
      */
    def getAllResponseHeaders(): js.Any = js.native
    
    /**
      * The value of the given response header, if the request has been responded to (see respond).
      * @param header
      */
    def getResponseHeader(header: String): String = js.native
    
    /**
      * The request method as a string.
      */
    var method: String = js.native
    
    def onabort(e: Event): Unit = js.native
    
    def onerror(e: Event): Unit = js.native
    
    def onload(e: Event): Unit = js.native
    
    def onloadend(e: Event): Unit = js.native
    
    def onloadstart(e: Event): Unit = js.native
    
    def onprogress(e: Event): Unit = js.native
    
    def ontimeout(e: Event): Unit = js.native
    
    /**
      * Password, if any.
      */
    var password: String = js.native
    
    /**
      * The request body
      */
    var requestBody: String = js.native
    
    /**
      * An object of all request headers, i.e.:
      */
    var requestHeaders: js.Any = js.native
    
    /**
      * Calls the above three methods.
      */
    def respond(status: Double): Unit = js.native
    def respond(status: Double, headers: js.Any): Unit = js.native
    def respond(status: Double, headers: js.Any, body: String): Unit = js.native
    def respond(status: Double, headers: Unit, body: String): Unit = js.native
    
    /**
      * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
      */
    var responseXML: Document = js.native
    
    /**
      * Sets the respond body, updates the readyState property and fires onreadystatechange.
      * Additionally, populates responseXML with a parsed document if response headers indicate as much.
      */
    def setResponseBody(body: String): Unit = js.native
    
    /**
      * Sets response headers (e.g. { "Content-Type": "text/html", ... }, updates the readyState property and fires onreadystatechange.
      * @param headers
      */
    def setResponseHeaders(headers: js.Any): Unit = js.native
    
    /**
      * The request’s status code.
      * undefined if the request has not been handled (see respond below)
      */
    var status: Double = js.native
    
    /**
      * Only populated if the respond method is called (see below).
      */
    var statusText: String = js.native
    
    var upload: FakeUploadProgress = js.native
    
    /**
      * The URL set on the request object.
      */
    var url: String = js.native
    
    /**
      * Username, if any.
      */
    var username: String = js.native
    
    var withCredentials: Boolean = js.native
  }
  
  @js.native
  trait FakeXMLHttpRequestStatic
    extends StObject
       with Instantiable0[FakeXMLHttpRequest] {
    
    /**
      * Add a filter that will decide whether or not to fake a request.
      * The filter will be called when xhr.open is called, with the exact same arguments (method, url, async, username, password).
      * If the filter returns true, the request will not be faked.
      * @param filter
      */
    def addFilter(
      filter: js.Function5[
          /* method */ String, 
          /* url */ String, 
          /* async */ Boolean, 
          /* username */ String, 
          /* password */ String, 
          Boolean
        ]
    ): Unit = js.native
    
    /**
      * By assigning a function to the onCreate property of the returned object from useFakeXMLHttpRequest()
      * you can subscribe to newly created FakeXMLHttpRequest objects. See below for the fake xhr object API.
      * Using this observer means you can still reach objects created by e.g. jQuery.ajax (or other abstractions/frameworks).
      * @param xhr
      */
    def onCreate(xhr: FakeXMLHttpRequest): Unit = js.native
    
    /**
      * Restore original function(s).
      */
    def restore(): Unit = js.native
    
    /**
      * Default false.
      * When set to true, Sinon will check added filters if certain requests should be “unfaked”
      */
    var useFilters: Boolean = js.native
  }
}
