package typings.ngDashFileDashUpload.ngDashFileDashUploadMod.angularMod.angularFileUploadNs

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.Global.Function
import typings.angular.angularMod.IHttpRequestConfigHeaders
import typings.angular.angularMod.IHttpRequestTransformer
import typings.angular.angularMod.IHttpResponseTransformer
import typings.angular.angularMod.IPromise
import typings.angular.angularMod.IRequestConfig
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadConfigFile extends IRequestConfig {
  /**
    * This is to accommodate server implementations expecting array data object keys in '[i]' or '[]' or
    * ''(multiple entries with same key) format.
    * Example: data: {rec: [file[0], file[1], ...]} sent as: rec[0] -> file[0], rec[1] -> file[1],...
    * data: {rec: {rec: [f[0], f[1], ...], arrayKey: '[]'} sent as: rec[] -> f[0], rec[] -> f[1],...
    * @type {string}
    */
  var arrayKey: js.UndefOr[String] = js.undefined
  /**
    * Default false, experimental as hotfix for potential library conflicts with other plugins
    * @type {boolean}
    */
  var disableProgress: js.UndefOr[Boolean] = js.undefined
  /**
    * This is to accommodate server implementations expecting nested data object keys in .key or [key] format.
    * Example: data: {rec: {name: 'N', pic: file}} sent as: rec[name] -> N, rec[pic] -> file
    * data: {rec: {name: 'N', pic: file}, objectKey: '.k'} sent as: rec.name -> N, rec.pic -> file
    * @type {string}
    */
  var objectKey: js.UndefOr[String] = js.undefined
  /**
    * Upload in chunks of specified size
    * @type {(number|string)}
    */
  var resumeChunkSize: js.UndefOr[Double | String] = js.undefined
  /**
    * Function that returns a prommise which will be resolved to the upload file size on the server.
    * @type {[type]}
    */
  var resumeSize: js.UndefOr[Function] = js.undefined
  /**
    * Reads the uploaded file size from resumeSizeUrl GET response
    * @type {Function}
    */
  var resumeSizeResponseReader: js.UndefOr[Function] = js.undefined
  /**
    * Uploaded file size so far on the server
    * @type {string}
    */
  var resumeSizeUrl: js.UndefOr[String] = js.undefined
}

object IFileUploadConfigFile {
  @scala.inline
  def apply(
    data: js.Any,
    method: String,
    url: String,
    arrayKey: String = null,
    cache: js.Any = null,
    disableProgress: js.UndefOr[Boolean] = js.undefined,
    eventHandlers: StringDictionary[EventListenerOrEventListenerObject] = null,
    headers: IHttpRequestConfigHeaders = null,
    jsonpCallbackParam: String = null,
    objectKey: String = null,
    paramSerializer: String | (js.Function1[/* obj */ js.Any, String]) = null,
    params: js.Any = null,
    responseType: String = null,
    resumeChunkSize: Double | String = null,
    resumeSize: Function = null,
    resumeSizeResponseReader: Function = null,
    resumeSizeUrl: String = null,
    timeout: Double | IPromise[_] = null,
    transformRequest: IHttpRequestTransformer | js.Array[IHttpRequestTransformer] = null,
    transformResponse: IHttpResponseTransformer | js.Array[IHttpResponseTransformer] = null,
    uploadEventHandlers: StringDictionary[EventListenerOrEventListenerObject] = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xsrfCookieName: String = null,
    xsrfHeaderName: String = null
  ): IFileUploadConfigFile = {
    val __obj = js.Dynamic.literal(data = data, method = method, url = url)
    if (arrayKey != null) __obj.updateDynamic("arrayKey")(arrayKey)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(disableProgress)) __obj.updateDynamic("disableProgress")(disableProgress)
    if (eventHandlers != null) __obj.updateDynamic("eventHandlers")(eventHandlers)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam)
    if (objectKey != null) __obj.updateDynamic("objectKey")(objectKey)
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (resumeChunkSize != null) __obj.updateDynamic("resumeChunkSize")(resumeChunkSize.asInstanceOf[js.Any])
    if (resumeSize != null) __obj.updateDynamic("resumeSize")(resumeSize)
    if (resumeSizeResponseReader != null) __obj.updateDynamic("resumeSizeResponseReader")(resumeSizeResponseReader)
    if (resumeSizeUrl != null) __obj.updateDynamic("resumeSizeUrl")(resumeSizeUrl)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (uploadEventHandlers != null) __obj.updateDynamic("uploadEventHandlers")(uploadEventHandlers)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName)
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName)
    __obj.asInstanceOf[IFileUploadConfigFile]
  }
}

