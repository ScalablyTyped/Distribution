package typings.neverbounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poe extends js.Object {
  def confirm(email: String, result: String, confirmationToken: String, transactionId: String): js.Promise[Response]
}

object Poe {
  @scala.inline
  def apply(confirm: (String, String, String, String) => js.Promise[Response]): Poe = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction4(confirm))
    __obj.asInstanceOf[Poe]
  }
}

