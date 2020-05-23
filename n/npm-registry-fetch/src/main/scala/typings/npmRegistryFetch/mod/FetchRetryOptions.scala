package typings.npmRegistryFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchRetryOptions extends js.Object {
  /**
    * The "retries" config for `retry` to use when fetching packages from
    * the registry.
    *
    * See also `opts.retry` to provide all retry options as a single object.
    */
  var fetchRetries: js.UndefOr[Double] = js.undefined
  /**
    * The "factor" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryFactor: js.UndefOr[Double] = js.undefined
  /**
    * The "maxTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryMaxtimeout: js.UndefOr[Double] = js.undefined
  /**
    * The "minTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var fetchRetryMintimeout: js.UndefOr[Double] = js.undefined
}

object FetchRetryOptions {
  @scala.inline
  def apply(
    fetchRetries: js.UndefOr[Double] = js.undefined,
    fetchRetryFactor: js.UndefOr[Double] = js.undefined,
    fetchRetryMaxtimeout: js.UndefOr[Double] = js.undefined,
    fetchRetryMintimeout: js.UndefOr[Double] = js.undefined
  ): FetchRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchRetries)) __obj.updateDynamic("fetchRetries")(fetchRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchRetryFactor)) __obj.updateDynamic("fetchRetryFactor")(fetchRetryFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchRetryMaxtimeout)) __obj.updateDynamic("fetchRetryMaxtimeout")(fetchRetryMaxtimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchRetryMintimeout)) __obj.updateDynamic("fetchRetryMintimeout")(fetchRetryMintimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchRetryOptions]
  }
}

