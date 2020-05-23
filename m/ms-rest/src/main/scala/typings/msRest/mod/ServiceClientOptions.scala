package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceClientOptions extends js.Object {
  var filters: js.UndefOr[js.Array[_]] = js.undefined
  var noRetryPolicy: js.UndefOr[Boolean] = js.undefined
  var requestOptions: js.UndefOr[ClientRequestOptions] = js.undefined
}

object ServiceClientOptions {
  @scala.inline
  def apply(
    filters: js.Array[_] = null,
    noRetryPolicy: js.UndefOr[Boolean] = js.undefined,
    requestOptions: ClientRequestOptions = null
  ): ServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(noRetryPolicy)) __obj.updateDynamic("noRetryPolicy")(noRetryPolicy.get.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceClientOptions]
  }
}

