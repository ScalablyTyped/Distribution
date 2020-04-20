package typings.nodeJose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decryptor extends js.Object {
  def decrypt(input: String): js.Promise[DecryptResult]
}

object Decryptor {
  @scala.inline
  def apply(decrypt: String => js.Promise[DecryptResult]): Decryptor = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt))
    __obj.asInstanceOf[Decryptor]
  }
}

