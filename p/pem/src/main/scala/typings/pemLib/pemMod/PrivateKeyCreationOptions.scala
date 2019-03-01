package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyCreationOptions extends js.Object {
  var cipher: PrivateKeyCipher
  var password: java.lang.String
}

object PrivateKeyCreationOptions {
  @scala.inline
  def apply(cipher: PrivateKeyCipher, password: java.lang.String): PrivateKeyCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[PrivateKeyCreationOptions]
  }
}

