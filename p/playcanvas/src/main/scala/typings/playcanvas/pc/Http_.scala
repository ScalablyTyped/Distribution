package typings.playcanvas.pc

import typings.playcanvas.AnonAsync
import typings.playcanvas.AnonAsyncCache
import typings.playcanvas.AnonAsyncCacheHeaders
import typings.playcanvas.pc.callbacks.HttpResponse
import typings.std.Document_
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Http
  * @classdesc Used to send and receive HTTP requests.
  * @description Create a new Http instance. By default, a PlayCanvas application creates an instance of this
  * object at `pc.http`.
  */
@JSGlobal("pc.Http")
@js.native
class Http_ () extends js.Object {
  /**
    * @function
    * @name pc.Http#del
    * @description Perform an HTTP DELETE request to the given url.
    * @param {object} url - The URL to make the request to.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def del(url: js.Any, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#del
    * @variation 2
    * @description Perform an HTTP DELETE request to the given url.
    * @param {object} url - The URL to make the request to.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {object} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {string} [options.responseType] - Override the response type.
    * @param {Document|object} [options.postdata] - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def del(url: js.Any, options: AnonAsync, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#get
    * @description Perform an HTTP GET request to the given url.
    * @param {string} url - The URL to make the request to.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.get("http://example.com/", function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  def get(url: String, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#get
    * @variation 2
    * @description Perform an HTTP GET request to the given url.
    * @param {string} url - The URL to make the request to.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {object} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {string} [options.responseType] - Override the response type.
    * @param {Document|object} [options.postdata] - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def get(url: String, options: AnonAsync, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#post
    * @description Perform an HTTP POST request to the given url.
    * @param {string} url - The URL to make the request to.
    * @param {object} data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def post(url: String, data: js.Any, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#post
    * @variation 2
    * @description Perform an HTTP POST request to the given url.
    * @param {string} url - The URL to make the request to.
    * @param {object} data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {object} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {string} [options.responseType] - Override the response type.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def post(url: String, data: js.Any, options: AnonAsyncCache, callback: HttpResponse): XMLHttpRequest = js.native
  def put(url: String, data: js.Any, callback: HttpResponse): XMLHttpRequest = js.native
  def put(url: String, data: js.Any, options: AnonAsyncCache, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#put
    * @description Perform an HTTP PUT request to the given url.
    * @param {string} url - The URL to make the request to.
    * @param {Document|object} data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def put(url: String, data: Document_, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#put
    * @variation 2
    * @description Perform an HTTP PUT request to the given url.
    * @param {string} url - The URL to make the request to.
    * @param {Document|object} data - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {object} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {string} [options.responseType] - Override the response type.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def put(url: String, data: Document_, options: AnonAsyncCache, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#request
    * @description Make a general purpose HTTP request.
    * @param {string} method - The HTTP method "GET", "POST", "PUT", "DELETE".
    * @param {string} url - The url to make the request to.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def request(method: String, url: String, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#request
    * @variation 2
    * @description Make a general purpose HTTP request.
    * @param {string} method - The HTTP method "GET", "POST", "PUT", "DELETE".
    * @param {string} url - The url to make the request to.
    * @param {object} options - Additional options.
    * @param {object} [options.headers] - HTTP headers to add to the request.
    * @param {boolean} [options.async] - Make the request asynchronously. Defaults to true.
    * @param {object} [options.cache] - If false, then add a timestamp to the request to prevent caching.
    * @param {boolean} [options.withCredentials] - Send cookies with this request. Defaults to false.
    * @param {boolean} [options.retry] - If true then if the request fails it will be retried with an exponential backoff.
    * @param {number} [options.maxRetries] - If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {number} [options.maxRetryDelay] - If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {string} [options.responseType] - Override the response type.
    * @param {Document|object} [options.postdata] - Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {pc.callbacks.HttpResponse} callback - The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def request(method: String, url: String, options: AnonAsyncCacheHeaders, callback: HttpResponse): XMLHttpRequest = js.native
}

