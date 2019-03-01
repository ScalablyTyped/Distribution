package typings
package parseLib.ParseNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyAllOptions
  extends parseLib.ParseNs.SuccessFailureOptions
     with parseLib.ParseNs.ScopeOptions

object DestroyAllOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    sessionToken: java.lang.String = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined
  ): DestroyAllOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[DestroyAllOptions]
  }
}

