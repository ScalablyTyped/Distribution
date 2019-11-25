package typings.playcanvas

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var maxRetryDelay: js.UndefOr[Double] = js.undefined
  var postdata: js.UndefOr[Document | js.Any] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var retry: js.UndefOr[Boolean] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_Async {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    cache: js.Any = null,
    headers: js.Any = null,
    maxRetries: Int | Double = null,
    maxRetryDelay: Int | Double = null,
    postdata: Document | js.Any = null,
    responseType: String = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Anon_Async = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (maxRetryDelay != null) __obj.updateDynamic("maxRetryDelay")(maxRetryDelay.asInstanceOf[js.Any])
    if (postdata != null) __obj.updateDynamic("postdata")(postdata.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Async]
  }
}

