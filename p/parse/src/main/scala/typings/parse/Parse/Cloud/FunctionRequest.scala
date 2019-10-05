package typings.parse.Parse.Cloud

import typings.parse.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionRequest extends js.Object {
  var installationId: js.UndefOr[String] = js.undefined
  var master: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object FunctionRequest {
  @scala.inline
  def apply(
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    params: js.Any = null,
    user: User = null
  ): FunctionRequest = {
    val __obj = js.Dynamic.literal()
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master)
    if (params != null) __obj.updateDynamic("params")(params)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[FunctionRequest]
  }
}

