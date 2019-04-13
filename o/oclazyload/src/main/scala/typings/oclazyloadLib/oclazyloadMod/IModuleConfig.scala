package typings
package oclazyloadLib.oclazyloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModuleConfig extends IOptionsConfig {
  /**
    * The list of files to be loaded for this module.
    */
  var files: js.Array[java.lang.String]
  /**
    * The name of the module for easy retrieval later.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IModuleConfig {
  @scala.inline
  def apply(
    files: js.Array[java.lang.String],
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    headers: angularLib.angularMod.IHttpRequestConfigHeaders = null,
    insertBefore: java.lang.String = null,
    jsonpCallbackParam: java.lang.String = null,
    name: java.lang.String = null,
    paramSerializer: java.lang.String | (js.Function1[/* obj */ js.Any, java.lang.String]) = null,
    params: js.Any = null,
    reconfig: js.UndefOr[scala.Boolean] = js.undefined,
    rerun: js.UndefOr[scala.Boolean] = js.undefined,
    responseType: java.lang.String = null,
    serie: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Double | angularLib.angularMod.IPromise[_] = null,
    transformRequest: angularLib.angularMod.IHttpRequestTransformer | js.Array[angularLib.angularMod.IHttpRequestTransformer] = null,
    transformResponse: angularLib.angularMod.IHttpResponseTransformer | js.Array[angularLib.angularMod.IHttpResponseTransformer] = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    xsrfCookieName: java.lang.String = null,
    xsrfHeaderName: java.lang.String = null
  ): IModuleConfig = {
    val __obj = js.Dynamic.literal(files = files)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore)
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam)
    if (name != null) __obj.updateDynamic("name")(name)
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
    __obj.asInstanceOf[IModuleConfig]
  }
}

