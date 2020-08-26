package typings.npmRegistryFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<npm-registry-fetch.npm-registry-fetch.FetchRetryOptions> */
@js.native
trait PartialFetchRetryOptions extends js.Object {
  var fetchRetries: js.UndefOr[Double] = js.native
  var fetchRetryFactor: js.UndefOr[Double] = js.native
  var fetchRetryMaxtimeout: js.UndefOr[Double] = js.native
  var fetchRetryMintimeout: js.UndefOr[Double] = js.native
}

object PartialFetchRetryOptions {
  @scala.inline
  def apply(): PartialFetchRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFetchRetryOptions]
  }
  @scala.inline
  implicit class PartialFetchRetryOptionsOps[Self <: PartialFetchRetryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetchRetries(value: Double): Self = this.set("fetchRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchRetries: Self = this.set("fetchRetries", js.undefined)
    @scala.inline
    def setFetchRetryFactor(value: Double): Self = this.set("fetchRetryFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchRetryFactor: Self = this.set("fetchRetryFactor", js.undefined)
    @scala.inline
    def setFetchRetryMaxtimeout(value: Double): Self = this.set("fetchRetryMaxtimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchRetryMaxtimeout: Self = this.set("fetchRetryMaxtimeout", js.undefined)
    @scala.inline
    def setFetchRetryMintimeout(value: Double): Self = this.set("fetchRetryMintimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchRetryMintimeout: Self = this.set("fetchRetryMintimeout", js.undefined)
  }
  
}

