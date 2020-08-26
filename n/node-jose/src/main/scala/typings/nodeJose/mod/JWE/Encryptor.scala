package typings.nodeJose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encryptor extends js.Object {
  def `final`(): js.Promise[String] = js.native
  def update(input: js.Any): this.type = js.native
}

object Encryptor {
  @scala.inline
  def apply(`final`: () => js.Promise[String], update: js.Any => Encryptor): Encryptor = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
    __obj.asInstanceOf[Encryptor]
  }
  @scala.inline
  implicit class EncryptorOps[Self <: Encryptor] (val x: Self) extends AnyVal {
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
    def setFinal(value: () => js.Promise[String]): Self = this.set("final", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: js.Any => Encryptor): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

