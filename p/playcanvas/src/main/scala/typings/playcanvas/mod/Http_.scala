package typings.playcanvas.mod

import typings.playcanvas.anon.Async
import typings.playcanvas.anon.Cache
import typings.playcanvas.anon.Headers
import typings.std.Document
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link Http#get}, {@link Http#post}, {@link Http#put}, {@link Http#del}, and
  * {@link Http#request}.
  *
  * @callback HttpResponseCallback
  * @param {number|string|Error|null} err - The error code, message, or exception in the case where the request fails.
  * @param {*} [response] - The response data if no errors were encountered. (format depends on response type: text, Object, ArrayBuffer, XML).
  */
/**
  * Used to send and receive HTTP requests.
  */
@js.native
trait Http_ extends StObject {
  
  def _guessResponseType(url: Any): String = js.native
  
  def _isBinaryContentType(contentType: Any): Boolean = js.native
  
  def _isBinaryResponseType(responseType: Any): Boolean = js.native
  
  def _onError(method: Any, url: Any, options: Any, xhr: Any): Unit = js.native
  
  def _onReadyStateChange(method: Any, url: Any, options: Any, xhr: Any): Unit = js.native
  
  def _onSuccess(method: Any, url: Any, options: Any, xhr: Any): Unit = js.native
  
  /**
    * @function
    * @name Http#del
    * @description Perform an HTTP DELETE request to the given url.
    * @param {object} url - The URL to make the request to.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.del("http://example.com/", function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  /**
    * @function
    * @name Http#del
    * @variation 2
    * @description Perform an HTTP DELETE request to the given url with additional options such as headers, retries, credentials, etc.
    * @param {object} url - The URL to make the request to.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {boolean} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {string} [options.responseType] - Override the response type.
    * @param {Document|object} [options.postdata] - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.del("http://example.com/", { "retry": true, "maxRetries": 5 }, function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  def del(url: js.Object, options: Async, callback: HttpResponseCallback): XMLHttpRequest = js.native
  
  /**
    * @function
    * @name Http#get
    * @description Perform an HTTP GET request to the given url.
    * @param {string} url - The URL to make the request to.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.get("http://example.com/", function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  /**
    * @function
    * @name Http#get
    * @variation 2
    * @description Perform an HTTP GET request to the given url with additional options such as headers, retries, credentials, etc.
    * @param {string} url - The URL to make the request to.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {boolean} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {string} [options.responseType] - Override the response type.
    * @param {Document|object} [options.postdata] - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.get("http://example.com/", { "retry": true, "maxRetries": 5 }, function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  def get(url: String, options: Async, callback: HttpResponseCallback): XMLHttpRequest = js.native
  
  /**
    * @function
    * @name Http#post
    * @description Perform an HTTP POST request to the given url.
    * @param {string} url - The URL to make the request to.
    * @param {object} data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.post("http://example.com/", { "name": "Alix" }, function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  /**
    * @function
    * @name Http#post
    * @variation 2
    * @description Perform an HTTP POST request to the given url with additional options such as headers, retries, credentials, etc.
    * @param {string} url - The URL to make the request to.
    * @param {object} data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {boolean} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {string} [options.responseType] - Override the response type.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.post("http://example.com/", { "name": "Alix" }, { "retry": true, "maxRetries": 5 }, function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  def post(url: String, data: js.Object, options: Cache, callback: HttpResponseCallback): XMLHttpRequest = js.native
  
  def put(url: String, data: js.Object, options: Cache, callback: HttpResponseCallback): XMLHttpRequest = js.native
  /**
    * @function
    * @name Http#put
    * @description Perform an HTTP PUT request to the given url.
    * @param {string} url - The URL to make the request to.
    * @param {Document|object} data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.put("http://example.com/", { "name": "Alix" }, function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  /**
    * @function
    * @name Http#put
    * @variation 2
    * @description Perform an HTTP PUT request to the given url with additional options such as headers, retries, credentials, etc.
    * @param {string} url - The URL to make the request to.
    * @param {Document|object} data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {boolean} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {string} [options.responseType] - Override the response type.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.put("http://example.com/", { "name": "Alix" }, { "retry": true, "maxRetries": 5 }, function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  def put(url: String, data: Document, options: Cache, callback: HttpResponseCallback): XMLHttpRequest = js.native
  
  /**
    * @function
    * @name Http#request
    * @description Make a general purpose HTTP request.
    * @param {string} method - The HTTP method "GET", "POST", "PUT", "DELETE".
    * @param {string} url - The url to make the request to.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.request("get", "http://example.com/", function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  /**
    * @function
    * @name Http#request
    * @variation 2
    * @description Make a general purpose HTTP request with additional options such as headers, retries, credentials, etc.
    * @param {string} method - The HTTP method "GET", "POST", "PUT", "DELETE".
    * @param {string} url - The url to make the request to.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {boolean} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {string} [options.responseType] - Override the response type.
    * @param {Document|object} [options.postdata] - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {HttpResponseCallback} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.request("get", "http://example.com/", { "retry": true, "maxRetries": 5 }, function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  def request(method: String, url: String, options: Headers, callback: HttpResponseCallback): XMLHttpRequest = js.native
}
