package typings.npmRegistryFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<npm-registry-fetch.npm-registry-fetch.FetchRetryOptions> */
trait PartialFetchRetryOptions extends js.Object {
  var `fetch-retries`: js.UndefOr[Double] = js.undefined
  var `fetch-retry-factor`: js.UndefOr[Double] = js.undefined
  var `fetch-retry-maxtimeout`: js.UndefOr[Double] = js.undefined
  var `fetch-retry-mintimeout`: js.UndefOr[Double] = js.undefined
}

object PartialFetchRetryOptions {
  @scala.inline
  def apply(
    `fetch-retries`: Int | Double = null,
    `fetch-retry-factor`: Int | Double = null,
    `fetch-retry-maxtimeout`: Int | Double = null,
    `fetch-retry-mintimeout`: Int | Double = null
  ): PartialFetchRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (`fetch-retries` != null) __obj.updateDynamic("fetch-retries")(`fetch-retries`.asInstanceOf[js.Any])
    if (`fetch-retry-factor` != null) __obj.updateDynamic("fetch-retry-factor")(`fetch-retry-factor`.asInstanceOf[js.Any])
    if (`fetch-retry-maxtimeout` != null) __obj.updateDynamic("fetch-retry-maxtimeout")(`fetch-retry-maxtimeout`.asInstanceOf[js.Any])
    if (`fetch-retry-mintimeout` != null) __obj.updateDynamic("fetch-retry-mintimeout")(`fetch-retry-mintimeout`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFetchRetryOptions]
  }
}

