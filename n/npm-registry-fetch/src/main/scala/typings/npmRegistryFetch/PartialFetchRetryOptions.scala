package typings.npmRegistryFetch

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
    fetchRetries: Int | Double = null,
    fetchRetryFactor: Int | Double = null,
    fetchRetryMaxtimeout: Int | Double = null,
    fetchRetryMintimeout: Int | Double = null
  ): PartialFetchRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (fetchRetries != null) __obj.updateDynamic("fetchRetries")(fetchRetries.asInstanceOf[js.Any])
    if (fetchRetryFactor != null) __obj.updateDynamic("fetchRetryFactor")(fetchRetryFactor.asInstanceOf[js.Any])
    if (fetchRetryMaxtimeout != null) __obj.updateDynamic("fetchRetryMaxtimeout")(fetchRetryMaxtimeout.asInstanceOf[js.Any])
    if (fetchRetryMintimeout != null) __obj.updateDynamic("fetchRetryMintimeout")(fetchRetryMintimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFetchRetryOptions]
  }
}

