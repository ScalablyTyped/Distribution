package typings.ngFileUpload.mod.angularAugmentingMod.angularFileUpload

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IHttpRequestConfigHeaders
import typings.angular.mod.IHttpRequestTransformer
import typings.angular.mod.IHttpResponseTransformer
import typings.angular.mod.IPromise
import typings.angular.mod.IRequestConfig
import typings.angular.mod._Global_.Function
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
    method: String,
    url: String,
    arrayKey: String = null,
    cache: js.Any = null,
    data: js.Any = null,
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
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (arrayKey != null) __obj.updateDynamic("arrayKey")(arrayKey.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disableProgress)) __obj.updateDynamic("disableProgress")(disableProgress.asInstanceOf[js.Any])
    if (eventHandlers != null) __obj.updateDynamic("eventHandlers")(eventHandlers.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam.asInstanceOf[js.Any])
    if (objectKey != null) __obj.updateDynamic("objectKey")(objectKey.asInstanceOf[js.Any])
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (resumeChunkSize != null) __obj.updateDynamic("resumeChunkSize")(resumeChunkSize.asInstanceOf[js.Any])
    if (resumeSize != null) __obj.updateDynamic("resumeSize")(resumeSize.asInstanceOf[js.Any])
    if (resumeSizeResponseReader != null) __obj.updateDynamic("resumeSizeResponseReader")(resumeSizeResponseReader.asInstanceOf[js.Any])
    if (resumeSizeUrl != null) __obj.updateDynamic("resumeSizeUrl")(resumeSizeUrl.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (uploadEventHandlers != null) __obj.updateDynamic("uploadEventHandlers")(uploadEventHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName.asInstanceOf[js.Any])
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUploadConfigFile]
  }
}

