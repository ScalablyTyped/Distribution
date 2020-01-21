package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest", "WebResource")
@js.native
class WebResource () extends js.Object {
  /**
    * @property {any} [body] The request body
    */
  var body: js.UndefOr[js.Any] = js.native
  /**
    * @property {any} [formData] Formdata parameters.
    */
  var formData: js.UndefOr[js.Any] = js.native
  /**
    * Access to raw request headers for requests. Useful when you need to set a header
    * on every request (like in a credential object) where the prepare method does
    * far too much work.
    */
  var headers: StringDictionary[String] = js.native
  /**
    * @property {string} method The request method
    */
  var method: HttpMethods = js.native
  /**
    * @property {any} [query] Query parameters
    */
  var query: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * @property {boolean} rawResponse Indicates whether the client should give back the response as-is. (Useful for streaming scenarios).
    */
  var rawResponse: js.UndefOr[Boolean] = js.native
  /**
    * @property {string} url The request url
    */
  var url: String = js.native
  /**
    * Hook up the given input stream to a destination output stream if the WebResource method
    * requires a request body and a body is not already set.
    *
    * @param {Stream} inputStream the stream to pipe from
    * @param {Stream} outputStream the stream to pipe to
    *
    * @return destStream
    */
  def pipeInput(inputStream: Readable, destStream: Writable): Writable = js.native
  /**
    * Prepares the request.
    *
    * @param {object} options The request options that should be provided to send a request successfully
    *
    * @param {string} options.method The HTTP request method. Valid values are 'GET', 'PUT', 'HEAD', 'DELETE', 'OPTIONS', 'POST', 'PATCH'.
    *
    * @param {string} [options.url] The request url. It may or may not have query parameters in it.
    * Either provide the 'url' or provide the 'pathTemplate' in the options object. Both the options are mutually exclusive.
    *
    * @param {object} [options.queryParameters] A dictionary of query parameters to be appended to the url, where
    * the 'key' is the 'query-parameter-name' and the 'value' is the 'query-parameter-value'.
    * The 'query-parameter-value' can be of type 'string' or it can be of type 'object'.
    * The 'object' format should be used when you want to skip url encoding. While using the object format,
    * the object must have a property named value which provides the 'query-parameter-value'.
    * Example:
    *    - query-parameter-value in 'object' format: { 'query-parameter-name': { value: 'query-parameter-value', skipUrlEncoding: true } }
    *    - query-parameter-value in 'string' format: { 'query-parameter-name': 'query-parameter-value'}.
    * Note: 'If options.url already has some query parameters, then the value provided in options.queryParameters will be appended to the url.
    *
    * @param {string} [options.pathTemplate] The path template of the request url. Either provide the 'url' or provide the 'pathTemplate'
    * in the options object. Both the options are mutually exclusive.
    * Example: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}'
    *
    * @param {string} [options.baseUrl] The base url of the request. Default value is: 'https://management.azure.com'. This is applicable only with
    * options.pathTemplate. If you are providing options.url then it is expected that you provide the complete url.
    *
    * @param {object} [options.pathParameters] A dictionary of path parameters that need to be replaced with actual values in the pathTemplate.
    * Here the key is the 'path-parameter-name' and the value is the 'path-parameter-value'.
    * The 'path-parameter-value' can be of type 'string'  or it can be of type 'object'.
    * The 'object' format should be used when you want to skip url encoding. While using the object format,
    * the object must have a property named value which provides the 'path-parameter-value'.
    * Example:
    *    - path-parameter-value in 'object' format: { 'path-parameter-name': { value: 'path-parameter-value', skipUrlEncoding: true } }
    *    - path-parameter-value in 'string' format: { 'path-parameter-name': 'path-parameter-value' }.
    *
    * @param {object} [options.headers] A dictionary of request headers that need to be applied to the request.
    * Here the key is the 'header-name' and the value is the 'header-value'. The header-value MUST be of type string.
    *  - ContentType must be provided with the key name as 'Content-Type'. Default value 'application/json; charset=utf-8'.
    *  - 'Transfer-Encoding' is set to 'chunked' by default if 'options.bodyIsStream' is set to true.
    *  - 'Content-Type' is set to 'application/octet-stream' by default if 'options.bodyIsStream' is set to true.
    *  - 'accept-language' by default is set to 'en-US'
    *  - 'x-ms-client-request-id' by default is set to a new Guid. To not generate a guid for the request, please set options.disableClientRequestId to true
    *
    * @param {boolean} [options.disableClientRequestId] When set to true, instructs the client to not set 'x-ms-client-request-id' header to a new Guid().
    *
    * @param {object|string|boolean|array|number|null|undefined} [options.body] - The request body. It can be of any type. This method will JSON.stringify() the request body.
    *
    * @param {boolean} [options.disableJsonStringifyOnBody] - Indicates whether this method should JSON.stringify() the request body. Default value: false.
    *
    * @param {boolean} [options.bodyIsStream] - Indicates whether the request body is a stream (useful for file upload scenarios).
    *
    * @returns {object} WebResource Returns the prepared WebResource (HTTP Request) object that needs to be given to the request pipeline.
    */
  def prepare(): WebResource = js.native
  def prepare(options: PathTemplateBasedRequestPrepareOptions): WebResource = js.native
  def prepare(options: UrlBasedRequestPrepareOptions): WebResource = js.native
  /**
    * Validates that the required properties such as method, url, headers['Content-Type'],
    * headers['accept-language'] are defined. It will throw an error if one of the above
    * mentioned properties are not defined.
    */
  def validateRequestProperties(): Unit = js.native
}

