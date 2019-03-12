package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionRequest extends js.Object {
  var installationId: js.UndefOr[java.lang.String] = js.undefined
  var master: js.UndefOr[scala.Boolean] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var user: js.UndefOr[parseLib.ParseNs.User] = js.undefined
}

object FunctionRequest {
  @scala.inline
  def apply(
    installationId: java.lang.String = null,
    master: js.UndefOr[scala.Boolean] = js.undefined,
    params: js.Any = null,
    user: parseLib.ParseNs.User = null
  ): FunctionRequest = {
    val __obj = js.Dynamic.literal()
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master)
    if (params != null) __obj.updateDynamic("params")(params)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[FunctionRequest]
  }
}

