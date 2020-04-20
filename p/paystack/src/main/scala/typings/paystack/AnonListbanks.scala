package typings.paystack

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListbanks extends js.Object {
  def list_banks(params: AnonPage): js.Promise[ResponsedataArrayany]
  def resolve_bin(bin: String): js.Promise[Response]
}

object AnonListbanks {
  @scala.inline
  def apply(
    list_banks: AnonPage => js.Promise[ResponsedataArrayany],
    resolve_bin: String => js.Promise[Response]
  ): AnonListbanks = {
    val __obj = js.Dynamic.literal(list_banks = js.Any.fromFunction1(list_banks), resolve_bin = js.Any.fromFunction1(resolve_bin))
    __obj.asInstanceOf[AnonListbanks]
  }
}

