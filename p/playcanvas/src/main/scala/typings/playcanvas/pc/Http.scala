package typings.playcanvas.pc

import typings.playcanvas.anon.Async
import typings.playcanvas.anon.Cache
import typings.playcanvas.anon.Headers
import typings.playcanvas.pc.callbacks.HttpResponse
import typings.std.Document
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new Http instance. By default, a PlayCanvas application creates an instance of this
  * object at `pc.http`.
  */
@js.native
trait Http extends StObject {
  
  /**
    * Perform an HTTP DELETE request to the given url.
    * @param url - The URL to make the request to.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def del(url: js.Any, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * Perform an HTTP DELETE request to the given url.
    * @param url - The URL to make the request to.
    * @param options - Additional options.
    * @param [options.headers] - HTTP headers to add to the request.
    * @param [options.async] - Make the request asynchronously. Defaults to true.
    * @param [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param [options.responseType] - Override the response type.
    * @param [options.postdata] - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def del(url: js.Any, options: Async, callback: HttpResponse): XMLHttpRequest = js.native
  
  /**
    * Perform an HTTP GET request to the given url.
    * @example
    * pc.http.get("http://example.com/", function (err, response) {
    *     console.log(response);
    * });
    * @param url - The URL to make the request to.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def get(url: String, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * Perform an HTTP GET request to the given url.
    * @param url - The URL to make the request to.
    * @param options - Additional options.
    * @param [options.headers] - HTTP headers to add to the request.
    * @param [options.async] - Make the request asynchronously. Defaults to true.
    * @param [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param [options.responseType] - Override the response type.
    * @param [options.postdata] - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def get(url: String, options: Async, callback: HttpResponse): XMLHttpRequest = js.native
  
  /**
    * Perform an HTTP POST request to the given url.
    * @param url - The URL to make the request to.
    * @param data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def post(url: String, data: js.Any, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * Perform an HTTP POST request to the given url.
    * @param url - The URL to make the request to.
    * @param data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param options - Additional options.
    * @param [options.headers] - HTTP headers to add to the request.
    * @param [options.async] - Make the request asynchronously. Defaults to true.
    * @param [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param [options.responseType] - Override the response type.
    * @param [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def post(url: String, data: js.Any, options: Cache, callback: HttpResponse): XMLHttpRequest = js.native
  
  def put(url: String, data: js.Any, callback: HttpResponse): XMLHttpRequest = js.native
  def put(url: String, data: js.Any, options: Cache, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * Perform an HTTP PUT request to the given url.
    * @param url - The URL to make the request to.
    * @param data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def put(url: String, data: Document, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * Perform an HTTP PUT request to the given url.
    * @param url - The URL to make the request to.
    * @param data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param options - Additional options.
    * @param [options.headers] - HTTP headers to add to the request.
    * @param [options.async] - Make the request asynchronously. Defaults to true.
    * @param [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param [options.responseType] - Override the response type.
    * @param [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def put(url: String, data: Document, options: Cache, callback: HttpResponse): XMLHttpRequest = js.native
  
  /**
    * Make a general purpose HTTP request.
    * @param method - The HTTP method "GET", "POST", "PUT", "DELETE".
    * @param url - The url to make the request to.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def request(method: String, url: String, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * Make a general purpose HTTP request.
    * @param method - The HTTP method "GET", "POST", "PUT", "DELETE".
    * @param url - The url to make the request to.
    * @param options - Additional options.
    * @param [options.headers] - HTTP headers to add to the request.
    * @param [options.async] - Make the request asynchronously. Defaults to true.
    * @param [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param [options.responseType] - Override the response type.
    * @param [options.postdata] - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns The request object.
    */
  def request(method: String, url: String, options: Headers, callback: HttpResponse): XMLHttpRequest = js.native
}
