package typings
package oclazyloadLib.oclazyloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedModuleConfig extends IOptionsConfig {
  /**
    * The file path, including file name.
    */
  var path: java.lang.String
  /**
    * The file extension, without the period. For example, 'html'.
    */
  var `type`: java.lang.String
}

object ITypedModuleConfig {
  @scala.inline
  def apply(
    path: java.lang.String,
    `type`: java.lang.String,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    headers: angularLib.angularMod.angularNs.IHttpRequestConfigHeaders = null,
    insertBefore: java.lang.String = null,
    jsonpCallbackParam: java.lang.String = null,
    paramSerializer: java.lang.String | (js.Function1[/* obj */ js.Any, java.lang.String]) = null,
    params: js.Any = null,
    reconfig: js.UndefOr[scala.Boolean] = js.undefined,
    rerun: js.UndefOr[scala.Boolean] = js.undefined,
    responseType: java.lang.String = null,
    serie: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Double | angularLib.angularMod.angularNs.IPromise[_] = null,
    transformRequest: angularLib.angularMod.angularNs.IHttpRequestTransformer | js.Array[angularLib.angularMod.angularNs.IHttpRequestTransformer] = null,
    transformResponse: angularLib.angularMod.angularNs.IHttpResponseTransformer | js.Array[angularLib.angularMod.angularNs.IHttpResponseTransformer] = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    xsrfCookieName: java.lang.String = null,
    xsrfHeaderName: java.lang.String = null
  ): ITypedModuleConfig = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("path")(path)
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

