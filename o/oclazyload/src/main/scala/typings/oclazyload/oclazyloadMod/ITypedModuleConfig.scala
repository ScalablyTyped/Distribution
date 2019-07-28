package typings.oclazyload.oclazyloadMod

import typings.angular.angularMod.IHttpRequestConfigHeaders
import typings.angular.angularMod.IHttpRequestTransformer
import typings.angular.angularMod.IHttpResponseTransformer
import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedModuleConfig extends IOptionsConfig {
  /**
    * The file path, including file name.
    */
  var path: String
  /**
    * The file extension, without the period. For example, 'html'.
    */
  var `type`: String
}

object ITypedModuleConfig {
  @scala.inline
  def apply(
    path: String,
    `type`: String,
    cache: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    headers: IHttpRequestConfigHeaders = null,
    insertBefore: String = null,
    jsonpCallbackParam: String = null,
    paramSerializer: String | (js.Function1[/* obj */ js.Any, String]) = null,
    params: js.Any = null,
    reconfig: js.UndefOr[Boolean] = js.undefined,
    rerun: js.UndefOr[Boolean] = js.undefined,
    responseType: String = null,
    serie: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | IPromise[_] = null,
    transformRequest: IHttpRequestTransformer | js.Array[IHttpRequestTransformer] = null,
    transformResponse: IHttpResponseTransformer | js.Array[IHttpResponseTransformer] = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xsrfCookieName: String = null,
    xsrfHeaderName: String = null
  ): ITypedModuleConfig = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore)
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam)
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(reconfig)) __obj.updateDynamic("reconfig")(reconfig)
    if (!js.isUndefined(rerun)) __obj.updateDynamic("rerun")(rerun)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (!js.isUndefined(serie)) __obj.updateDynamic("serie")(serie)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName)
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName)
    __obj.asInstanceOf[ITypedModuleConfig]
  }
}

