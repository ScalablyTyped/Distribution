package typings.oclazyload.oclazyloadMod

import typings.angular.angularMod.IHttpRequestConfigHeaders
import typings.angular.angularMod.IHttpRequestTransformer
import typings.angular.angularMod.IHttpResponseTransformer
import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModuleConfig extends IOptionsConfig {
  /**
    * The list of files to be loaded for this module.
    */
  var files: js.Array[String]
  /**
    * The name of the module for easy retrieval later.
    */
  var name: js.UndefOr[String] = js.undefined
}

object IModuleConfig {
  @scala.inline
  def apply(
    files: js.Array[String],
    cache: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    headers: IHttpRequestConfigHeaders = null,
    insertBefore: String = null,
    jsonpCallbackParam: String = null,
    name: String = null,
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
  ): IModuleConfig = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore.asInstanceOf[js.Any])
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reconfig)) __obj.updateDynamic("reconfig")(reconfig.asInstanceOf[js.Any])
    if (!js.isUndefined(rerun)) __obj.updateDynamic("rerun")(rerun.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(serie)) __obj.updateDynamic("serie")(serie.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName.asInstanceOf[js.Any])
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModuleConfig]
  }
}

