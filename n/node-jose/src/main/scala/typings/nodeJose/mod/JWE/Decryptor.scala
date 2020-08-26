package typings.nodeJose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decryptor extends js.Object {
  def decrypt(input: String): js.Promise[DecryptResult] = js.native
}

object Decryptor {
  @scala.inline
  def apply(decrypt: String => js.Promise[DecryptResult]): Decryptor = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt))
    __obj.asInstanceOf[Decryptor]
  }
  @scala.inline
  implicit class DecryptorOps[Self <: Decryptor] (val x: Self) extends AnyVal {
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
    def setDecrypt(value: String => js.Promise[DecryptResult]): Self = this.set("decrypt", js.Any.fromFunction1(value))
  }
  
}

