package typings.openapiDashFactory.openapiDashFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiOptions extends js.Object {
  var errorMiddleware: js.UndefOr[js.Function0[_]] = js.undefined
  var requestMiddleware: js.UndefOr[js.Function0[_]] = js.undefined
  var responseMiddleware: js.UndefOr[js.Function0[_]] = js.undefined
}

object ApiOptions {
  @scala.inline
  def apply(
    errorMiddleware: () => _ = null,
    requestMiddleware: () => _ = null,
    responseMiddleware: () => _ = null
  ): ApiOptions = {
    val __obj = js.Dynamic.literal()
    if (errorMiddleware != null) __obj.updateDynamic("errorMiddleware")(js.Any.fromFunction0(errorMiddleware))
    if (requestMiddleware != null) __obj.updateDynamic("requestMiddleware")(js.Any.fromFunction0(requestMiddleware))
    if (responseMiddleware != null) __obj.updateDynamic("responseMiddleware")(js.Any.fromFunction0(responseMiddleware))
    __obj.asInstanceOf[ApiOptions]
  }
}

