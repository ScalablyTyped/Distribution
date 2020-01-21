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
  var `fetch-retries`: js.UndefOr[Double] = js.undefined
  /**
    * The "factor" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var `fetch-retry-factor`: js.UndefOr[Double] = js.undefined
  /**
    * The "maxTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var `fetch-retry-maxtimeout`: js.UndefOr[Double] = js.undefined
  /**
    * The "minTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var `fetch-retry-mintimeout`: js.UndefOr[Double] = js.undefined
}

object FetchRetryOptions {
  @scala.inline
  def apply(
    `fetch-retries`: Int | Double = null,
    `fetch-retry-factor`: Int | Double = null,
    `fetch-retry-maxtimeout`: Int | Double = null,
    `fetch-retry-mintimeout`: Int | Double = null
  ): FetchRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (`fetch-retries` != null) __obj.updateDynamic("fetch-retries")(`fetch-retries`.asInstanceOf[js.Any])
    if (`fetch-retry-factor` != null) __obj.updateDynamic("fetch-retry-factor")(`fetch-retry-factor`.asInstanceOf[js.Any])
    if (`fetch-retry-maxtimeout` != null) __obj.updateDynamic("fetch-retry-maxtimeout")(`fetch-retry-maxtimeout`.asInstanceOf[js.Any])
    if (`fetch-retry-mintimeout` != null) __obj.updateDynamic("fetch-retry-mintimeout")(`fetch-retry-mintimeout`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchRetryOptions]
  }
}

