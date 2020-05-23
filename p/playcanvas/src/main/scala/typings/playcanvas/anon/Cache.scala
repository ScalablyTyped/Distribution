package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var maxRetryDelay: js.UndefOr[Double] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var retry: js.UndefOr[Boolean] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Cache {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    cache: js.Any = null,
    headers: js.Any = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    maxRetryDelay: js.UndefOr[Double] = js.undefined,
    responseType: String = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Cache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetryDelay)) __obj.updateDynamic("maxRetryDelay")(maxRetryDelay.get.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

