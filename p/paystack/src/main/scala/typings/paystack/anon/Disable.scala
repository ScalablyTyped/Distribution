package typings.paystack.anon

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disable extends js.Object {
  def create(params: Authorization): js.Promise[Response]
  def disable(params: Code): js.Promise[Responsedataundefined]
  def enable(params: Code): js.Promise[Responsedataundefined]
  def get(id_or_subscription_code: String): js.Promise[Response]
  def list(): js.Promise[ResponsedataArrayanymetaaDictothers]
}

object Disable {
  @scala.inline
  def apply(
    create: Authorization => js.Promise[Response],
    disable: Code => js.Promise[Responsedataundefined],
    enable: Code => js.Promise[Responsedataundefined],
    get: String => js.Promise[Response],
    list: () => js.Promise[ResponsedataArrayanymetaaDictothers]
  ): Disable = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[Disable]
  }
}

