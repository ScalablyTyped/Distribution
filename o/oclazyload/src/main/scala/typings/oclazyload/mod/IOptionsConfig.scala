package typings.oclazyload.mod

import typings.angular.mod.IHttpRequestConfigHeaders
import typings.angular.mod.IHttpRequestTransformer
import typings.angular.mod.IHttpResponseTransformer
import typings.angular.mod.IPromise
import typings.angular.mod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsConfig extends IRequestShortcutConfig {
  /**
    * If true, bypasses browser cache by appending a timestamp to URLs. Defaults to true.
    */
  @JSName("cache")
  var cache_IOptionsConfig: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, will insert files immediately before the provided CSS selector, instead of the default behavior of inserting files immediately before the
    * last child of the <head> element. Defaults to undefined.
    */
  var insertBefore: js.UndefOr[String] = js.undefined
  /**
    * If true, a module config will be invoked each time the module is reloaded. Use with caution, as re-invoking configs can lead to unexpected results.
    * Defaults to false.
    */
  var reconfig: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, a module run block will be invoked each time the module is reloaded. Use with caution, as re-invoking run blocks can lead to unexpected results.
    * Defaults to false.
    */
  var rerun: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, will load files in a series, instead of in parallel. Defaults to false.
    */
  var serie: js.UndefOr[Boolean] = js.undefined
}

object IOptionsConfig {
  @scala.inline
  def apply(
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
  ): IOptionsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore.asInstanceOf[js.Any])
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[IOptionsConfig]
  }
}

