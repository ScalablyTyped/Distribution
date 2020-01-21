package typings.parse.mod._Global_.Parse.Cloud

import typings.parse.mod._Global_.Parse.Attributes
import typings.parse.mod._Global_.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionRequest[T /* <: Params */] extends js.Object {
  var installationId: js.UndefOr[String] = js.undefined
  var master: js.UndefOr[Boolean] = js.undefined
  var params: T
  var user: js.UndefOr[User[Attributes]] = js.undefined
}

object FunctionRequest {
  @scala.inline
  def apply[T /* <: Params */](
    params: T,
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    user: User[Attributes] = null
  ): FunctionRequest[T] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    if (installationId != null) __obj.updateDynamic("installationId")(installationId.asInstanceOf[js.Any])
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionRequest[T]]
  }
}

