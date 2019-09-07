package typings.playcanvas.pcNs

import typings.playcanvas.Anon_Async
import typings.playcanvas.Anon_AsyncCache
import typings.playcanvas.Anon_AsyncCacheHeaders
import typings.playcanvas.pcNs.callbacksNs.HttpResponse
import typings.std.Document
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Http
  * @classdesc Used to send and receive HTTP requests.
  * @description Create a new Http instance. By default, a PlayCanvas application creates an instance of this
  * object at `pc.http`.
  */
@JSGlobal("pc.Http")
@js.native
class Http () extends js.Object {
  /**
    * @function
    * @name pc.Http#del
    * @description Perform an HTTP DELETE request to the given url
    * @param {Object} url The URL to make the request to
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def del(url: js.Any, callback: HttpResponse): XMLHttpRequest = js.native
  /** @function
    * @name pc.Http#del
    * @variation 2
    * @description Perform an HTTP DELETE request to the given url
    * @param {Object} url The URL to make the request to
    * @param {Object} options Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously. Defaults to true.
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request. Defaults to true.
    * @param {String} [options.responseType] Override the response type
    * @param {Document | Object} [options.postdata] Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {Boolean} [options.retry] If true then if the request fails it will be retried with an exponential backoff.
    * @param {Number} [options.maxRetries] If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {Number} [options.maxRetryDelay] If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def del(url: js.Any, options: Anon_Async, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#get
    * @description Perform an HTTP GET request to the given url.
    * @param {String} url The URL to make the request to.
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @example
    * pc.http.get("http://example.com/", function (err, response) {
    *     console.log(response);
    * });
    * @returns {XMLHttpRequest} The request object.
    */
  def get(url: String, callback: HttpResponse): XMLHttpRequest = js.native
  /** @function
    * @name pc.Http#get
    * @variation 2
    * @description Perform an HTTP GET request to the given url.
    * @param {String} url The URL to make the request to.
    * @param {Object} options Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously. Defaults to true.
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request. Defaults to true.
    * @param {String} [options.responseType] Override the response type
    * @param {Document | Object} [options.postdata] Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {Boolean} [options.retry] If true then if the request fails it will be retried with an exponential backoff.
    * @param {Number} [options.maxRetries] If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {Number} [options.maxRetryDelay] If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def get(url: String, options: Anon_Async, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#post
    * @description Perform an HTTP POST request to the given url.
    * @param {String} url The URL to make the request to.
    * @param {Object} data Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def post(url: String, data: js.Any, callback: HttpResponse): XMLHttpRequest = js.native
  /** @function
    * @name pc.Http#post
    * @variation 2
    * @description Perform an HTTP POST request to the given url.
    * @param {String} url The URL to make the request to.
    * @param {Object} data Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {Object} options Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously. Defaults to true.
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request. Defaults to true.
    * @param {String} [options.responseType] Override the response type
    * @param {Boolean} [options.retry] If true then if the request fails it will be retried with an exponential backoff.
    * @param {Number} [options.maxRetries] If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {Number} [options.maxRetryDelay] If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def post(url: String, data: js.Any, options: Anon_AsyncCache, callback: HttpResponse): XMLHttpRequest = js.native
  def put(url: String, data: js.Any, callback: HttpResponse): XMLHttpRequest = js.native
  def put(url: String, data: js.Any, options: Anon_AsyncCache, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#put
    * @description Perform an HTTP PUT request to the given url.
    * @param {String} url The URL to make the request to.
    * @param {Document | Object} data Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def put(url: String, data: Document, callback: HttpResponse): XMLHttpRequest = js.native
  /** @function
    * @name pc.Http#put
    * @variation 2
    * @description Perform an HTTP PUT request to the given url.
    * @param {String} url The URL to make the request to.
    * @param {Document | Object} data Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {Object} options Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously. Defaults to true.
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request. Defaults to true.
    * @param {String} [options.responseType] Override the response type
    * @param {Boolean} [options.retry] If true then if the request fails it will be retried with an exponential backoff.
    * @param {Number} [options.maxRetries] If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {Number} [options.maxRetryDelay] If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def put(url: String, data: Document, options: Anon_AsyncCache, callback: HttpResponse): XMLHttpRequest = js.native
  /**
    * @function
    * @name pc.Http#request
    * @description Make a general purpose HTTP request.
    * @param {String} method The HTTP method "GET", "POST", "PUT", "DELETE"
    * @param {String} url The url to make the request to
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def request(method: String, url: String, callback: HttpResponse): XMLHttpRequest = js.native
  /** @function
    * @name pc.Http#request
    * @variation 2
    * @description Make a general purpose HTTP request.
    * @param {String} method The HTTP method "GET", "POST", "PUT", "DELETE"
    * @param {String} url The url to make the request to
    * @param {Object} options Additional options
    * @param {Object} [options.headers] HTTP headers to add to the request
    * @param {Boolean} [options.async] Make the request asynchronously. Defaults to true.
    * @param {Object} [options.cache] If false, then add a timestamp to the request to prevent caching
    * @param {Boolean} [options.withCredentials] Send cookies with this request. Defaults to true.
    * @param {Boolean} [options.retry] If true then if the request fails it will be retried with an exponential backoff.
    * @param {Number} [options.maxRetries] If options.retry is true this specifies the maximum number of retries. Defaults to 5.
    * @param {Number} [options.maxRetryDelay] If options.retry is true this specifies the maximum amount of time to wait between retries in milliseconds. Defaults to 5000.
    * @param {String} [options.responseType] Override the response type
    * @param {Document|Object} [options.postdata] Data to send in the body of the request.
    * Some content types are handled automatically. If postdata is an XML Document, it is handled. If
    * the Content-Type header is set to 'application/json' then the postdata is JSON stringified.
    * Otherwise, by default, the data is sent as form-urlencoded.
    * @param {pc.callbacks.HttpResponse} callback The callback used when the response has returned. Passed (err, data)
    * where data is the response (format depends on response type: text, Object, ArrayBuffer, XML) and
    * err is the error code.
    * @returns {XMLHttpRequest} The request object.
    */
  def request(method: String, url: String, options: Anon_AsyncCacheHeaders, callback: HttpResponse): XMLHttpRequest = js.native
}

