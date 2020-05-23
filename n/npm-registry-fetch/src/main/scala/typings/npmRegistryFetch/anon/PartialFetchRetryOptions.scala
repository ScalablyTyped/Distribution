package typings.npmRegistryFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<npm-registry-fetch.npm-registry-fetch.FetchRetryOptions> */
trait PartialFetchRetryOptions extends js.Object {
  var fetchRetries: js.UndefOr[Double] = js.undefined
  var fetchRetryFactor: js.UndefOr[Double] = js.undefined
  var fetchRetryMaxtimeout: js.UndefOr[Double] = js.undefined
  var fetchRetryMintimeout: js.UndefOr[Double] = js.undefined
}

object PartialFetchRetryOptions {
  @scala.inline
  def apply(
    fetchRetries: js.UndefOr[Double] = js.undefined,
    fetchRetryFactor: js.UndefOr[Double] = js.undefined,
    fetchRetryMaxtimeout: js.UndefOr[Double] = js.undefined,
    fetchRetryMintimeout: js.UndefOr[Double] = js.undefined
  ): PartialFetchRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchRetries)) __obj.updateDynamic("fetchRetries")(fetchRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchRetryFactor)) __obj.updateDynamic("fetchRetryFactor")(fetchRetryFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchRetryMaxtimeout)) __obj.updateDynamic("fetchRetryMaxtimeout")(fetchRetryMaxtimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchRetryMintimeout)) __obj.updateDynamic("fetchRetryMintimeout")(fetchRetryMintimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFetchRetryOptions]
  }
}

