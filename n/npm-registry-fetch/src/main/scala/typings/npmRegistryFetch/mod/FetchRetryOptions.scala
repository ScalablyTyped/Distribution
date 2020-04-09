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
    fetchRetries: Int | Double = null,
    fetchRetryFactor: Int | Double = null,
    fetchRetryMaxtimeout: Int | Double = null,
    fetchRetryMintimeout: Int | Double = null
  ): FetchRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (fetchRetries != null) __obj.updateDynamic("fetchRetries")(fetchRetries.asInstanceOf[js.Any])
    if (fetchRetryFactor != null) __obj.updateDynamic("fetchRetryFactor")(fetchRetryFactor.asInstanceOf[js.Any])
    if (fetchRetryMaxtimeout != null) __obj.updateDynamic("fetchRetryMaxtimeout")(fetchRetryMaxtimeout.asInstanceOf[js.Any])
    if (fetchRetryMintimeout != null) __obj.updateDynamic("fetchRetryMintimeout")(fetchRetryMintimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchRetryOptions]
  }
}

