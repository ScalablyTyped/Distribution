package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullOptions extends js.Object {
  var error: js.UndefOr[js.Function] = js.undefined
  var installationId: js.UndefOr[java.lang.String] = js.undefined
  var progress: js.UndefOr[js.Function] = js.undefined
  var sessionToken: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[js.Function] = js.undefined
  var useMasterKey: js.UndefOr[scala.Boolean] = js.undefined
}

object FullOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    installationId: java.lang.String = null,
    progress: js.Function = null,
    sessionToken: java.lang.String = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined
  ): FullOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[FullOptions]
  }
}

