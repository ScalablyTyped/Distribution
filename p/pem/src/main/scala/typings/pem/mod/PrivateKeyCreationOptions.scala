package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyCreationOptions extends js.Object {
  var cipher: PrivateKeyCipher
  var password: String
}

object PrivateKeyCreationOptions {
  @scala.inline
  def apply(cipher: PrivateKeyCipher, password: String): PrivateKeyCreationOptions = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrivateKeyCreationOptions]
  }
}

