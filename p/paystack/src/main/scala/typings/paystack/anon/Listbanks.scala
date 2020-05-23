package typings.paystack.anon

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listbanks extends js.Object {
  def list_banks(params: Page): js.Promise[ResponsedataArrayany]
  def resolve_bin(bin: String): js.Promise[Response]
}

object Listbanks {
  @scala.inline
  def apply(list_banks: Page => js.Promise[ResponsedataArrayany], resolve_bin: String => js.Promise[Response]): Listbanks = {
    val __obj = js.Dynamic.literal(list_banks = js.Any.fromFunction1(list_banks), resolve_bin = js.Any.fromFunction1(resolve_bin))
    __obj.asInstanceOf[Listbanks]
  }
}

