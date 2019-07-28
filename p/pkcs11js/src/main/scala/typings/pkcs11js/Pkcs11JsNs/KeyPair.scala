package typings.pkcs11js.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var privateKey: Handle
  var publicKey: Handle
}

object KeyPair {
  @scala.inline
  def apply(privateKey: Handle, publicKey: Handle): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[KeyPair]
  }
}

