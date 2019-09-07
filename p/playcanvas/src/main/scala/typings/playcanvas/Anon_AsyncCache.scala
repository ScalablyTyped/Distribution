package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncCache extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var maxRetryDelay: js.UndefOr[Double] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var retry: js.UndefOr[Boolean] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_AsyncCache {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    cache: js.Any = null,
    headers: js.Any = null,
    maxRetries: Int | Double = null,
    maxRetryDelay: Int | Double = null,
    responseType: String = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Anon_AsyncCache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (maxRetryDelay != null) __obj.updateDynamic("maxRetryDelay")(maxRetryDelay.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[Anon_AsyncCache]
  }
}

