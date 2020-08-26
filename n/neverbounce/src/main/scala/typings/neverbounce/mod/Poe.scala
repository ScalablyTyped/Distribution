package typings.neverbounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Poe extends js.Object {
  def confirm(email: String, result: String, confirmationToken: String, transactionId: String): js.Promise[Response] = js.native
}

object Poe {
  @scala.inline
  def apply(confirm: (String, String, String, String) => js.Promise[Response]): Poe = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction4(confirm))
    __obj.asInstanceOf[Poe]
  }
  @scala.inline
  implicit class PoeOps[Self <: Poe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfirm(value: (String, String, String, String) => js.Promise[Response]): Self = this.set("confirm", js.Any.fromFunction4(value))
  }
  
}

