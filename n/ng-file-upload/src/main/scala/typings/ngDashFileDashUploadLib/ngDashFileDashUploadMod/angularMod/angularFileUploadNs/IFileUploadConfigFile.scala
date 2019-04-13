package typings
package ngDashFileDashUploadLib.ngDashFileDashUploadMod.angularMod.angularFileUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadConfigFile
  extends angularLib.angularMod.IRequestConfig {
  /**
    * This is to accommodate server implementations expecting array data object keys in '[i]' or '[]' or
    * ''(multiple entries with same key) format.
    * Example: data: {rec: [file[0], file[1], ...]} sent as: rec[0] -> file[0], rec[1] -> file[1],...
    * data: {rec: {rec: [f[0], f[1], ...], arrayKey: '[]'} sent as: rec[] -> f[0], rec[] -> f[1],...
    * @type {string}
    */
  var arrayKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default false, experimental as hotfix for potential library conflicts with other plugins
    * @type {boolean}
    */
  var disableProgress: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This is to accommodate server implementations expecting nested data object keys in .key or [key] format.
    * Example: data: {rec: {name: 'N', pic: file}} sent as: rec[name] -> N, rec[pic] -> file
    * data: {rec: {name: 'N', pic: file}, objectKey: '.k'} sent as: rec.name -> N, rec.pic -> file
    * @type {string}
    */
  var objectKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Upload in chunks of specified size
    * @type {(number|string)}
    */
  var resumeChunkSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Function that returns a prommise which will be resolved to the upload file size on the server.
    * @type {[type]}
    */
  var resumeSize: js.UndefOr[angularLib.angularMod.Global.Function] = js.undefined
  /**
    * Reads the uploaded file size from resumeSizeUrl GET response
    * @type {Function}
    */
  var resumeSizeResponseReader: js.UndefOr[angularLib.angularMod.Global.Function] = js.undefined
  /**
    * Uploaded file size so far on the server
    * @type {string}
    */
  var resumeSizeUrl: js.UndefOr[java.lang.String] = js.undefined
}

object IFileUploadConfigFile {
  @scala.inline
  def apply(
    data: js.Any,
    method: java.lang.String,
    url: java.lang.String,
    arrayKey: java.lang.String = null,
    cache: js.Any = null,
    disableProgress: js.UndefOr[scala.Boolean] = js.undefined,
    eventHandlers: org.scalablytyped.runtime.StringDictionary[stdLib.EventListenerOrEventListenerObject] = null,
    headers: angularLib.angularMod.IHttpRequestConfigHeaders = null,
    jsonpCallbackParam: java.lang.String = null,
    objectKey: java.lang.String = null,
    paramSerializer: java.lang.String | (js.Function1[/* obj */ js.Any, java.lang.String]) = null,
    params: js.Any = null,
    responseType: java.lang.String = null,
    resumeChunkSize: scala.Double | java.lang.String = null,
    resumeSize: angularLib.angularMod.Global.Function = null,
    resumeSizeResponseReader: angularLib.angularMod.Global.Function = null,
    resumeSizeUrl: java.lang.String = null,
    timeout: scala.Double | angularLib.angularMod.IPromise[_] = null,
    transformRequest: angularLib.angularMod.IHttpRequestTransformer | js.Array[angularLib.angularMod.IHttpRequestTransformer] = null,
    transformResponse: angularLib.angularMod.IHttpResponseTransformer | js.Array[angularLib.angularMod.IHttpResponseTransformer] = null,
    uploadEventHandlers: org.scalablytyped.runtime.StringDictionary[stdLib.EventListenerOrEventListenerObject] = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    xsrfCookieName: java.lang.String = null,
    xsrfHeaderName: java.lang.String = null
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

