package typings.paystack

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisable extends js.Object {
  def create(params: AnonAuthorization): js.Promise[Response]
  def disable(params: AnonCode): js.Promise[Responsedataundefined]
  def enable(params: AnonCode): js.Promise[Responsedataundefined]
  def get(id_or_subscription_code: String): js.Promise[Response]
  def list(): js.Promise[ResponsedataArrayanymetaaDictothers]
}

object AnonDisable {
  @scala.inline
  def apply(
    create: AnonAuthorization => js.Promise[Response],
    disable: AnonCode => js.Promise[Responsedataundefined],
    enable: AnonCode => js.Promise[Responsedataundefined],
    get: String => js.Promise[Response],
    list: () => js.Promise[ResponsedataArrayanymetaaDictothers]
  ): AnonDisable = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[AnonDisable]
  }
}

