package typings.parse.parseMod._Global_.Parse.Cloud

import typings.parse.parseMod._Global_.Parse.Attributes
import typings.parse.parseMod._Global_.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionRequest extends js.Object {
  var installationId: js.UndefOr[String] = js.undefined
  var master: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var user: js.UndefOr[User[Attributes]] = js.undefined
}

object FunctionRequest {
  @scala.inline
  def apply(
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    params: js.Any = null,
    user: User[Attributes] = null
  ): FunctionRequest = {
    val __obj = js.Dynamic.literal()
    if (installationId != null) __obj.updateDynamic("installationId")(installationId.asInstanceOf[js.Any])
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionRequest]
  }
}

