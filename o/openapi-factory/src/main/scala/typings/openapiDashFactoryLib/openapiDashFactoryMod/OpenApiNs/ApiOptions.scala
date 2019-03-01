package typings
package openapiDashFactoryLib.openapiDashFactoryMod.OpenApiNs

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
    errorMiddleware: js.Function0[_] = null,
    requestMiddleware: js.Function0[_] = null,
    responseMiddleware: js.Function0[_] = null
  ): ApiOptions = {
    val __obj = js.Dynamic.literal()
    if (errorMiddleware != null) __obj.updateDynamic("errorMiddleware")(errorMiddleware)
    if (requestMiddleware != null) __obj.updateDynamic("requestMiddleware")(requestMiddleware)
    if (responseMiddleware != null) __obj.updateDynamic("responseMiddleware")(responseMiddleware)
    __obj.asInstanceOf[ApiOptions]
  }
}

